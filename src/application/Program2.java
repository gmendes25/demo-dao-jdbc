package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		List<Department> list = new ArrayList<>();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("== INSERT TEST");
		Department dep = new Department(5, "Games");
		departmentDao.insert(dep);
		System.out.println("== FIND BY ID TEST ==");
		dep = departmentDao.findById(4);
		System.out.println(dep);
		System.out.println("== FIND ALL TEST ==");
		list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		System.out.println("== DELETE TEST == ");
		departmentDao.deleteById(5);
		list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		System.out.println("== UPDATE TEST == ");
		departmentDao.update(new Department(2, "Games"));
		list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
	}
}