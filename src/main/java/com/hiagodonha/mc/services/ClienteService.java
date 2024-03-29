package com.hiagodonha.mc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiagodonha.mc.dao.ClienteDao;
import com.hiagodonha.mc.model.Cliente;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteDao categoriaDao;
	
	public Cliente bucar(Integer id) throws ObjectNotFoundException {
		 Optional<Cliente>obj = categoriaDao.findById(id);
		 return obj.orElseThrow(() -> new ObjectNotFoundException(
				 		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
