import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Give first number :");
	       Scanner scanner = new Scanner (System.in);
	       int firstnumber = scanner.nextInt();
           

       System.out.print("Give second number :");
       int secondnumber = scanner.nextInt();
	
	if(firstnumber < secondnumber) {
		System.out.println("minumum is:" + firstnumber);
		System.out.println("maximum is:" + secondnumber);
		
	}else{
		System.out.println("maximum is:" + secondnumber);
		System.out.println("minumum is:" + firstnumber);
		
	}
	
	
	
	
	}

}
