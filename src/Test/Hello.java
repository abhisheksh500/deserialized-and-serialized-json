package Test;

public class Hello {

   private String city;
   private String state;
   private int houseno;
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
public int getHouseno() {
	return houseno;
}
public void setHouseno(int houseno) {
	this.houseno = houseno;
}
@Override
public String toString() {
	return "Hello [city=" + city + ", state=" + state + ", houseno=" + houseno
			+ "]";
}
public Hello(String city,String state,int houseno) {
	
	this.city = city;
	this.state = state;
	this.houseno = houseno;
}
public Hello() {
	
}	
}
