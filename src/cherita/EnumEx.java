// variables that never change are called enums
//Use the EnumEx to create Enum variables that never change and print out the value, desc, and age 
// 1-29-17

package cherita;

public enum EnumEx {
	cherita ("mom", "42"),
	tariq ("son", "12"),
	tiara ("daughter", "18");
	
	private final String desc;
	private final String age;
	
	EnumEx (String description, String myAge){
		desc=description;
		age=myAge;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getAge(){
		return age;
	}
}
