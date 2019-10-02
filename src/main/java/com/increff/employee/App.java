package com.increff.employee;

public class App {

	public static void main(String[] args) throws Exception {

		HibernateUtil.configure();
		EmployeeHibernateApi api = new EmployeeHibernateApi();

		//Delete all employees
		api.deleteAll();
		
		//Creating N employees
		for (int i = 0; i < 5; i++) {
			EmployeePojo p = new EmployeePojo();
			p.setAge(i + 20);
			p.setId(i);
			p.setName("username " + i);
			api.insert(p);
		}
		
		//Get and print all employees
		api.printAll();

	}

}
