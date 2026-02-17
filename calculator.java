import java.util.Scanner;
public class TemperaturConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius;
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextFloat();
        float fahrenheitResult = (celsius * 9.0f / 5.0f) + 32;
        System.out.printf("Conversion of %.2f Celsius to Fahrenheit is: %.2f",
                  celsius, fahrenheitResult);
        sc.close();
    }
}
