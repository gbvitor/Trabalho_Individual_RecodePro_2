package model;

public class cadastroViagem {
	private String email;
	private String nome;
	private int id;
	private String CEPDestino;
	private String CEPOrigem;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCEPDestino() {
		return CEPDestino;
	}

	public void setCEPDestino(String string) {
		this.CEPDestino = string;
	}

	public String getCEPOrigem() {
		return CEPOrigem;
	}

	public void setCEPOrigem(String string) {
		this.CEPOrigem = string;
	}

}
