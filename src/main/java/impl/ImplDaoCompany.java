package impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

import dao.DaoCompany;

public class ImplDaoCompany  extends ImplDaoDataBase implements DaoCompany {

	public ImplDaoCompany(EntityManager em) {
		super(em);
	}

	public List findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
