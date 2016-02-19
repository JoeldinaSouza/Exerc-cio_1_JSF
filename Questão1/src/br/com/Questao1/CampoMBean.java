package br.com.Questao1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class CampoMBean {
	
	
	private String campo1;
	private String campo2;
	
	public String getCampo1() {
		return campo1;
	}
	
	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public String getCampo2() {
		return campo2;
	}

	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}

	public String trcar() {
		
		String cam;
		
		cam = campo1;
		campo1 = campo2;
		campo2 = cam;
		return null;
		
	}
	
}
