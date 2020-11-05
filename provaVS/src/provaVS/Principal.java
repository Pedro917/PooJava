package provaVS;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Principal {

	public static void main(String[] args) {
		
		Produto mouse = new Produto();
		mouse.setCodProduto(123);
		mouse.setEstoqueProduto(10);
		mouse.setNomeProduto("Redragon King Cobra");
		mouse.setPrecoProduto(100.0f);
		
		Produto teclado = new Produto();
		teclado.setCodProduto(321);
		teclado.setEstoqueProduto(5);
		teclado.setNomeProduto("Kumara Chroma Rgb");
		teclado.setPrecoProduto(50.0f);
		
		ProdutoImportado headset = new ProdutoImportado();
		headset.setCodProduto(213);
		headset.setEstoqueProduto(0);
		headset.setNomeProduto("Motospeed H6");
		headset.setPrecoProduto(90.0f);
		headset.setImposto(0.10f);
		headset.setPaisOrigem("China");
		
		ProdutoImportado monitor = new ProdutoImportado();
		monitor.setCodProduto(312);
		monitor.setEstoqueProduto(6);
		monitor.setNomeProduto("Monitor Lg 24 polegadas");
		monitor.setPrecoProduto(200.0f);
		monitor.setImposto(0.50f);
		monitor.setPaisOrigem("India");
		
		Loja ibyte = new Loja();
		ibyte.setCodLoja(111);
		ibyte.setEndLoja("Santos Dummont 454");
		ibyte.setNomeLoja("Ibyte Eletronicos SA");
		
		Vendedor pedro = new Vendedor();
		pedro.setCodVendedor(252206);
		pedro.setNomeVendedor("Pedro Barbosa Muniz");
		pedro.setSalarioVendedor(2000.0f);
		
		Cliente isabele = new Cliente();
		isabele.setCodCliente(17);
		isabele.setEndCliente("Conjunto Palmeira Rua 1");
		isabele.setNomeCliente("Isabele Da Silva Oliveira");
		
		Venda v = new Venda();
		v.setCodVenda(001);
		v.setCliente(isabele);
		v.setLoja(ibyte);
		v.setVendedor(pedro);
		
		
		try {
			v.addProdutoVenda(monitor);
			v.addProdutoVenda(headset);
			v.addProdutoVenda(teclado);
			v.addProdutoVenda(mouse);
		}
		catch (ProdutoRepetidoException e) {
			System.out.println("O produto: "+e.getProdutoException().getNomeProduto() +" de preco "+e.getProdutoException().getPrecoProduto() +" reais ja foi inserido");
		} catch (ProdutoSemEstoqueException e) {
			System.out.println("O produto: "+e.getProdutoException().getNomeProduto() +" de preco "+e.getProdutoException().getPrecoProduto() +" reais esta sem estoque");
		}
		
		System.out.println("Valor total da Venda: "+ v.calcularValorVenda());
		
		
		try {
			File arquivo = new File("C:\\Users\\pedro\\Desktop\\loja.txt");
			
			FileOutputStream fos = new FileOutputStream(arquivo);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(v);
			oos.close();
			fos.close();
			
		}
		catch (IOException e) {
			System.out.println("Erro de Escrita");
		}


	}

}
