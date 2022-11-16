package bhanu;

public class Address {
	private String strt;
	private String city;
	private String state;
	public String getStrt() {
		return strt;
	}
	public void setStrt(String strt) {
		this.strt = strt;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void details()
	{
		System.out.println("strt:"+strt+" city:"+city+" state:"+state+"  ");
	
	}

}
