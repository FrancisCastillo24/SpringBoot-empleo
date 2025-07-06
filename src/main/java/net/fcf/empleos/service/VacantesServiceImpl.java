package net.fcf.empleos.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
			vacante1.setNombre("Ingeniero Civil");
			vacante1.setDescripcion("Se solicita ingeniero para diseñar puente peatonal");
			vacante1.setFecha(sdf.parse("08-02-2019"));
			vacante1.setSalario(1200.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");

			// Vacante 2
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Diseñador Gráfico");
			vacante2.setDescripcion("Diseño de materiales publicitarios y branding corporativo");
			vacante2.setFecha(sdf.parse("15-03-2019"));
			vacante2.setSalario(950.0);
			vacante2.setDestacado(1);
			vacante2.setImagen("empresa2.png");

			// Vacante 3
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Programador Java");
			vacante3.setDescripcion("Desarrollo de aplicaciones backend con Spring Boot");
			vacante3.setFecha(sdf.parse("22-04-2019"));
			vacante3.setSalario(1600.0);
			vacante3.setDestacado(0);
			vacante3.setImagen("empresa3.png");

			// Vacante 4
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Administrador de Sistemas");
			vacante4.setDescripcion("Gestión de servidores Linux y redes corporativas");
			vacante4.setFecha(sdf.parse("10-05-2019"));
			vacante4.setSalario(1400.0);
			vacante4.setDestacado(0);
			vacante4.setImagen("empresa4.png");

			// Vacante 5
			Vacante vacante5 = new Vacante();
			vacante5.setId(5);
			vacante5.setNombre("Contador");
			vacante5.setDescripcion("Responsable del área contable y fiscal");
			vacante5.setFecha(sdf.parse("18-06-2019"));
			vacante5.setSalario(1100.0);

			// Vacante 6
			Vacante vacante6 = new Vacante();
			vacante6.setId(6);
			vacante6.setNombre("Marketing Digital");
			vacante6.setDescripcion("Campañas de publicidad en redes sociales y SEO");
			vacante6.setFecha(sdf.parse("25-07-2019"));
			vacante6.setSalario(1000.0);

			// Vacante 7
			Vacante vacante7 = new Vacante();
			vacante7.setId(7);
			vacante7.setNombre("Abogado Corporativo");
			vacante7.setDescripcion("Asesoría legal y elaboración de contratos");
			vacante7.setFecha(sdf.parse("01-08-2019"));
			vacante7.setSalario(1700.0);

			// Vacante 8
			Vacante vacante8 = new Vacante();
			vacante8.setId(8);
			vacante8.setNombre("Técnico en Mantenimiento");
			vacante8.setDescripcion("Mantenimiento preventivo y correctivo de maquinaria");
			vacante8.setFecha(sdf.parse("12-09-2019"));
			vacante8.setSalario(900.0);

			// Vacante 9
			Vacante vacante9 = new Vacante();
			vacante9.setId(9);
			vacante9.setNombre("Recepcionista");
			vacante9.setDescripcion("Atención al cliente y gestión de llamadas");
			vacante9.setFecha(sdf.parse("20-10-2019"));
			vacante9.setSalario(800.0);

			// Vacante 10
			Vacante vacante10 = new Vacante();
			vacante10.setId(10);
			vacante10.setNombre("Arquitecto");
			vacante10.setDescripcion("Diseño de planos y supervisión de obra");
			vacante10.setFecha(sdf.parse("30-11-2019"));
			vacante10.setSalario(1500.0);

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

		for (Vacante cadaVacante : lista) {

			// Si el id del vacante coincide con el id pasado por la url, lo devuelve
			if (cadaVacante.getId() == idVacante) {
				return cadaVacante;
			}

		}

		return null;
	}

	@Override
	public void save(Vacante vacante) {
		lista.add(vacante);
	}

}
