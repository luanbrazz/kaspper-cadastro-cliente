package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // = Tabela BD

public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nomeCliente;
	private String dataNascimento;
	private String telefone;
	private String email;
	private String cidade;
	
	
	public Cliente() {}


	public Cliente(Integer id, String nomeCliente, String dataNascimento, String telefone, String email, String cidade) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.cidade = cidade;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomeCliente=" + nomeCliente + ", dataNascimento=" + dataNascimento
				+ ", telefone=" + telefone + ", email=" + email + ", cidade=" + cidade + "]";
	}
	
	
	
}
