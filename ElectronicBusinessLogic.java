package com.prodapt.services;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.prodapt.entity.ElectronicShop;
import com.prodapt.helper.ElectronicDBConnect;

public class ElectronicBusinessLogic {
        
	public void CreateRecord() {
		Session session = ElectronicDBConnect.setUp();
		
		ElectronicShop e1 = new ElectronicShop(100, "Mobiles", 25000);
		ElectronicShop e2 = new ElectronicShop(200, "Laptops", 125000);
		ElectronicShop e3 = new ElectronicShop(300, "EarPhones", 1800);
		ElectronicShop e4 = new ElectronicShop(400, "Chargers", 25000);
		ElectronicShop e5 = new ElectronicShop(500, "CPU", 25000);

		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
        session.close();
	}

	
	public void update() {

		
			Session session = ElectronicDBConnect.setUp();
	        Transaction t = session.beginTransaction();
	        Query q=session.createQuery("update ElectronicShop set name=:a1 where id=:a2");
	        q.setParameter("a1","Speakers");     //record 10
	        q.setParameter("a2",600);

	        int status=q.executeUpdate();
	        System.out.println(status);
	        t.commit();
	        session.close();
		}



	public void delete() {

		Session session = ElectronicDBConnect.setUp();
		Transaction tx2 = session.beginTransaction();
		Query q1 = session.createQuery("delete ElectronicShop where id=:a1");

		q1.setParameter("a1", 40);

		int status1 = q1.executeUpdate();
		System.out.println(status1);
		tx2.commit();
		session.close();

	}
	
	public void Display() {
		
			Session session = ElectronicDBConnect.setUp();
			System.out.println("Display all Items available");
	        Query query=session.createQuery("from ElectronicShop");//here persistent class name is Emp  
	        List<ElectronicShop> list=(List<ElectronicShop>) query.list();
	        for (ElectronicShop es : list) {
				System.out.println(es);
			}
	        session.close();
		
		}
	}


