
public class Student {
  private int id;
  private int age;
  private String name;
  private String gender;
  private Address address;
  
  
  public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Student()
  {
	  
  }
  
  public Student(int id, int age, String name, String gender) {
	  this.id =id;
	  this.age = age;
	  this.name = name;
	  this.gender = gender;
	  
  }
  
  	public void setId(int id)
  	{
  		this.id = id;
  	}
  	public int getId()
  	{
  		return id;
  	}
  	
  	public void setAge(int age)
  	{
  		this.age = age;
  	}
  	public int getAge()
  	{
  		return age;
  	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", address=" + address
				+ "]";
	}
	
  	
}
