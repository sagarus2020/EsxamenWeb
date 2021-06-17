package co.ufps.dao;

import co.ufps.entity.Seguimiento;
import co.ufps.entity.Usuario;
import co.ufps.util.ConexionMySQL;

public class seguimientoDao  extends ConexionMySQL implements GenericDao{

	public seguimientoDao() {
		super(Seguimiento.class);
	}
	
	
}