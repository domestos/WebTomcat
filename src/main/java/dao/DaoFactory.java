package dao;

import javax.persistence.*;


import impl.ImplDaoCartridge;
import impl.ImplDaoCompany;



public class DaoFactory {

	private static DaoFactory instance;

	private DaoCompany daoCompany;
	
	private DaoCartridge daoCartridge;
	
	private EntityManager em;
	
	private EntityManagerFactory factory ;

	public DaoFactory() {
		try {
			factory = Persistence.createEntityManagerFactory("connect1");
			if (factory == null){System.out.println("not creat");}
		} catch (Exception e) {
			System.out.println("config file absend");
			e.printStackTrace();
			
		}
		
		em = factory.createEntityManager();
		daoCartridge = new ImplDaoCartridge(em);
		daoCompany = new ImplDaoCompany(em); 
	}
	
	

	public static DaoFactory getInstance() {
		if(instance == null){
			instance = new DaoFactory();
		}
		
		return instance;
	}


	public DaoCompany getDaoCompany() {
		return daoCompany;
	}

	
	public DaoCartridge getDaoCartridge() {
		return daoCartridge;
	}
	
	
	public void closeEM(){
		if(em.isOpen()){
			em.clear();
		}
		if (factory.isOpen()){
			factory.close();
		}
	}
		
	}//end class

		
	
	
	
	

