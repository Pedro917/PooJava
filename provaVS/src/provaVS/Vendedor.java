package provaVS;

public class Vendedor {

	private int codVendedor;
	private String nomeVendedor;
	private float salarioVendedor;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(int codVendedor, String nomeVendedor, float salarioVendedor) {
		super();
		this.codVendedor = codVendedor;
		this.nomeVendedor = nomeVendedor;
		this.salarioVendedor = salarioVendedor;
	}

	public int getCodVendedor() {
		return codVendedor;
	}

	public void setCodVendedor(int codVendedor) {
		this.codVendedor = codVendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public float getSalarioVendedor() {
		return salarioVendedor;
	}

	public void setSalarioVendedor(float salarioVendedor) {
		this.salarioVendedor = salarioVendedor;
	}
	
	

}
