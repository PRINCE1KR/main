import java.util.Scanner;
public class Checkinteger {
    public static void main(String[] args) {
        System.out.println("enter any integer number");
        Scanner sc = new Scanner(System.in);
        boolean b = sc.hasNextInt();
        System.out.println(b);
    }
}
