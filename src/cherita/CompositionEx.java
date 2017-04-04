// Composition is referring to objects in other classes as strings
// Refereed to the CompositionEx Objects created as strings
// 1-29-17

package cherita;

public class CompositionEx {
	private String name;
	private ToStringEx birthday;
	
	public CompositionEx(String theName, ToStringEx theDate){
		name=theName;
		birthday=theDate;
	}
	
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
