package mx.aztk.hm.controllers.crud;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.aztk.hm.bussiness.Crud;
import mx.aztk.hm.bussiness.RegistroCrud;
import mx.aztk.hm.util.jqgrid.JQGridModel;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import net.sf.json.JSONSerializer;

public class CrudLoad extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView modelAndView = new ModelAndView("crud/crudLoad");
		
		Crud bussinesCrud = new Crud();
		List<Map<String, String>> registros = new ArrayList<Map<String, String>>();
		for (RegistroCrud registro : bussinesCrud.getRegistros()){
			Map<String, String> map = new LinkedHashMap<String, String>();
			map.put("id", registro.getId().toString());
			map.put("nombre", registro.getNombre());
			map.put("descripcion", registro.getDescripcion());
			map.put("estatus", registro.getEstatus());
			registros.add(map);
		}
		JQGridModel modelo = new JQGridModel(
				registros.size(), 
				registros.size(), 
				1, 
				registros);
		modelAndView.addObject("gridData", JSONSerializer.toJSON(modelo));
		return modelAndView;
	}

}
