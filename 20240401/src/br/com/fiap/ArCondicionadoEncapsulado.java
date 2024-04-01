package br.com.fiap;

public class ArCondicionadoEncapsulado {
	
	private int temperatura;
	private String modo;
	
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		//this.temperatura = temperatura;
		try {
			if (temperatura >= 15 && temperatura <= 26) {
				this.temperatura = temperatura;
			} else {
				throw new Exception("Temperatura fora da faixa estipulada. (15-26)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getModo() {
		return modo;
	}
	public void setModo(String modo) {
		//this.modo = modo;
		try {
			if (modo=="Resfriar" || modo=="Aquecer" || modo=="Ventilar") {
				this.modo = modo;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			
		}
	}
	
	// métodos
	
	public void aumentarTemperatura() {
		if (temperatura < 26) {
			temperatura++;
		}
	}
	
	public void diminuirTemperatura() {
		if (temperatura > 15) {
			temperatura--;
		}
	}
	
	public void trocarModo() {
		try {
			if (modo=="Resfriar" || modo=="Aquecer" || modo=="Ventilar") {
				this.modo = modo;
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			
		}
	}
	
	public void mostrar() {
		System.out.println("Modo: " + getModo()
			+ "\nTemperatura" + getTemperatura()
				);
	}
	
	
}
