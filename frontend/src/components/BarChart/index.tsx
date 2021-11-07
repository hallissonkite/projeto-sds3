import { useEffect, useState } from 'react';
import axios from "axios";
import Chart from 'react-apexcharts';
import { SaleSucess } from 'types/sale';
import { round } from 'Utils/format';
import { BASE_URL } from 'Utils/Requests';

type SeriesData = {

    name: String;
    data: number[];

}


type chartData = {
    labels: {
        categories: string[];
    };
    series: SeriesData[];
}


const BarCharts = () => {

    const [chartData, setChartData] = useState<chartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []
            }
        ]
    });
    useEffect(() => {

        axios.get(`${BASE_URL}/sales/sucess-by-seller`)
            .then((response) => {
                const data = response.data as SaleSucess[];
                const myLabels = data.map(x => x.sellerName);
                const mySeries = data.map(x => round(100.0 * x.deals / x.visited, 1));

                setChartData({
                    labels: {
                        categories: myLabels
                    },
                    series: [
                        {
                            name: "",
                            data: mySeries
                        }
                    ]
                });

            });
    }, []);






    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    return (
        <Chart
            options={{ ...options, xaxis: chartData.labels }}
            series={chartData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarCharts;
