package exemplos;

public class Caderno extends Produto{
	private int numPages;
	private boolean hardCover;
	
	public Caderno(String description, double price, int numPages, boolean hardCover) {
		super(description, price);
		this.numPages = numPages;
		this.hardCover = hardCover;
	}
	

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public boolean isHardCover() {
		return hardCover;
	}

	public void setHardCover(boolean hardCover) {
		this.hardCover = hardCover;
	}

	public void imprimir() {
		System.out.println("--------------------------");
		System.out.println(this.getDescription());
		System.out.println(this.getPrice());
		System.out.println(this.getNumPages());
		System.out.println(this.isHardCover());
	}
	
	
}
