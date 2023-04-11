package com.iago.Model;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(length = 50, nullable = false)
    @NotNull(message = "Teste teste")
    @NotEmpty(message = "O campo não foi preenchido")
    @CPF(message = "O campo não foi preenchido corretamente")
    private String cpf;

    @Column(nullable = false)
    @NotNull(message = "Teste teste")
    @NotEmpty(message = "O campo não foi preenchido")
    private String senha;

    
    
}
