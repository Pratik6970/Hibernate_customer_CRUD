package com.sunbeam;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Hibernate35main {

	public static void main(String[] args) {
		
		
		SessionFactory factory=HbUtil.getsessionfactory();
		Session session=factory.openSession();
		
		/*
		//select
		
		Customer c = session.get(Customer.class, 1);
		System.out.println("customer found "+c);
		System.out.println("Select Record Sucessfully");
       */
		
		//insert
		 //id | name    | email          | password | reg_amt | reg_date   | role
		/*
		Customer c1 = new Customer();
		c1.setId(10);
		c1.setName("Vaibhav");
		c1.setEmail("vaibhav123@gmail.com");
		c1.setPassword("5683");
		c1.setReg_amt(491.00);
		c1.setReg_date(new Date(2021 - 1900, 2, 4)); 
		c1.setRole("customer");
		if(c1!=null)
		{
			Transaction tx=null;
			try {
				
				tx=session.beginTransaction();
				session.save(c1);
				System.out.println("Record sucessfully inserted!!!!");
				tx.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
		}
		*/
		
		
		//update
		
		/*
		Customer c3 = session.get(Customer.class, 8);
		if(c3!=null)
		{
			Transaction tx = null;
			try {
				
				tx=session.beginTransaction();
				c3.setName("Ravindra");
				session.update(c3);
				tx.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
		}*/
		
		
		//delete
		/*
		Customer c = session.get(Customer.class, 8);
		if(c!=null)
		{
			Transaction tx = null;
			try {
				
				tx=session.beginTransaction();
				session.delete(c);
				System.out.println("Deleted suceesfully user");
				tx.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
			}
		}
		*/
		
		
		//List of user
		
		try {
			
			String hql = "from Customer c";
			List<Customer>customers=session.createQuery(hql,Customer.class).getResultList();
			System.out.println("List Of Customers are ");
			
			for(Customer c2 :customers)
			{
				System.out.println(c2);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
