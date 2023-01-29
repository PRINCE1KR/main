import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        System.out.print("kilometer :");
        Scanner pd = new Scanner(System.in);
        float km = pd.nextInt();
        float j = 0.621371F;
        float mile = km*j;
        System.out.println(mile);
    }
}
