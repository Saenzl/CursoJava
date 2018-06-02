import java.util.Scanner;

public class Operations{

    public static void main(String[] args){

        int num1;
        int num2;

        int result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        num1 = scan.nextInt();

        System.out.println("Escribe otro numero: ");
        num2 = scan.nextInt();


        result = num1 + num2;
        System.out.println("La suma es: " + result);

        result = num1 - num2;
        System.out.println("La resta es: " + result);

        result = num1 * num2;
        System.out.println("La multiplicacion es: " + result);

    }

}