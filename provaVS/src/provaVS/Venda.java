package provaVS;

import java.util.ArrayList;

public class Venda {

	private int codVenda;
	private Cliente cliente;
	private Vendedor vendedor;
	private Loja loja;
	private ArrayList<Produto> lista = new ArrayList<Produto>();//Coleção para ter o tamanho do array de acordo com o tamanho de produtos.
	
	public Venda() {
		super();
	}
	
	public Venda(int codVenda, Cliente cliente, Vendedor vendedor, Loja loja) {
		super();
		this.codVenda = codVenda;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.loja = loja;
	}
	
	/*No metodo addProduto ele vai primeiramente verificar se já existe um produto igual no array, caso exista ele vai chamar a exception.
	 * 
	 * Depois vai verificar se o estoque do produto e igual a 0, caso seja vai para uma exception .
	 *  
	 * Caso não exista o Produto igual e o produto tiver o estoque diferente de 0, por meio de coleção o produto vai ser adicionado ao array.
	 * 
	 * O lista.add e um metodo da colecao do ArrayList no qual adiciona algo na lista, similar a estrutura de dados.
	 */
	
	public void addProdutoVenda(Produto produto) throws ProdutoRepetidoException,ProdutoSemEstoqueException {
		if(lista.contains(produto)) {
			throw new ProdutoRepetidoException(produto);
		}
		if(produto.getEstoqueProduto() == 0) {
			throw new ProdutoSemEstoqueException(produto);
		}
		
		lista.add(produto);
	}
	
	public Produto getProdutoVenda(int ind) {
		return lista.get(ind);
	}

	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	
	public float calcularValorVenda() {
		float soma = 0;
		for(int i = 0; i < lista.size(); i++) {
			soma = soma + lista.get(i).getPrecoProduto();
		}
		return soma;
	}
	
	/* o metodo calcularValorVenda ira somar todos os produtos inseridos no ArrayList.
	 * 
	 * Essa soma será armazenada em uma variavel soma.
	 * 
	 * Um for vai correr do valor 0 ate o fim do array, este fim e descoberto atraves do lista.size
	 * 
	 * A variavel soma vai ser somada com o preco do produto naquele index da lista. Depois o i do for vai incrementar e repetir o ciclo ate o final da lista.
	 * 
	 * Apos sair do for a variavel soma vai ser retornada por meio do metodo.
	 */
	

}
