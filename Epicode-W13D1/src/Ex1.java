import java.util.Arrays;

public class Ex1 {

    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String str, int num) {
        return str + Integer.toString(num);
    }

    public static String[] inserisciInArray(String[] arr, String str) {
    String[] resultArr = {arr[0], arr[1], str, arr[2], arr[3], arr[4]};
    return resultArr;
    }

    public static void main(String[] args) {
    int result1 = moltiplica(5, 3);
    System.out.println(result1);
    String result2 = concatena("Hello, world!", 5);
    System.out.println(result2);
    String[] stringsArr = {"a", "b", "c", "d", "e"};
    String str1 = "z";
    String[] result3 = inserisciInArray(stringsArr, str1);
    System.out.println(Arrays.toString(result3));
    }
}
