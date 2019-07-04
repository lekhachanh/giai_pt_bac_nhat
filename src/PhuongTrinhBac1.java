import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("a : ");
        a = sc.nextDouble();
        System.out.println("b : ");
        b = sc.nextDouble();
        double x;
        if (a == 0) {
             x = -b;
        } else {
             x = -b / a;
        }
        System.out.println("Nghiệm của phương trình x = " + x);
    }
}
