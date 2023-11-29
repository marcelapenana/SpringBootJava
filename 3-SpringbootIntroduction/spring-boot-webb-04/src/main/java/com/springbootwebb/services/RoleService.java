package com.springbootwebb.services;

import com.springbootwebb.models.domain.Role;

import java.util.List;

public interface RoleService {
	
	public List<Role> listar();
	public Role obtenerPorId(Integer id);

}
