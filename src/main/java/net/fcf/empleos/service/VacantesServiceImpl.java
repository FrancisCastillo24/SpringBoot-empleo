package net.fcf.empleos.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.fcf.empleos.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacantesService {
	
	private List<Vacante> lista = null;

	public VacantesServiceImpl() {

		// Instancia de clase para dar formato a la fecha tipo Date
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		// Creamos una lista de vacantes
		lista = new LinkedList<Vacante>();

		try {

			// Creo la oferta de trabajo 1
			Vacante vacante1 = new Vacante();

			vacante1.setId(1);
			vacante1.setName("Ingeniero Civil");
			vacante1.setDescription("Se solicita ingeniero para diseñar puente peatonal");
			vacante1.setDate(sdf.parse("08-02-2019"));
			vacante1.setSalary(1200.0);
			vacante1.setFeatured(1);
			vacante1.setImage("empresa1.png");

			// Vacante 2
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setName("Diseñador Gráfico");
			vacante2.setDescription("Diseño de materiales publicitarios y branding corporativo");
			vacante2.setDate(sdf.parse("15-03-2019"));
			vacante2.setSalary(950.0);
			vacante2.setFeatured(1);
			vacante2.setImage("empresa2.png");

			// Vacante 3
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setName("Programador Java");
			vacante3.setDescription("Desarrollo de aplicaciones backend con Spring Boot");
			vacante3.setDate(sdf.parse("22-04-2019"));
			vacante3.setSalary(1600.0);
			vacante3.setFeatured(0);
			vacante3.setImage("empresa3.png");

			// Vacante 4
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setName("Administrador de Sistemas");
			vacante4.setDescription("Gestión de servidores Linux y redes corporativas");
			vacante4.setDate(sdf.parse("10-05-2019"));
			vacante4.setSalary(1400.0);
			vacante4.setFeatured(0);
			vacante4.setImage("empresa4.png");

			// Vacante 5
			Vacante vacante5 = new Vacante();
			vacante5.setId(5);
			vacante5.setName("Contador");
			vacante5.setDescription("Responsable del área contable y fiscal");
			vacante5.setDate(sdf.parse("18-06-2019"));
			vacante5.setSalary(1100.0);

			// Vacante 6
			Vacante vacante6 = new Vacante();
			vacante6.setId(6);
			vacante6.setName("Marketing Digital");
			vacante6.setDescription("Campañas de publicidad en redes sociales y SEO");
			vacante6.setDate(sdf.parse("25-07-2019"));
			vacante6.setSalary(1000.0);

			// Vacante 7
			Vacante vacante7 = new Vacante();
			vacante7.setId(7);
			vacante7.setName("Abogado Corporativo");
			vacante7.setDescription("Asesoría legal y elaboración de contratos");
			vacante7.setDate(sdf.parse("01-08-2019"));
			vacante7.setSalary(1700.0);

			// Vacante 8
			Vacante vacante8 = new Vacante();
			vacante8.setId(8);
			vacante8.setName("Técnico en Mantenimiento");
			vacante8.setDescription("Mantenimiento preventivo y correctivo de maquinaria");
			vacante8.setDate(sdf.parse("12-09-2019"));
			vacante8.setSalary(900.0);

			// Vacante 9
			Vacante vacante9 = new Vacante();
			vacante9.setId(9);
			vacante9.setName("Recepcionista");
			vacante9.setDescription("Atención al cliente y gestión de llamadas");
			vacante9.setDate(sdf.parse("20-10-2019"));
			vacante9.setSalary(800.0);

			// Vacante 10
			Vacante vacante10 = new Vacante();
			vacante10.setId(10);
			vacante10.setName("Arquitecto");
			vacante10.setDescription("Diseño de planos y supervisión de obra");
			vacante10.setDate(sdf.parse("30-11-2019"));
			vacante10.setSalary(1500.0);

			// Agrego los 4 objetos de tipo Vacante a la lista
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);

		} catch (ParseException e) {
			// Lanzamos un error
			System.out.println("Error: " + e.getMessage());
		}
		
	}

	@Override
	public List<Vacante> buscarTodas() {
		// Mando la lista completa
		return lista;
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {
		
		for (Vacante cadaVacante : lista){
			
			// Si el id del vacante coincide con el id pasado por la url, lo devuelve
			if(cadaVacante.getId() == idVacante) {
				return cadaVacante;
			}
			
		}
		
		return null;
	}

}
