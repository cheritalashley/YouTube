package cherita;

public class PassingArray {

	public static void main(String[] args) {
		int myArray[]={3,4,5,6,7};
		change(myArray);
		
		for (int temp:myArray)
			System.out.println("My numbers" + temp);
	}

	public static void change(int myArray[]){
		for (int counter=0; counter<myArray.length; counter++)
			System.out.println(myArray[counter]+=5);
	}
}
