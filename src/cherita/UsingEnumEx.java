//Use the EnumEx to create Enum variables that never change and print out the value, desc, and age
// 1-29-17

package cherita;

public class UsingEnumEx {
	//Loops thru the array of people and give person name, description, and age 
	public static void main(String[] args) {
		for (EnumEx people: EnumEx.values())//EnumEx.values is a built in Array
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());

	}

}
