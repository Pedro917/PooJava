package provaVS;

public class ProdutoRepetidoException extends Exception {

	private Produto produto;
	
	public ProdutoRepetidoException() {
		
	}
	
	public ProdutoRepetidoException(Produto produto) {
		this.produto = produto;
	}
	
	public Produto getProdutoException() {
		return produto;
	}
	
		
}
