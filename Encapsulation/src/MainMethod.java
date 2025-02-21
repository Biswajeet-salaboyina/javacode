
public class MainMethod {
	public static void main(String [] args)
	{
		Address stadd = new Address();
		stadd.setAid(123);
		stadd.setArea("RET");
		stadd.setCity("Hyd");
		stadd.setPlotno("A$%%33");
		System.out.println(stadd);
		
		Student st = new Student();
		st.setId(0);
		st.setAge(10);
		st.setGender("Male");
		st.setName("Abc");
		st.setAddress(stadd);
		
		
		
		
		System.out.println(st);
		int a = st.getAge();
		System.out.println("***************");
		
		Student st1 = new Student(22,11,"QWER", "F");
		System.out.println(st1);
		
		Student [] students = new Student[4];
		students [0] = st;
		students [1] = st1;
		
		Address clgadd = new Address();
		clgadd.setAid(123);
		clgadd.setArea("RET");
		clgadd.setCity("Hyd");
		clgadd.setPlotno("A$%%33");
		System.out.println("Collage address is " + clgadd);
		
		Collage clg = new Collage();
		clg.setClgid(1);
		clg.setCname("BNMV");
		clg.setAddress(clgadd);
		clg.setStudent(students);
		
		System.out.println(clg);
		
		
		
	}
	
}
