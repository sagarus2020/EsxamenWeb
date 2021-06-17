package co.ufps.dao;

import javax.persistence.EntityManager;

import co.ufps.entity.Usuario;
import co.ufps.util.ConexionMySQL;

public class typeDao extends ConexionMySQL implements GenericDao{

	public typeDao() {
		super(Usuario.class);
	}
	
	
}