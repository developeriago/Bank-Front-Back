package com.iago.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iago.Dto.UsuarioDto;
import com.iago.Model.Usuario;
import com.iago.Service.UsuarioService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("/api")
@AllArgsConstructor
public class UsuarioController {
    
    private final UsuarioService usuarioService;

    @PostMapping("/cadastro")
    @ResponseStatus(code = HttpStatus.OK)
    public UsuarioDto create(@Valid @RequestBody Usuario usuario){
        
        var result = usuarioService.create(usuario);

        if(result == null){
            return null;
        }
        
        UsuarioDto usuarioDto = new UsuarioDto(usuario);
        return usuarioDto;
    }

    @PostMapping("/login")
	public UsuarioDto login (@RequestBody Usuario usuario) {
		
        Usuario usuarioLogin = usuarioService.login(usuario);
		
        if(usuarioLogin == null){
            return null;
        }
        
        UsuarioDto usuarioDto = new UsuarioDto(usuario);
        return usuarioDto;
		
	} 
}    
