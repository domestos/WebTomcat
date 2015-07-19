package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

public interface DaoDataBase<T> {
 
	void insert(T c) throws SQLException;
	
	void delete(T c) throws SQLException;
	
	List<T> findAll() throws SQLException;
	
	T findId(int id) throws SQLException;
	
}
