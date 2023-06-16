/**
 * 
 */
package entities;

/**
 * Classe que contem as informacoes do produto
 * 
 * @author Matos - 16.06.2023
 *
 */
public class Product {

	private String name;
	private Double price;
	private Integer quantidade;
	
	public Product() {
	}

	public Product(String name, Double price, Integer quantidade) {
		this.name = name;
		this.price = price;
		this.quantidade = quantidade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double total() {
		return price * quantidade;
	}
}
