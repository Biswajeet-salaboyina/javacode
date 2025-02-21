
public class Electronics implements Product {

	
	private int price;
	private String name;

	public Electronics(int price, String name)
	{
		this.price = price;
		this. name = name;
	}
	@Override
	
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println(price);
		
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println(name);
		
	}

	@Override
	public void getCategory() {
		// TODO Auto-generated method stub
		System.out.println("Electronics");
		
	}

	
}
