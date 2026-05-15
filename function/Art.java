import java.util.Scanner;

public class art {
    void getValwer(int a) {
        System.out.println("a:" + a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);
        art ob12 = new art();
        ob12.getValwer(a);
    }
}