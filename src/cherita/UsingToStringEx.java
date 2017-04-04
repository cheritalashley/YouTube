// Used the ToStringEx Constructor
// Used the CompositionEx Constructor
// 1-29-17
package cherita;

public class UsingToStringEx {

	public static void main(String[] args) {
		ToStringEx dateObject=new ToStringEx(4,5,6);
		CompositionEx birthdayObject=new CompositionEx("Cherita", dateObject);
		
		System.out.println(birthdayObject);

	}

}
