package org.akmoumni.Registro.service;

import java.util.List;

import org.akmoumni.Registro.model.Usuario;
import org.akmoumni.Registro.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepo;
	
    public List<Usuario> listarUsuarios() {
        return usuarioRepo.findAll();
    }
    
    public void guardarUsuario(Usuario usuario) {
    	usuarioRepo.save(usuario);
    }
    
    public Usuario obtenerUsuario(long id) {
        return usuarioRepo.findById(id).get();
    }
    
    public void eliminarUsuario(long id) {
    	usuarioRepo.deleteById(id);
    }
    
	
}
