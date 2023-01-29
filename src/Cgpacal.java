import java.util.Scanner;
public class Cgpacal {
    public static void main(String[] args) {
        System.out.println("this is a cgpa calculator");
        System.out.println("enter the marks of three subject");
        Scanner sc = new Scanner(System.in);
        float s1 = sc.nextFloat();
        float s2 = sc.nextFloat();
        float s3 = sc.nextFloat();
        float mip =(float) ((float)((s1+s2+s3)/300)*100);
        System.out.println(mip);
        float cgpa = (float) ((float)mip/9.5);
        System.out.print("your cgpa is ");
        System.out.println(cgpa);
        System.out.println("Good !");
    }
}
