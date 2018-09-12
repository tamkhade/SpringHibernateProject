package com.kcs.genericDao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;



@SuppressWarnings("unchecked")
public abstract class AbstractGenericDao<E> implements GenericDao<E> {
	private final Class<E> entityClass;
	
	
	
	public AbstractGenericDao() {
		
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[0];
	}
	
	@Autowired
	private SessionFactory sessionFactory;

	Session session;
	
	protected Session getSession() 
	{
		return sessionFactory.openSession();
	}

	public E findById(final Serializable id) {
		return (E) getSession().get(this.entityClass, id);
	}

	public Serializable save(E entity) {
		return getSession().save(entity);
	}

	public boolean update(E entity) 
	{
		session = getSession();
		session.saveOrUpdate(entity);
		boolean result = beginTransaction(session);
		if(result==false)
		{
			flush();
			clear();
			session.close();
			return true;
		}
		else
		{
			flush();
			clear();
			session.close();
			return false;
		}
		
	}

	public boolean deletebyId(final Serializable id) 
	{
		session = getSession();
		E e = findById(id);
		session.delete(e);
		boolean result = beginTransaction(session);
		if(result==false)
		{
			flush();
			clear();
			session.close();
			return true;
		}
		else
		{
			flush();
			clear();
			session.close();
			return false;
		}
		
	}
	
	public void delete(E entity) 
	{
		
		getSession().delete(entity);
	}
	
	public void deleteAll() 
	{
		List<E> entities = findAll();
		for (E entity : entities) {
			getSession().delete(entity);
		}
	}

	public List<E> findAll() {
		return getSession().createCriteria(this.entityClass).list();
	}

	public List<E> findAllByExample(E entity) {
		Example example = Example.create(entity).ignoreCase().enableLike().excludeZeroes();
		return getSession().createCriteria(this.entityClass).add(example).list();
	}

	public void clear() {
		getSession().clear();

	}

	public void flush() {
		getSession().flush();

	}
	
	public boolean beginTransaction(Session sessions)
	{
		sessions.beginTransaction().commit();
		return sessions.beginTransaction().wasCommitted();
	}
}
