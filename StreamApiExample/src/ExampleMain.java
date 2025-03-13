import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleMain {
	public static void main(String [] args)
	{
		Student s = new Student();
		s.setGender("M");
		s.setAge(22);
		s.setId(12);
		s.setName("ABC");
		s.setStatus("InActive");
		
		Student s1 = new Student("XYZ", 21,"F",1,"Active");
		Student s2 = new Student("XYZ", 15,"F",2,"Active");
		Student s3 = new Student("PQR", 19,"M",3,"Active");
		Student s4 = new Student("ABC", 18,"F",4,"InActive");
		
		List<Student>list = List.of(s,s1,s2,s3,s4);
		filterData(list);
		mapStream(list);
		List <Integer> i = List.of(1,2,3,5,6,78,4,2,2,3,1,4,1,1,5,5,5,3,3,6,6);
		distinct(i);
		max(list);
		min(list);
		sort(list);
	}

	private static void sort(List<Student> list) {
		// TODO Auto-generated method stub
		List<Student> g =list.stream().sorted(Comparator.comparing(Student :: getAge)).collect(Collectors.toList());
		System.out.println(g);
		List<Student> g1 =list.stream().sorted(Comparator.comparing(Student :: getName)).collect(Collectors.toList());
		System.out.println(g1);
		// reverse method
		List<Student> rev =list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
		System.out.println(rev);
		// thenComparing
		List<Student> th  = list.stream().sorted(Comparator.comparing(Student :: getAge).thenComparing(Student :: getId)).collect(Collectors.toList());
		System.out.println(th);
		// limit
		List<Student> li =list.stream().sorted(Comparator.comparing(Student:: getAge)).limit(2).collect(Collectors.toList());
		System.out.println(li);
		//SecondHighestAge
		List <Student> SecondHighestAge = list.stream().sorted(Comparator.comparing(Student :: getAge).reversed()).limit(2).skip(1).collect(Collectors.toList());
		System.out.println(SecondHighestAge);
		Optional<Student> sf = list.stream().sorted(Comparator.comparing(Student:: getAge).reversed()).skip(1).findFirst();
		System.out.println(sf.get());
		//Thirdhighest 
		Optional<Student> s1f = list.stream().sorted(Comparator.comparing(Student:: getAge).reversed()).skip(2).findFirst();
		System.out.println(s1f.get());
	}
	

	private static void min(List<Student> list) {
		// TODO Auto-generated method stub
		Student mi = list.stream().min(Comparator.comparing(Student :: getAge)).get();
		System.out.println("Min age" +mi);
		
	}

	private static void max(List<Student> list) {
		// TODO Auto-generated method stub
		Student a1 =list.stream().max(Comparator.comparing(Student::getAge)).get();	
		System.out.println(a1);
		Student a2= list.stream().max((x,y)-> x.getAge() - y.getAge()).get();
		System.out.println(a2);
	}

	private static void distinct(List<Integer> i) {
		// TODO Auto-generated method stub
		List <Integer> v = i.stream().distinct().collect(Collectors.toList());
		
		System.out.println("The distinct " +v);
		
		
	}

	private static void mapStream(List<Student> list) {
		// TODO Auto-generated method stub
		List<String> st = list.stream().map(s -> s.getName().toLowerCase()).collect(Collectors.toList());
		System.out.println(st);
		Set<String> se = list.stream().map(s -> s.getName().toLowerCase()).collect(Collectors.toSet());
		System.out.println(se);
		
		List <Integer> i = List.of(1,2,3,5,6,78,4);
		List <Integer> l = i.stream().map(k -> k*3).collect(Collectors.toList());
		System.out.println(l);
		
		
	}

	private static void filterData(List<Student> list) {
		// TODO Auto-generated method stub
		Stream<Student> stream = list.stream().filter(s-> s.getStatus().equals("Active"));
		List <Student> record =stream.collect(Collectors.toList());
		System.out.println(stream);
		System.out.println(record);
		
	Set <Student> l = list.stream().filter(q -> q.getAge()>18).collect(Collectors.toSet());
	System.out.println(l);
	List <String> l1 = list.stream().filter(q -> q.getAge()>18).map(m -> {
		return m.getName();
	}).collect(Collectors.toList());
	System.out.println(l1);
	}
	
}
