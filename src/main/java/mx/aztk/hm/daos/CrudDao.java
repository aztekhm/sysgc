package mx.aztk.hm.daos;

import java.util.ArrayList;
import java.util.List;
import mx.aztk.hm.bussiness.RegistroCrud;

public class CrudDao {
	public List<RegistroCrud> getRegistros(){
		List<RegistroCrud> registros = new ArrayList<RegistroCrud>();
		registros.add(new RegistroCrud(1, "xxx", "XXXXXXX", "activo"));
		registros.add(new RegistroCrud(2, "zaz", "ZZZAAASSZZZ", "activo"));
		registros.add(new RegistroCrud(1, "yya", "RRRAAAK", "inactivo"));
		return registros;
	}
}
