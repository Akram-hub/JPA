package org.akmoumni.Registro.service;

import java.util.List;

import org.akmoumni.Registro.model.Pais;
import org.akmoumni.Registro.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaisService {

	@Autowired
	private PaisRepository paisRepo;
	
    public List<Pais> listarPais() {
        return paisRepo.findAll();
    }
    
    public void guardarPais(Pais pais) {
    	paisRepo.save(pais);
    }
    
    public Pais obtenerPais(long id) {
        return paisRepo.findById(id).get();
    }
    
    public void eliminarPais(long id) {
    	paisRepo.deleteById(id);
    }
    
	
}
