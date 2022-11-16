package bhanu;

public class customer {
private int id;
private String Name;
private String Email;
private Address adr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public Address getAdr() {
	return adr;
}
public void setAdr(Address adr) {
	this.adr = adr;
}
public void display()

{
	System.out.println("id : "+id+"  name : "+Name+"  email : "+Email+"  adr : "+adr+"  ");
	
}

}