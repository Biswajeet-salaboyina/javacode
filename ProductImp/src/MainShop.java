
public class MainShop {
	public static void main(String [] args)
	{
		Product ele = new Electronics(10, "Nokia");
		ele.getCategory();
		ele.getPrice();
		ele.getName();
		
		Product cloth = new Clothing(100, "Lee");
		cloth.getCategory();
		cloth.getPrice();
		cloth.getName();
	}
}
