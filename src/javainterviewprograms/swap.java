package javainterviewprograms;

public class swap {

	public static void main(String[] args) {
		int num1 = 10;
        int num2 = 20;
       
        System.out.println("Before Swapping");
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" +num2);
       
        //add both the numbers and assign it to first
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
       
        System.out.println("Before Swapping");
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" +num2);

	}

}
