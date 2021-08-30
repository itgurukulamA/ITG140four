
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Myclass {
	
	static Logger logger = Logger.getLogger(Myclass.class);
	//static Logger logger = Logger.getLogger(Myclass.class.getName());
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		BasicConfigurator.configure();
	
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");//step:1 load driver
		logger.info("Row inserted");
		//step:2 connection
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
		//step:3 create statement
		String str="insert into ITG140 values(3,'surya',23,'surya@hotmail.com','8789671599') ";
		PreparedStatement ps=c.prepareStatement(str);
		int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("row inserted");
			logger.info("Row inserted");
		}
		else
		{
			System.out.println("not");
			logger.info("Row not inserted");
		}
				
	}

}
