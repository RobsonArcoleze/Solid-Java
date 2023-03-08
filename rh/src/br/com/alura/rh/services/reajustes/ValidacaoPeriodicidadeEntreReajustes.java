package br.com.alura.rh.services.reajustes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

	public void validar (Funcionario funcionario, BigDecimal aumento) {
		
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		Long mesesDesdeOUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDesdeOUltimoReajuste < 6) {
			throw new ValidacaoException("Intevalo entre reajustes deve ser de no minimo de 6 mesese");
		}
	}
}
