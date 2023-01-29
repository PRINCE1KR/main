import java.util.Scanner;
public class Sumof3 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.print("sum is: ");
        System.out.println(sum);
    }
}
