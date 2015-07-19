package impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

import dao.DaoCartridge;

public class ImplDaoCartridge extends ImplDaoDataBase implements DaoCartridge {

	public ImplDaoCartridge(EntityManager em) {
		super(em);
		
	}

	public List findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
