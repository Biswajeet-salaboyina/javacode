import java.util.ArrayList;
import java.util.List;

public class Stdmain {
	public static void main(String [] args)
	{
		Student s = new Student();
		s.setId(1);
		s.setAge(23);
		s.setName("Ads");
		Student s1 = new Student();
		s1.setId(13);
		s1.setAge(211);
		s1.setName("Dx");
		Student s2 = new Student();
		s2.setId(24);
		s2.setAge(44);
		s2.setName("WER");
		
		List<Student> st = new ArrayList<>();
		st.add(s);
		st.add(s2);
		st.add(s1);
		System.out.println(st);
		for(Student se : st )
		{
			if(se.getName().equals("Dx"))
			System.out.println(se);
		}
		
	}
}
