package net.fcf.empleos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.fcf.empleos.model.Categoria;
import net.fcf.empleos.service.ICategoriasService;

@Controller
@RequestMapping(value="/categorias")
public class CategoriasController {
	
	@Autowired
	private ICategoriasService serviceCategorias;
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(Model model) {
		List<Categoria> lista = serviceCategorias.buscarTodas();
		model.addAttribute("categorias", lista);
		return "categorias/listCategoria";
	}
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String create() {
		return "categorias/formCategoria";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	// Recibimos los datos del formulario por parámetro
	public String save(Categoria categoria, BindingResult result, RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			System.out.println("Existieron errores");
			return "categorias/listCategoria";
		}
		
		// Guadamos el objeto categoria en la bd
		serviceCategorias.save(categoria);
		attributes.addFlashAttribute("msg", "Los datos de la categoría fueron guardados!");		
		return "redirect:/categorias/index";
	}
}
