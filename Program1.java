import java.util.Scanner;

class Program1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double a,b;
		String op;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value");
		a=s.nextDouble();
		System.out.println("Enter b value");
		b=s.nextDouble();
		System.out.println("Enter the operator");
		op=s.next();
		op=op.toLowerCase();
		switch(op)
		{
		case "addition":
			System.out.println("The added value is" + (a+b));
			break;
		case "subtraction":
			System.out.println("The subtracted value is "+ (a-b));
			break;
		case "multiplication":
			System.out.println("The multiplied value is"+ (a*b));
			break;
		case "division":
			System.out.println("The divided value is "+ (a/b));
			break;
		default:
			System.out.println("Enter valid operation");
			
			
		}
		
		
		
	}

}
