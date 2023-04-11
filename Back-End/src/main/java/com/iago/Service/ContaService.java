package com.iago.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iago.Model.Conta;
import com.iago.Model.Transacao;
import com.iago.Repository.ContaRepository;

@Component
public class ContaService {

    @Autowired
	ContaRepository contaRepository;

    // public Conta criarConta( Conta conta){
    //     contaRepository.save(conta);
    //     return conta;
    // }

	public Double saldo(String cpf) {

		Conta conta = contaRepository.findByCpf(cpf);

		if( conta != null){
			return conta.getSaldo();
		}
		
		return null;
		
	}

	public Double deposito(Transacao transacao) {

		Conta conta = contaRepository.findByCpf(transacao.getCpf());

		if( conta != null){
			
			conta.setSaldo(conta.getSaldo() + transacao.getValor());
			contaRepository.save(conta);

			return conta.getSaldo();
		}
		
		return null;
		
	}

	public Double saque(Transacao transacao) {

		Conta conta = contaRepository.findByCpf(transacao.getCpf());

		if( conta != null){
			
			if(transacao.getValor() > conta.getSaldo()){
				return null;
			}
			
			conta.setSaldo(conta.getSaldo() - transacao.getValor());
			contaRepository.save(conta);

			return conta.getSaldo();
		}
		
		return null;
		
	}
    
}
