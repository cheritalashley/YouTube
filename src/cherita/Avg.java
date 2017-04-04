package cherita;

public class Avg {

	public static void main(String[] args) {
		System.out.print(average(3,5,7,8));
	}

	public static int average(int...numbers){
		int total=0;
		for (int x:numbers)
			total +=x;
		return total/numbers.length;
	}
}
