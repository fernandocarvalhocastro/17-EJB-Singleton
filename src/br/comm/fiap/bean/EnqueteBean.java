package br.comm.fiap.bean;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.EnqueteBO;

@ManagedBean
@SessionScoped
public class EnqueteBean {

	@EJB
	private EnqueteBO enqueteBO;
	private int sim, nao;

	public void votarSim(){
		sim = enqueteBO.votarSim();
	}
	
	public void votarNao(){
		nao = enqueteBO.votarNao();
	}
	
	public int getSim() {
		return sim;
	}

	public void setSim(int sim) {
		this.sim = sim;
	}

	public int getNao() {
		return nao;
	}

	public void setNao(int nao) {
		this.nao = nao;
	}
}
