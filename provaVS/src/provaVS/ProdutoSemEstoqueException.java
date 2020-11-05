package provaVS;

public class ProdutoSemEstoqueException extends Exception {
	
	private Produto produto;
	
	public ProdutoSemEstoqueException() {
		
	}
	
	public ProdutoSemEstoqueException(Produto produto) {
		this.produto = produto;
	}
	
	public Produto getProdutoException() {
		return produto;
	}

}
