// Using Constructors and the toString Method with the *this* keyword
// The Superclass for the Subclass UsingToString
// the *this* keyword is a reference to the current object (the toString Object)
// 1-29-17

package cherita;

public class ToStringEx {
	private int month;
	private int day;
	private int year;

	public ToStringEx(int m, int d, int y){
		month=m;
		day=d;
		year=y;
		
		System.out.printf("The constructor for this is %s\n", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", month, day, year);
	}
}
