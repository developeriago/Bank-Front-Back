package com.iago.Dto;

import org.hibernate.validator.constraints.br.CPF;

import com.iago.Model.Usuario;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDto {
    
    private int id;

    @NotNull(message = "Teste teste")
    @NotEmpty(message = "O campo não foi preenchido")
    @CPF(message = "O campo não foi preenchido corretamente")
    private String cpf;

    public UsuarioDto( Usuario usuario){
        this.id = usuario.getId();
        this.cpf = usuario.getCpf();
    }

}
