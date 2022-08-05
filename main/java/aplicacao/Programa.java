package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Cliente;

public class Programa {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(null, "Luan Braz", "06/11/1995", "987587714", "luan@email.com", "Caçapava/SP");
		Cliente c2 = new Cliente(null, "Ariane Braz", "21/12/1994", "994531978", "ari@email.com", "Caçapava/SP");
		Cliente c3 = new Cliente(null, "João Silva", "03/03/1985", "934871458", "jsilva@email.com", "Taubaté/SP");
		Cliente c4 = new Cliente(null, "Agatha", "05/07/2000", "947895862", "agat@email.com", "Pindamonhangaba/SP");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		
		em.getTransaction().commit();
		System.out.println("Cadastrado com sucesso!");
		
		
		em.close();
		emf.close();
	}
}


