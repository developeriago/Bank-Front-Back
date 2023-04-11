package com.iago.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iago.Model.Transacao;
import com.iago.Service.ContaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/conta")
@AllArgsConstructor
public class ContaController {
    
    private final ContaService contaService;

    // @PostMapping("/novo")
	// public Conta novaConta(@RequestBody Conta conta) {
		
	// 	contaService.criarConta(conta);

	// 	return conta;
	// }

    @GetMapping("/saldo/{cpf}")
	public Double verSaldo(@PathVariable String cpf) {
		
        var saldo = contaService.saldo(cpf);

		return saldo;
	}

    @PostMapping("/depositar")
	public Double depositar(@RequestBody Transacao transacao) {
		
        var saldo = contaService.deposito(transacao);
        
		return saldo;
		
	}

    @PostMapping("/saque")
	public Double sacar(@RequestBody Transacao transacao){
		
        var saldo = contaService.saque(transacao);
        
		return saldo;
		
	}
}    
