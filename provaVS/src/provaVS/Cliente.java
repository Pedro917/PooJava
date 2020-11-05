package provaVS;

public class Cliente {

	private int codCliente;
	private String nomeCliente;
	private String endCliente;
	
	public Cliente(int codCliente, String nomeCliente, String endCliente) {
		super();
		this.codCliente = codCliente;
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
	}
	
	public Cliente() {
		super();
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndCliente() {
		return endCliente;
	}

	public void setEndCliente(String endCliente) {
		this.endCliente = endCliente;
	}
	
}
