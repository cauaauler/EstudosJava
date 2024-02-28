package exemplos;

public class Caneta extends Produto{
	private String color;
	private String brand;
	
	public Caneta(String description, double price, String color, String brand) {
		super(description, price);
		this.color = color;
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void imprimir() {
		System.out.println("--------------------------");
		System.out.println(this.getDescription());
		System.out.println(this.getPrice());
		System.out.println(this.getColor());
		System.out.println(this.getBrand());
	}
	

}
