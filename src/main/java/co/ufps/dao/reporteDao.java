package co.ufps.dao;

import co.ufps.entity.Reporte;
import co.ufps.entity.Usuario;
import co.ufps.util.ConexionMySQL;

public class reporteDao  extends ConexionMySQL implements GenericDao{

	public reporteDao() {
		super(Reporte.class);
	}
	
	
}