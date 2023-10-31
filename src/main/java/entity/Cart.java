package entity;

public class Cart {
	private int quantity ;
	private double totalPrice ;
	private SanPham sanPham ;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int quantity, double totalPrice, SanPham sanPham) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.sanPham = sanPham;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	
}
