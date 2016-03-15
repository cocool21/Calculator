import java.util.Scanner;
public class CalculatorApp {
public static void main(String[] args){
	Calculation cal=new Calculation();
	Scanner sc=new Scanner(System.in);
	double num1;
	double num2;
	int operation;
	double result1;
	String result2;
	
	Println("What is the first number? : ");
	num1=sc.nextDouble();
	Println("1 - Addition");
	Println("2 - Subtraction");
	Println("3 - Multiplication");
	Println("4 - Division");
	Println("5 - Modulus");
	Println("What do you want to do? : ");
	operation=sc.nextInt();
	Println("What is the second number? : ");
	num2=sc.nextDouble();
	System.out.println();
	
	if(operation==1){
		result1=cal.Addition(num1, num2);
		Println(num1+" + "+num2+" = "+result1);
		
	}else if(operation==2){
		result1=cal.Subtraction(num1, num2);
		Println(num1+" - "+num2+" = "+result1);
		
	}else if(operation==3){
		result1=cal.Multiplication(num1, num2);
		Println(num1+" x "+num2+" = "+result1);
		
	}else if(operation==4){
		result1=cal.Division(num1, num2);
		Println(num1+" / "+num2+" = "+result1);
		
	}else if(operation==5){
		result1=cal.Modulus(num1, num2);
		Println(num1+" mod "+num2+" = "+result1);
		
	}else{
		Println("Not valid calculation method ");
	}
	result2=cal.Calc(num1, num2, operation);
	Println(result2);
	
	sc.close();
}
private static void Println(Object value){
	System.out.println(value);
}
}
