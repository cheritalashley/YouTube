package cherita;

public class Clock {

	public static void main(String[] args) {
		UsingClock clockObject=new UsingClock();
		UsingClock clockObject2=new UsingClock(3);
		UsingClock clockObject3=new UsingClock(3, 27);
		UsingClock clockObject4=new UsingClock(3, 27, 23);
		
		System.out.printf("%s\n", clockObject.toMilitary());
		System.out.printf("%s\n", clockObject2.toMilitary());
		System.out.printf("%s\n", clockObject3.toMilitary());
		System.out.printf("%s\n", clockObject4.toMilitary());
		
		
	}

}
