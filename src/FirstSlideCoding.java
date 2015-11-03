public class PassByReference {
	public static void main(String[] args) {
		//Create a new instance of the object Number, named num
		Number num = new Number();
		System.out.println("Start value = " + num.num1);
		//Create a new instance of the method Calculator, named calc
		Calculator calc = new Calculator();
		//Pass (by reference) the value of num into the method calc
		calc.multiply(num);
		System.out.println("Final value = " + num.num1);
	}
}
	
class Number { public int num1 = 2; }

class Calculator {
	public void multiply(Number value) {
		value.num1 = value.num1 * 5;
		System.out.println("Adjusted value = " + value.num1);
	}
}