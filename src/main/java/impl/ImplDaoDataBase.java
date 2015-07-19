package impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;


import dao.DaoDataBase;

public abstract class ImplDaoDataBase<T> implements DaoDataBase<T> {
	
	protected EntityManager em;
	
	public ImplDaoDataBase(EntityManager em){
		this.em = em;
	} 
	
	
	public void insert(T c) throws SQLException{
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}
	
	public void delete(T c) throws SQLException{
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}
	
	public T findId(int id){
		return em.find(getEntityClass(), id);		
	}
	
	
		
	@SuppressWarnings("unchecked")
	protected final Class<T> getEntityClass() {
		final Type type = getClass().getGenericSuperclass() instanceof ParameterizedType ? getClass().getGenericSuperclass()
				: getClass().getSuperclass().getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			final ParameterizedType paramType = (ParameterizedType) type;
			return (Class<T>) paramType.getActualTypeArguments()[0];
		} else
			throw new IllegalArgumentException("Could not guess entity class by reflection");
	}
	
}
