package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();		
		
		System.out.println("Find By Department TEST");
		Department dep = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller x: list) {
			System.out.println(x);
		}
		
		System.out.println("FindAll TEST");
		
		list = sellerDao.findAll();
		
		for(Seller x: list) {
			System.out.println(x);
		}
		
		System.out.println("TEST UPDATE");
		Seller sel = sellerDao.findById(7);
		sel.setBaseSalary(4500.0);
		sellerDao.update(sel);
		System.out.println("Update complete! ");
		
		System.out.println("-- TEST Delete --");
		
		sellerDao.deleteById(9);
		
		list = sellerDao.findAll();
		
		for(Seller x: list) {
			System.out.println(x);
		}
		
		
	}

}
