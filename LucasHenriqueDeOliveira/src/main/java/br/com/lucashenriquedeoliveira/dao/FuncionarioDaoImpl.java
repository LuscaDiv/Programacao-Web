package br.com.lucashenriquedeoliveira.dao;

import org.springframework.stereotype.Repository;

import br.com.lucashenriquedeoliveira.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
