package net.fcf.empleos.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.fcf.empleos.model.Vacante;
import net.fcf.empleos.service.IVacantesService;

@Controller
public class HomeController {
	
	@Autowired
	private IVacantesService serviceVacantes;

	@GetMapping("/")
	public String mostrarHome(Model model) {
		
		// Creo la lista vacantes para mostrar el listado
		List<Vacante> lista = serviceVacantes.buscarTodas();
		
		// Lo añado a la vista como vacantes
		model.addAttribute("vacantes", lista);

		return "home";
	}

	@GetMapping("/listado")
	public String mostrarListado(Model model) {

		// Creamos una lista
		List<String> lista = new LinkedList<String>();

		// Voy metiendo los datos a la lista
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de Contabilidad");
		lista.add("Enfermería");
		lista.add("Ingeniero Aeroespacial");
		lista.add("Arquitecto");

		model.addAttribute("empleos", lista);

		return "listado";

	}

	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {

		// Instancio el objeto Vacante
		Vacante vacante = new Vacante();

		// Inserto datos
		vacante.setName("Ingeniero de comunicaciones");
		vacante.setDescription("Se solicita ingeniero para dar soporte a intranet");
		vacante.setDate(new Date());
		vacante.setSalary(9700.0);

		// Lo almacenamos en la variable vacante
		model.addAttribute("vacante", vacante);

		// Retornamos la vista los datos
		return "detalle";
	}

	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		
		// Creo la lista vacantes para mostrar el listado
		List<Vacante> lista = serviceVacantes.buscarTodas();
		
		// Lo añado a la vista como vacantes
		model.addAttribute("vacantes", lista);
		
		return "tabla";
	}

}
