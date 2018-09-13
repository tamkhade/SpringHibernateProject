package com.healthcare.utils;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;


public interface GenericDao<E> 
{
	
	Session getSession();
	
	/**
	* 
	* @param entity: entity to save
	* @return Identifier of saved entity
	*/
	Serializable save(E entity);
	
	/**
	* 
	* @param entity:entity to save or update
	*/
	public Long update(E entity);
	
	/**
	* 
	* @param entity: entity to delete
	*/
	void delete(E entity);
	
	boolean deletebyId(Serializable id);
	/**
	* Delete all records
	*/
	void deleteAll();
	
	/**
	* Find all records
	* @return
	*/
	List<E> findAll();
	
	/**
	* Find all records matching provided entity
	* @param entity: entity object used for search
	* @return
	*/
	List<E> findAllByExample( E entity );
	
	/**
	* Find by primary key
	* @param id
	* @return unique entity 
	*/
	E findById( Serializable id );
	
	/**
	* Clear session
	*/
	void clear();
	
	/**
	* Flush session
	*/
	void flush();
}
