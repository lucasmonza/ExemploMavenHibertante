package br.com.db1.start;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import br.com.db1.start.classes.Cidade;
import br.com.db1.start.classes.Endereco;
import br.com.db1.start.tipos.TipoEndereco;
import br.com.db1.start.tipos.TipoLogradouro;

public class EnderecoTest {

	@Test
	public void insertTest() {
		Cidade cidade = new Cidade();
		cidade.setId(9);
		
		Endereco endereco = new Endereco();
		endereco.setTipoLogradouro(TipoLogradouro.AVENIDA);
		endereco.setLogradouro("exemplo");
		endereco.setNumero("0123");
		endereco.setTipoEndereco(TipoEndereco.TRAMPO);
		endereco.setCep("800000");
		endereco.setCidade(cidade);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(endereco);
		manager.getTransaction().commit();

		factory.close();
	}
}
