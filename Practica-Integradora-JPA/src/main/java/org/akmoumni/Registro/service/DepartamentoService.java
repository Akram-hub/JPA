package org.akmoumni.Registro.service;

import java.util.List;

import org.akmoumni.Registro.model.Departamento;
import org.akmoumni.Registro.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DepartamentoService {

	@Autowired
	private DepartamentoRepository departamentoRepo;
	
    public List<Departamento> listarDepartamentos() {
        return departamentoRepo.findAll();
    }
    
    public void guardarDepartamento(Departamento departamento) {
    	departamentoRepo.save(departamento);
    }
    
    public Departamento obtenerDepartamento(long id) {
        return departamentoRepo.findById(id).get();
    }
    
    public void eliminarDepartamento(long id) {
    	departamentoRepo.deleteById(id);
    }
    
	
}
