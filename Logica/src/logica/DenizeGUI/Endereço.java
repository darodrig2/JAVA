package logica.DenizeGUI;

public class Endereço {

	
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	

		
	public String getCep() {
		return cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
	public String getCEP() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
			this.nome = nome;	
	}
	
	public String getEndereço() {
		return getEndereço();
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
		
	}

@Override
public String toString() {
	return " Endereço: " + "Logr.: " + logradouro + " N°: " + numero + " Bairro: " + bairro + 
			"CEP: " + cep;
}
public void setVisible(boolean b) {
	
	
}
public void setLocationRelativeTo(DenizeGUI02 denizeGUI02) {
	
	
}
public void setDefaultCloseOperation(int disposeOnClose) {
	
	
}
public Object getJogo() {

	return null;
}

}

