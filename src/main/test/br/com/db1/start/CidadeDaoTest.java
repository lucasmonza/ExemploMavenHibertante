package br.com.db1.start;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.dao.impl.CidadeDao;
import br.com.db1.start.classes.Cidade;

public class CidadeDaoTest extends AbstractTestCase {

	private CidadeDao dao;

	@Before
	public void init() {
		dao = new CidadeDao(manager);
	}

	@Test
	public void findAllTest() {
		Assert.assertTrue(dao.findAll().size() > 0);
		
	}
	
	@Test
	public void findId() {
		Cidade cidade = dao.findById(3);
		Assert.assertEquals("Maringa", cidade.getNome());
	}



}
