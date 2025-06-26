package net.fcf.empleos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.fcf.empleos.model.Vacante;
import net.fcf.empleos.service.IVacantesService;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {

	@Autowired
	private IVacantesService serviceVacantes;
	
	@GetMapping("/index")
	public String index(Model model) {
		List<Vacante> lista = serviceVacantes.buscarTodas();
		model.addAttribute("vacantes", lista);
		return "vacantes/listVacantes";
		
	}

	@GetMapping("/create")
	public String create(Vacante vacante) {
		return "vacantes/formVacante";
	}
	

	// Método para almacenar los datos del formulario, usamos el bidingResult para los errores y el redirectAttribute para el flash y pasar a la vista mensaje sin pasar los datos
	@PostMapping("/save")
	public String store(Vacante vacante, BindingResult result, Model model, RedirectAttributes attributes) {
		
		// En caso de errores de validación de formulario
		if (result.hasErrors()) {
			
			// Desplegamos los errores
			for (ObjectError error : result.getAllErrors()) {
				System.out.println("Ocurrió un error: " + error.getDefaultMessage());
			}
			return "vacantes/formVacante";
		}
		
		serviceVacantes.save(vacante);
		attributes.addFlashAttribute("msg", "Registro guardado");
		System.out.println("Nombre Vacante: " + vacante);

		return "redirect:/vacantes/index";
	}
	

	@GetMapping("/view/{id}")
	public String verDetalles(@PathVariable("id") int idVacante, Model model) {

		// Cogemos el id del vacante
		Vacante vacante = serviceVacantes.buscarPorId(idVacante);

		// System.out.println("Vacante: " + idVacante);
		model.addAttribute("vacante", vacante);
		return "detalle";

	}

	@GetMapping("/delete")
	// Obtengo el id por URL y lo muestro en el mensaje mandandolo a la vista
	// templates
	public String delete(@RequestParam("id") int idVacante, Model model) {
		System.out.println("Borrando vacante con id: " + idVacante);
		model.addAttribute("id", idVacante);
		return "mensaje";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
}
