package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface EnqueteBO {
	int votarSim();
	int votarNao();
}
