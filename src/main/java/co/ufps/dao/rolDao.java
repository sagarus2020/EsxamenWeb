package co.ufps.dao;

import co.ufps.entity.Rol;
import co.ufps.entity.Usuario;
import co.ufps.util.ConexionMySQL;

public class rolDao extends ConexionMySQL implements GenericDao{

	public rolDao() {
		super(Rol.class);
	}
	
	
}