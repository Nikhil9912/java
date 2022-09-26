import java.util.Scanner;
	public class question3
	{
	   public static void main(String[] args) 
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("MENU:");
	      System.out.println("1.Area of circle");
	      System.out.println("2.Calculate Circumference of a Circle");
	      
	      System.out.println("Please enter any of the above option: ");
	      int num = sc.nextInt();
	      switch(num)
	      {
	         case 1: System.out.println("Please enter radius of circle: ");
	         double radius = sc.nextFloat();
	         double areaCircle = (22 * radius * radius) / 7;
	         System.out.println("Area of circle is: " + areaCircle);
	         break;
	         case 2: System.out.println("Please enter radius of circle ");
	         double radius1 = sc.nextFloat();
	         
	         double circumfrance = (2*3.14*radius1);
	         System.out.println("circumfrance of triangle: " + circumfrance);
	         break;
	         
	        default:System.exit(0);
	      }
	      sc.close();
	   }
	


	}

