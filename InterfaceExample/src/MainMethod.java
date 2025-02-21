
public class MainMethod {
	public static void main(String [] args)
	{
		Carimpl1 r = new Carimpl1();
		r.engine();
		r.tyres();;
		r.interior();
		
		System.out.println("============================");
		InterfaceCar i = new Carimpl1();
		i.engine();
//		i.interior();
//		i.interior();
		
	}
}
