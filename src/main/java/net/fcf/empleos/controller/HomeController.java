package net.fcf.empleos.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String mostrarHome(Model model) {
		/*model.addAttribute("mensaje", "Bienvenidos a Empleos App");
		model.addAttribute("fecha", new Date());
		return "home";*/
		
		String nombre = "Auxiliar de Contabilidad";
		Date fechaPub = new Date();
		double salario = 9000;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fechaPub", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);
		
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

}
