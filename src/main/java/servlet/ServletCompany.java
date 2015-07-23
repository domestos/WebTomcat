package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoCompany;
import dao.DaoFactory;
import database.Cartridge;
import database.Company;

public class ServletCompany extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public ServletCompany() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nCompany = req.getParameter("name_company");
		if (nCompany  != null){
			
		
		DaoCompany daoCompany = new DaoFactory().getDaoCompany();
		
		List<Cartridge> listCartridges = new ArrayList<Cartridge>();
		listCartridges =null;
		Company company = new Company(nCompany , listCartridges );
		
		try {
			daoCompany.insert(company);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				"/view-company.jsp");
		rd.forward(req, resp);
			}
	
	}

}
