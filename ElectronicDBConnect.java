package com.prodapt.helper;

    import org.hibernate.Session;

	import org.hibernate.SessionFactory;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

	public class ElectronicDBConnect {
	    static public Session setUp() {
	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	    SessionFactory factory = meta.getSessionFactoryBuilder().build();
	    Session session = factory.openSession();
	    return session;
	    }

	}


