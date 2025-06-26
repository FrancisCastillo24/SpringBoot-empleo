package net.fcf.empleos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.fcf.empleos.model.Vacante;
import net.fcf.empleos.service.IVacantesService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	
	@Autowired
	private IVacantesService serviceVacantes;
	
	@GetMapping("/view/{id}")
	public String verDetalles(@PathVariable("id") int idVacante, Model model) {
		
		// Cogemos el id del vacante
		Vacante vacante = serviceVacantes.buscarPorId(idVacante);
		
		//System.out.println("Vacante: " + idVacante);
		model.addAttribute("vacante", vacante);
		return "detalle";
		
	}
	
	@GetMapping("/delete")
	// Obtengo el id por URL y lo muestro en el mensaje mandandolo a la vista templates
	public String delete(@RequestParam("id") int idVacante, Model model) {
		System.out.println("Borrando vacante con id: " + idVacante);
		model.addAttribute("id", idVacante);
		return "mensaje";
	}
}
