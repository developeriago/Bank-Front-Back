package com.iago.Model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Transacao {

    @Column(length = 50, nullable = false)
    private String cpf;

    @Column(nullable = true)
    private Double valor;
    
}
