import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DaoCartridge;
import dao.DaoCompany;
import dao.DaoFactory;
import database.Cartridge;
import database.Company;

public class Main {
	public static void main(String[] args) throws SQLException {
		
						
		DaoCartridge daoCartridge = new DaoFactory().getDaoCartridge();
		
		DaoCompany daoCompany = new DaoFactory().getDaoCompany();
		
		List<Cartridge> listCartridges = new ArrayList<Cartridge>();
		
		Company company = new Company("DZK Compnay", listCartridges );
		
		Cartridge caretridge = new Cartridge("Samsung scx-4100", "number link 01", "rqLink", company);
		Cartridge caretridge1 = new Cartridge("Samsung scx-4200", "number link 02", "rqLink", company);
		Cartridge caretridge2 = new Cartridge("Samsung scx-4300", "number link 03", "rqLink", company);
		Cartridge caretridge3 = new Cartridge("Samsung scx-4600", "number link 04", "rqLink", company);
		
		
		listCartridges.add(caretridge); 
		listCartridges.add(caretridge1);
		listCartridges.add(caretridge2);
		listCartridges.add(caretridge3);
		
		
		System.out.println(company);
		
		//daoCompany.insert(company);
				
	}
}
