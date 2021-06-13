
public class Product {
	//Array implementation
	
	int id;
	String desc;
	double cost;
	static double TOTALCOST;
	
	public Product(int id, String desc, double cost) {
		this.id = id;
		this.desc = desc;
		this.cost = cost;
		TOTALCOST+=cost;
	}

	public int getId() {
		System.out.println(id);
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() 
	{
		System.out.println(desc);
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getCost() {
		System.out.println(cost);
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public static double getTotalCost() {
		System.out.println("total cost : "+TOTALCOST);
		return TOTALCOST;
	}

	public static void setTotalCost(double totalCost) {
		Product.TOTALCOST = totalCost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product[] productArray= {new Product(11, "Apple", 61900.56), new Product(12, "OnePlus", 49999.99)};
		for (Product product : productArray) {
			product.getId();
			product.getDesc();
			product.getCost();
		}
		getTotalCost();
		
	}

}
