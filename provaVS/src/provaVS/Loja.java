package provaVS;

public class Loja {

	private int codLoja;
	private String nomeLoja;
	private String endLoja;
	
	public Loja() {
		super();
	}
	
	public Loja(int codLoja, String nomeLoja, String endLoja) {
		super();
		this.codLoja = codLoja;
		this.nomeLoja = nomeLoja;
		this.endLoja = endLoja;
	}

	public int getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(int codLoja) {
		this.codLoja = codLoja;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getEndLoja() {
		return endLoja;
	}

	public void setEndLoja(String endLoja) {
		this.endLoja = endLoja;
	}
	
	
	
	

}
