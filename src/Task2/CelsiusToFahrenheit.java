package Task2;


import java.util.Scanner;

public class CelsiusToFahrenheit {

    static void convertToFahrenheit(double cel) {

        double fah = (double) 9/5*cel+32;
        System.out.print("Fahrenheit degree = " +
                        String.format("%.2f",fah)+"°F");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius degree : ");
        convertToFahrenheit(sc.nextDouble());

    }
}

