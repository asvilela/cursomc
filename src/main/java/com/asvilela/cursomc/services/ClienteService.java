package com.asvilela.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asvilela.cursomc.domain.Cliente;
import com.asvilela.cursomc.repositories.ClienteRepository;
import com.asvilela.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado: Id " + id + ", Tipo: " + Cliente.class.getName());
		}
		
		return obj;
	}
}
