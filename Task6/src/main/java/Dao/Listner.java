package Dao;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

			



public class Listner implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
    	ServletContext sc=sce.getServletContext();
    	DataBaseUtil baseUtil=new DataBaseUtil();
    	sc.setAttribute("sqlEmployee", baseUtil);
    	     		
    }
    public void contextDestroyed(ServletContextEvent sce)  { 
    	  try {
			DataBaseUtil.connection.close();
            System.out.println("DataBase Connection is closed ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	        System.out.println("Unable to close the connection");

		}
          
      


   }
	
}
