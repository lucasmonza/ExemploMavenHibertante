package br.com.db1.dao.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.db1.dao.DAO;
import br.com.db1.start.classes.Cidade;

public class CidadeDao implements DAO<Cidade>{

	private EntityManager entityManager;
	
	@Inject
	public CidadeDao(EntityManager manager) {
		this.entityManager = manager;
	}

	public List<Cidade> findAll() {
		return entityManager.
				createQuery("select c from cidade c").
				getResultList();
	}

	public Cidade findById(Integer id) {
		return (Cidade) entityManager.
				createQuery("select c from cidade c where id = :pId").
				setParameter("pId", id).
				getSingleResult();
	}

	public List<Cidade> findByName(String name) {
		return null;
	}

	public boolean save(Cidade t) {
		return false;
	}

	public boolean delete(Integer id) {
		return false;
	}

}
