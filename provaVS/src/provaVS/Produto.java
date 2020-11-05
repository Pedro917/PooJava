package provaVS;

public class Produto {
	
	private int codProduto;
	private String nomeProduto;
	private float precoProduto;
	private int estoqueProduto;
	
	public Produto() {
		super();
	}
	
	public Produto(int codProduto, String nomeProduto, float precoProduto, int estoqueProduto) {
		super();
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.estoqueProduto = estoqueProduto;
	}
	
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public float getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getEstoqueProduto() {
		return estoqueProduto;
	}
	public void setEstoqueProduto(int estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}
	
}
