package net.fcf.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/categorias")
public class CategoriasController {
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(Model model) {
		return "categorias/listCategoria";
	}
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String create() {
		return "categorias/formCategoria";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	// Recibimos los datos del formulario por parámetro
	public String save(@RequestParam("name") String nombre, @RequestParam("description") String description) {
		System.out.println("Categoria: " + nombre);
		System.out.println("Categoria: " + description);
		
		return "categorias/listCategoria";
	}
}
