import java.util.Scanner;
public class CBSEResult {
    public static void main(String[] args) {
        System.out.println("plz enter your number to see result");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your maths.English,Science,Sanskrit,Hindi number");
        float maths = sc.nextFloat();
        float english = sc.nextFloat();
        float science = sc.nextFloat();
        float sanskrit = sc.nextFloat();
        float hindi = sc.nextFloat();
        System.out.println("Enter total marks of paper");
        float total = sc.nextFloat();
        float mrip = (maths/total)*100;
        float erip = (english/total)*100;
        float srip = (science/total)*100;
        float skrip = (sanskrit/total)*100;
        float hrip = (hindi/total)*100;
        System.out.println("maths percentage: ");
        System.out.println(mrip);
        System.out.println("english percentage: ");
        System.out.println(erip);
        System.out.println("science percentage: ");
        System.out.println(srip);
        System.out.println("sanskrit percentage: ");
        System.out.println(skrip);
        System.out.println("hindi percentage: ");
        System.out.println(hrip);
        System.out.println("Thank you for your time");


    }
}
