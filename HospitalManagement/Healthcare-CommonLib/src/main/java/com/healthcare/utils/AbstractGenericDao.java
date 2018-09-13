package com.healthcare.utils;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;


@SuppressWarnings("unchecked")
public abstract class AbstractGenericDao<E> implements GenericDao<E> {
	private final Class<E> entityClass;
	
	boolean result;

	public AbstractGenericDao() {
		
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[0];
	}
	
	@Autowired
	private SessionFactory hibernate4AnnotatedSessionFactory;

	Session session;
	
	public Session getSession() 
	{
		return hibernate4AnnotatedSessionFactory.openSession();
	}

	public E findById(final Serializable id) {
		
		E entity = null;
		Transaction tx = null;
		Session session = null;
		try{
			
		session = getSession();
		tx = session.beginTransaction();
		entity = (E) session.get(this.entityClass, id);
		tx.commit();
		
		} catch(Exception exception){
			exception.printStackTrace();
			tx.rollback();
		} finally{
			session.close();
		}
		
		return entity;
	}

	public Serializable save(E entity) 
	{ 
		session = getSession();
		session.beginTransaction();
		session.persist(entity);
		session.getTransaction().commit();
		result=session.beginTransaction().wasCommitted();
		
		
		if(result==false)
		{
			session.close();
			return 1L;
		}
		else
		{
			session.close();
			return -1L;
		}
	}

	public Long update(E entity) 
	{
		session = getSession();
		session.saveOrUpdate(entity);
		result = beginTransaction(session);
		if(result==false)
		{
			session.close();
			return 1L;
		}
		else
		{
			session.close();
			return -1L;
		}
		
	}

	public boolean deletebyId(final Serializable id) 
	{
		E entity = null;
		Transaction tx = null;
		Session session = null;
		try{
			
		session = getSession();
		tx = session.beginTransaction();
		E e = findById(id);
		session.delete(e);
		tx.commit();
		result = tx.wasCommitted();
		//result=session.beginTransaction().wasCommitted();
		
		}catch(Exception exception){
			exception.printStackTrace();
			tx.rollback();
		}
		
		finally{
			session.close();
		}
		
		return result;
		
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
