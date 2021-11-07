import BarCharts from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutBar";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

const Dashboard = () => {
    return (
        <>
        <NavBar/>
        <div className="container">
            <h1 className="text-primary py-3">DashBoard de Vendas</h1>
             <div className= "row py-3">
                 <div className="col-sm-6">
                   <h5 className="text-center text-secondary">Taxa de sucesso(%)</h5>
                   <BarCharts/>
                 </div>
                 <div className="col-sm-6">
                   <h5 className="text-center text-secondary">Taxa de Sucesso(%)</h5>
                   <DonutChart/>
                 </div>
                 <h1 className="text-primary py-3">Todas as Vendas</h1>
             </div>
            <DataTable/>
       </div>
       <Footer/>
     </>
      
    );
  }
  
  export default Dashboard;