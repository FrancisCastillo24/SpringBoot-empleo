package net.fcf.empleos.service;

import java.util.List;

import net.fcf.empleos.model.Categoria;

public interface ICategoriasService {

	void save(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
}
