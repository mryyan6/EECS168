
public class MyCircleTest {
	public static void main(String[] args)
	{
		MyCircle myCircle= new MyCircle();
		myCircle.r=5.5;
		System.out.println("My circle has a radius of "+myCircle.r);
		double theArea;
		double theCircum;
		theArea=myCircle.area();
		theCircum=myCircle.circumference();
		System.out.println("The area is "+theArea);
		System.out.println("The circumference is "+theCircum);
		System.out.println("The diameter is " +(myCircle.diameter()));
	}
	
}
