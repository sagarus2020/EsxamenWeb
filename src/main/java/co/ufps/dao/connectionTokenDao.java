package co.ufps.dao;

import co.ufps.entity.Connectiontoken;
import co.ufps.entity.Usuario;
import co.ufps.util.ConexionMySQL;

public class connectionTokenDao  extends ConexionMySQL implements GenericDao{

	public connectionTokenDao() {
		super(Connectiontoken.class);
	}
	
	
}