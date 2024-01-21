package application;

import java.util.Date;

import model.dao.DaoFactory;
import models.entities.Department;
import models.entities.Seller;

public class Programm {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Gym");
		System.out.println(obj);
		
		Seller obj1 = new Seller(1, "Vinicius", "vinicius@", new Date(), 2000.0, obj);
		System.out.println(obj1);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	

	}

}
