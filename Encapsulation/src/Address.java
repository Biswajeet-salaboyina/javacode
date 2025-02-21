
public class Address {
	private int aid;
	private String plotno;
	private String area;
	private String city;
	
	public int getAid()
	{
		return aid;
	}
	public String getPlotno() {
		return plotno;
	}
	public void setPlotno(String plotno) {
		this.plotno = plotno;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", plotno=" + plotno + ", area=" + area + ", city=" + city + "]";
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
}
