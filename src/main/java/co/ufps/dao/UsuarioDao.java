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
	
	/*public Usuario selectByEmail(String email) {
		EntityManager em = this.conexion.getEm();
		Usuario usuario = (Usuario)em.createQuery("SELECT v FROM usuario v WHERE email='" + email + "'").getSingleResult();
		return usuario;
	}*/
}
