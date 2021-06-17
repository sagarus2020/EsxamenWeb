package co.ufps.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import co.ufps.entity.Usuario;
import co.ufps.util.ConexionMySQL;



public class UsuarioDao extends ConexionMySQL implements GenericDao{

	public UsuarioDao() {
		super(Usuario.class);
	}
	Usuario user;
	public Usuario findByUser(String usuario) {

		EntityManager em = this.getEm();

		Usuario u = em.createNamedQuery("Usuario.findByUser",Usuario.class).setParameter("usuario",user).getSingleResult();
		return u;
	}
}
