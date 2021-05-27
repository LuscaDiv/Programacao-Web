package br.com.lucashenriquedeoliveira.dao;

import java.util.List;

import br.com.lucashenriquedeoliveira.domain.Departamento;

public interface DepartamentoDao {
	
	void save (Departamento departamento);

	void update (Departamento departamento);
	
	void delete (Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();

}
