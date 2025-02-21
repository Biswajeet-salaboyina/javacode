import java.util.Arrays;

public class Collage {
	private int clgid;
	private String cname;
	private Address address;
	private Student [] student;
	
	
	
	public Collage(Student [] student) {
		super();
		this.student = student;
	}

	public Student [] getStudent() {
		return student;
	}

	public void setStudent(Student [] student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Collage [clgid=" + clgid + ", cname=" + cname + ", address=" + address + ", student="
				+ Arrays.toString(student) + "]";
	}

	public void setClgid(int clgid)
	{
		this.clgid= clgid;
	}
	
	public int getClgid()
	{
		return clgid;
	}

	public Collage(int clgid, String cname) {
		this.clgid = clgid;
		this.cname = cname;
	}

	public Collage() {
		
		// TODO Auto-generated constructor stub
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
