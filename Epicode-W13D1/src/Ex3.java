import java.util.Scanner;

public class Ex3 {
    public static double perimetroRettangolo(double num1, double num2) {
        return (num1 * 2) + (num2 * 2);
    }

    public static int pariDispari(int num) {
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(double l1, double l2, double l3) {
        double p = (l1 + l2 + l3) / 2.0;
        return Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PERIMETRO RETTANGOLO: INSERISCI PRIMO LATO");
        double input1 = Double.parseDouble(scanner.nextLine());
        System.out.println("PERIMETRO RETTANGOLO: INSERISCI SECONDO LATO");
        double input2 = Double.parseDouble(scanner.nextLine());
        double result1 = perimetroRettangolo(input1, input2);
        System.out.println(result1);

        System.out.println("PARI DISPARI: INSERISCI NUMERO");
        int input3 = Integer.parseInt(scanner.nextLine());
        int result2 = pariDispari(input3);
        System.out.println(result2);

        System.out.println("AREA TRIANGOLO: INSERISCI PRIMO LATO");
        double input4 = Double.parseDouble(scanner.nextLine());
        System.out.println("AREA TRIANGOLO: INSERISCI SECONDO LATO");
        double input5 = Double.parseDouble(scanner.nextLine());
        System.out.println("AREA TRIANGOLO: INSERISCI TERZO LATO");
        double input6 = Double.parseDouble(scanner.nextLine());
        double result3 = areaTriangolo(input4, input5, input6);
        System.out.println(result3);
    }
}
