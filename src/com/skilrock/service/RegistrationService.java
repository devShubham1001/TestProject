package com.skilrock.service;

import java.util.ArrayList;

import com.skilrock.bean.RegistrationBean;
import com.skilrock.dao.RegistrationDao;

public class RegistrationService {

	public int saveRegistration(RegistrationBean registration){
		RegistrationDao registrationDao = new RegistrationDao();
		return registrationDao.saveRegistration(registration);
	}
	public ArrayList<RegistrationBean> fetchData(){
		RegistrationDao registrationDao = new RegistrationDao();
		return registrationDao.retrieveData();
	}
}
