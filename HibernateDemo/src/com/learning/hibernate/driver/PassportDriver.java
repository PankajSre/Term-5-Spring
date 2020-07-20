package com.learning.hibernate.driver;

import java.util.List;

import com.learning.hibernate.dao.PassportDAO;
import com.learning.hibernate.dao.impl.PassportDAOImpl;
import com.learning.hibernate.model.Passport;

public class PassportDriver {

	public static void main(String[] args) {
		
		PassportDAO passportDAO = new PassportDAOImpl();
		
		int choice = 2;
		switch(choice) {
		
		case 1: 
			Passport passport = new Passport("HDSCV6543U", "Mumbai");
			passportDAO.savePassport(passport);
			
			break;
			
		case 2: 
			Passport pass = passportDAO.getPassportbyId(1);
			pass.setAuthority("Bangalore");
			passportDAO.updatePassport(pass);
			break;
		case 3: 
			Passport passp = passportDAO.getPassportbyId(3);
			passportDAO.deletePassport(passp);
			break;
		case 4: 
			Passport getPassport = passportDAO.getPassportbyId(3);
			System.out.println(getPassport);
		    break;
		case 5: 
			List<Passport> passports = passportDAO.getAllPassports();
			
			System.out.println(passports);
			
		case 6:
			System.exit(0);

		default:
			System.out.println("Please Enter a Valid choice");
		
		}
		
	}

}
