package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.CustomerBO;

@Repository("oraDAO")
public final class OracleCustomerDAOImpl implements ICustomerDAO {
	private  static final String  CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER VALUES(CUST_NO_SEQ.NEXTVAL,?,?,?,?)";
	 //HAS -A property
	@Autowired
	private  DataSource ds;
	
	

	@Override
	public int insert(CustomerBO custBO) throws Exception {
	  System.out.println("OracleCustomerDAOImpl.insert()");
	  int count=0;
	    //get Pooled  JDBC Connection
	     try(Connection con=ds.getConnection();
	    		 PreparedStatement ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);		 ){
	    	   if(ps!=null) {
		    	   //set values to query param  by collecting the data from BO class obj
	    		   ps.setString(1,custBO.getCname());
	    		   ps.setString(2, custBO.getCadd());
	    		   ps.setDouble(3,custBO.getPamt());
	    		   ps.setDouble(4, custBO.getIntramt());
	    		   //execute the Query
	    		   count=ps.executeUpdate();
	    	   }//if
	     }//try
	  	   catch(SQLException se) {
	   		   se.printStackTrace();
	  		   throw se;
	   	   }
	   	   catch(Exception e) {
	   		   e.printStackTrace();
	   		   throw e;
	   	   }
		return count;
	}//method
}//class
