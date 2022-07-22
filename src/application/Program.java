package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();		
		
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
		
		Seller sel = new Seller(null, "Greg", "greg@gmail.com", new Date(), 2000.0, dep);
		sellerDao.insert(sel);
		System.out.println("New seller id: " + sel.getId());
	}

}
