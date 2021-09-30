import java.util.Scanner;

/*Q8. Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.*/
public class Calculator {
    static void powerInt(int num1 , int num2){
        int result = num1^num2;
        System.out.println(" num1 to the power num2 is "+ result);
    }
    static void powerDouble(double num1,double num2){
        double result2 =Math.pow(num1 , num2);
        System.out.println("num1 to power num2 is "+result2);
    }

    public static void main(String[] args) {
        System.out.println("if we want to to enter a number in int press int otherwise double ");

        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s=="int"){
            System.out.println("enter num1 and num2 ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            powerInt(num1 , num2);
        }
        else{
            System.out.println("enter num1 and num2 ");
            double num1 = sc.nextInt();
            double num2 = sc.nextInt();
            powerDouble(num1 , num2);
        }

    }


}
