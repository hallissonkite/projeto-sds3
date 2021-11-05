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
            <h1 className="text-primary py-3">Lista de Esquemas</h1>
             <div className= "row py-3">
                 <div className="col-sm-6">
                   <h5 className="text-center text-secondary"> Porcentagem de sucessos</h5>
                   <BarCharts/>
                 </div>
                 <div className="col-sm-6">
                   <h5 className="text-center text-secondary"> Porcentagem de sucesso</h5>
                   <DonutChart/>
                 </div>
 
             </div>
            <DataTable/>
       </div>
       <Footer/>
     </>
      
    );
  }
  
  export default Dashboard;