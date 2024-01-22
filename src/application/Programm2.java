package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import models.entities.Department;

public class Programm2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println(" ");
		
		List<Department> listDepartment = departmentDao.findAll();
		for(Department listDep : listDepartment) {
			System.out.println(listDep);
		}
		
		System.out.println(" ");  
		
//		Department newDep = new Department(null, "Bruno");
//		departmentDao.insert(newDep);
//		System.out.println("Done! New Id: " + newDep.getId());
		
		System.out.println(" ");  
		
		dep = departmentDao.findById(7);
		dep.setName("Market");
		departmentDao.update(dep);
		System.out.println("Updated!");
		
		System.out.println(" ");  
		
		Integer id = 9;
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
	}
	
}
