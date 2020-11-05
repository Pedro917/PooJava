package provaVS;

public class ProdutoImportado extends Produto{
	
	private String paisOrigem;
	private float imposto;
	
	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(int codProduto, String nomeProduto, float precoProduto, int estoqueProduto) {
		super(codProduto, nomeProduto, precoProduto, estoqueProduto);
	}
	
	public ProdutoImportado(String paisOrigem, float imposto) {
		super();
		this.paisOrigem = paisOrigem;
		this.imposto = imposto;
	}
	
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public float getPrecoProduto() {
		return super.getPrecoProduto() + (this.imposto * super.getPrecoProduto());
	}
	
	/* A sobrescrita do metodo getPrecoProduto vai pegar o preco do produto e somar com o imposto dado em porcentagem com o proprio preco.
	 * 
	 * Ex: 100 + (0,5 * 100) = 150;
	 * 
	 * Super está se referenciando a um metodo da classe pai de Produto importado e o this está referenciando que o atributo imposto faz parte dessa classe,
	 */
	

}
