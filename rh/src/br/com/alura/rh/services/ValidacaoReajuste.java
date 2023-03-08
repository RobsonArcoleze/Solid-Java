package br.com.alura.rh.services;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

public interface ValidacaoReajuste {

	void validar (Funcionario funcionario, BigDecimal aumento);
}
