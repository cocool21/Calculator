
public class Calculation {
public Calculation(){
	
}
public double Multiplication(double num1,double num2){
	return num1*num2;
}
public double Addition(double num1,double num2){
	return num1+num2;
}
public double Subtraction(double num1,double num2){
	return num1-num2;
}
public double Division(double num1,double num2){
	return num1/num2;
}
public double Modulus(double num1,double num2){
	return num1%num2;
}
public String Calc(double num1,double num2,int operation){
	double result;
	if(operation==1){
		result=num1+num2;
		return num1+" + "+num2+" = "+result;
	}else if(operation==2){
		result=num1-num2;
		return num1+" - "+num2+" = "+result;
	}else if(operation==3){
		result=num1*num2;
		return num1+" x "+num2+" = "+result;
	}else if(operation==4){
		result=num1/num2;
		return num1+" / "+num2+" = "+result;
	}else if(operation==5){
		result=num1%num2;
		return num1+" mod "+num2+" = "+result;
	}else{
		return "Not valid calculation method.";
	}
}
}
