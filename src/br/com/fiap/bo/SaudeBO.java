package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface SaudeBO {

	double calcularImc(float peso, float altura);
	
}