import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insert first string");
    String str1 = scanner.nextLine();
    System.out.println("Insert second string");
    String str2 = scanner.nextLine();
    System.out.println("Insert third string");
    String str3 = scanner.nextLine();

    System.out.print(str1 + str2 + str3 + " ");
    System.out.print(str3 + str2 + str1);
    }
}
