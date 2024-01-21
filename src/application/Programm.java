package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class Programm {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Gym");
		System.out.println(obj);
		
		Seller obj1 = new Seller(1, "Vinicius", "vinicius@", new Date(), 2000.0, obj);
		System.out.println(obj1);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		Department dep = new Department(2, null);
		List<Seller> seller2 = sellerDao.findByDepartment(dep);
		for(Seller seller3 : seller2) {
			System.out.println(seller3);
		}
	

	}

}
