package org.akmoumni.Registro.controller;

import java.util.Arrays;
import java.util.List;

import org.akmoumni.Registro.model.Genero;
import org.akmoumni.Registro.model.Usuario;
import org.akmoumni.Registro.service.DepartamentoService;
import org.akmoumni.Registro.service.PaisService;
import org.akmoumni.Registro.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/general")
public class GeneralController {

    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    private PaisService paisService;
    
    @Autowired
    private DepartamentoService departamentoService;
    
    @GetMapping("/listado")
    public ModelAndView listadoUsuarios() {
        
		ModelAndView mAV = new ModelAndView();
		
		List<Usuario> listaUsuarios = usuarioService.listarUsuarios();
        
		mAV.addObject("listaUsuarios", listaUsuarios);
        mAV.setViewName("listado");
         
        return mAV;
    }
    
    @GetMapping("/altaUsuario")
    public ModelAndView altaUsuarioNuevo() {
    	
		ModelAndView mAV = new ModelAndView();

        Usuario usuario = new Usuario();
        
        List<Genero> enums = Arrays.asList(Genero.values());
        
        mAV.addObject("enums", enums);
        mAV.addObject("usuario", usuario);
        mAV.setViewName("alta");
         
        System.out.println(enums.size());
        
        return mAV;
    }
    
    @PostMapping("/guardarUsuario")
    public ModelAndView guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
    	
		ModelAndView mAV = new ModelAndView();

        usuarioService.guardarUsuario(usuario);
        
        mAV.setViewName("redirect:/listado");
         
        return mAV;
    }
    
    @GetMapping("/editarUsuario/{id}")
    public ModelAndView devuelvePaginaEdicion(@PathVariable(name = "id") int id) {
    	
        ModelAndView mAV = new ModelAndView("editar_usuario");
        
        Usuario usuario = usuarioService.obtenerUsuario(id);
        
        mAV.addObject("usuario", usuario);
         
        return mAV;
    }
    
    @GetMapping("/baja/{id}")
    public ModelAndView bajaUsuario(@PathVariable(name = "id") int id) {
    	
		ModelAndView mAV = new ModelAndView();

        usuarioService.eliminarUsuario(id);
        
        mAV.setViewName("redirect:/listado");
        
        return mAV;    
    }
	
}
