//CallingPL_SQLFunctionTestRunner
package com.nt.runner;



import java.sql.CallableStatement;
import java.sql.ResultSet;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;



/*CREATE OR REPLACE FUNCTION FX_GET_ACTORS_DATA_BY_PHONES 
(  MOBILENO1 IN NUMBER 
, MOBILENO2 IN NUMBER 
) RETURN SYS_REFCURSOR AS 

  DETAILS SYS_REFCURSOR;
BEGIN
    OPEN DETAILS FOR
      SELECT AID,ANAME,MOBILE_NO FROM ACTOR WHERE MOBILE_NO IN(MOBILENO1,MOBILENO2);
    
  RETURN DETAILS;
END FX_GET_ACTORS_DATA_BY_PHONES;
*/

@Component
public class CallingPL_SQLFunctionTestRunner  implements CommandLineRunner {
  @Autowired
	private EntityManager  manager;
  
	@Override
	public void run(String... args) throws Exception {
		// unwrap Session object
		Session ses=manager.unwrap(Session.class);
		//use  Work(I)  callback interface  to get jdbc con object and to write CallableStatement obj based logic
		// call the PL/SQL procedure or function
		ses.doWork(con->{
			// create CallableStatement obj having query
			CallableStatement cs=con.prepareCall("{?=call   FX_GET_ACTORS_DATA_BY_PHONES(?,?) }");
			//register return,out param with JDBC type   (In params need not to register)
			cs.registerOutParameter(1, OracleTypes.CURSOR);  
			//set values to IN params
			cs.setLong(2, 99999999L);
			cs.setLong(3, 99999991L);
			//call  PL/SQL function
			cs.execute();
			//gather results
			ResultSet rs=(ResultSet)cs.getObject(1);
			//process the ResultSet obj
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3));
			}
		});
		
		
	}//run(-)

}//class
