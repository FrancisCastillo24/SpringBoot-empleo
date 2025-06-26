package net.fcf.empleos.service;

import java.util.List;

import net.fcf.empleos.model.Vacante;

public interface IVacantesService {
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
}
