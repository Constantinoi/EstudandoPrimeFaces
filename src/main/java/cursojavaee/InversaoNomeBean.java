package cursojavaee;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InversaoNomeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String nomeInvertido;
	private int quantPalavras;

	public void inveter() {
		this.nomeInvertido = "";
		this.quantPalavras = 0;
		if (this.nome != null && !this.nome.isEmpty()) {
			this.quantPalavras = 1;
		}
		for (int i = this.nome.length() - 1; i >= 0; i--) {
			char letra = this.nome.charAt(i);
			this.nomeInvertido += letra;
			if (letra == ' ') {
				this.quantPalavras++;
			}
		}
		System.out.println("Nome invertido: " + this.nomeInvertido);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeInvertido() {
		return nomeInvertido;
	}

	public void setNomeInvertido(String nomeInvertido) {
		this.nomeInvertido = nomeInvertido;
	}

	public int getQuantPalavras() {
		return quantPalavras;
	}

	public void setQuantPalavras(int quantPalavras) {
		this.quantPalavras = quantPalavras;
	}

}
