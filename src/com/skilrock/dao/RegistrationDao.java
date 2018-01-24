package com.skilrock.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.io.PrintWriter;
import com.skilrock.bean.RegistrationBean;
import com.skilrock.common.Utility;
public class RegistrationDao {
	// method for inserting data
	public int saveRegistration(RegistrationBean registration){
		Connection con=null;
		int count = 0;
		try{
			con=Utility.getConnection();
			// Sql statement
			String query = " insert into User_Registration(First_Name,Gender,Address,Email,Language,Phone,U_ID,U_Pass)"
			        + " values (?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString (1, registration.getName());
		      preparedStmt.setString (2, registration.getGender());
		      preparedStmt.setString (3, registration.getAddress());
		      preparedStmt.setString (4, registration.getEmail());
			  preparedStmt.setString (5, registration.getLanguage());
		      preparedStmt.setString (6, registration.getPhone());
		      preparedStmt.setString (7, registration.getUserId());
		      preparedStmt.setString (8, registration.getUserpassword());
		      
		      count = preparedStmt.executeUpdate();
		     
		      con.close();
						
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(con!=null) con.close();
			}catch(Exception e){}
		}
		return count;
	}
	
	// method for retrieve data
	public ArrayList<RegistrationBean> retrieveData(){
		
		
		ArrayList<RegistrationBean> bean1=new ArrayList<RegistrationBean>(); 
		Connection con=null;
		ResultSet result=null;
		try{
			con=Utility.getConnection();
			// Sql statement
			String query = " select * from User_Registration";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			result=preparedStmt.executeQuery();
		   
		    while(result.next()){
		    	RegistrationBean registrationbean=new RegistrationBean();
		    	registrationbean.setName(result.getString("First_Name"));
		    	registrationbean.setGender(result.getString("Gender"));
		    	registrationbean.setAddress(result.getString("Address"));
		    	registrationbean.setEmail(result.getString("Email"));
		    	registrationbean.setLanguagee(result.getString("Language"));
		    	registrationbean.setPhone(result.getString("Phone"));
		    	registrationbean.setUserId(result.getString("U_ID"));
		    	registrationbean.setUserpassword(result.getString("U_PASS"));
		    	bean1.add(registrationbean);
		    	
		    }
						
		}catch(Exception e){
		//out.println(e);
		}
		finally{
			try{
				if(con!=null) con.close();
			}catch(Exception e){}
		}
		return bean1;
		
	}
	
	
	
}
