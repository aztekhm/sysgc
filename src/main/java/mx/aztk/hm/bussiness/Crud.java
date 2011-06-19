package mx.aztk.hm.bussiness;

import java.util.List;
import mx.aztk.hm.daos.CrudDao;

public class Crud {
	public List<RegistroCrud> getRegistros(){
		return new CrudDao().getRegistros();
	}
}
