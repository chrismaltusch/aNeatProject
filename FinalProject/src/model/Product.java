package model;

public class Product {
	private String ProductID;
	private String Name;
	private double Price;
	private int Quantity;
	
	public Product() {
		this.ProductID = "1234";
		this.Name = "Elk";
		this.Price = 4.99;
		this.Quantity = 100;
	}
	
	public Product(String ProductID, String Name, double Price, int Quantity) {
		this.ProductID = ProductID;
		this.Name = Name;
		this.Price = Price;
		this.Quantity = Quantity;
	}

	/**
	 * @return the productID
	 */
	public String getProductID() {
		return ProductID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productID) {
		ProductID = productID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return Price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		Price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return Quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [ProductID=" + ProductID + ", Name=" + Name + ", Price=" + Price + ", Quantity=" + Quantity
				+ "]";
	}
}
