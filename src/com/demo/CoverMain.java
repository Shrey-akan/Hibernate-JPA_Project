package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CoverMain {
	
	
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf = con.buildSessionFactory();
		Session s1 = sf.openSession();
		
		Transaction t1 = s1.beginTransaction();
		
		Cover cover = new Cover();
		
		Cover cover1 = new Cover();
		Cover cover2 = new Cover();
		Cover cover3 = new Cover();
		Cover cover4 = new Cover();
		
		cover = s1.get(Cover.class, 1);
		cover1 = s1.get(Cover.class, 2);
		cover2 = s1.get(Cover.class, 3);
		cover3 = s1.get(Cover.class, 4);
		cover4 = s1.get(Cover.class, 5);
		
		t1.commit();
	
		System.out.println(cover);
		System.out.println(cover1);
		System.out.println(cover2);
		System.out.println(cover3);
		System.out.println(cover4);
	
	}
}
