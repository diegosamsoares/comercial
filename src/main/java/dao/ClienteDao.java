package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import modelo.Cliente;

public class ClienteDao {

	private JPAUtil jpa;
	private EntityManager em = null;

	public ClienteDao() {
		this.jpa = new JPAUtil();
	}

	public void salva(Cliente cliente) {
	     EntityTransaction tx = null;
		 em = jpa.getEntityManager();
         tx = em.getTransaction();
         tx.begin();
         em.persist(cliente);
         tx.commit();
         em.close();
	}

	public List<Cliente> listaTodos() {

		try {
			return jpa.getEntityManager().createQuery("select c from Cliente c", Cliente.class).getResultList();
		} finally {
			jpa.getEntityManager().close();
		}

	}
}
