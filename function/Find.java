import java.util.Scanner;

public class Find {
    void evenorodd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even "+num);
        }
        else{
            System.out.println("Odd "+num);
        }
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int numer = scan.nextInt();
        Find onwe = new Find();
        onwe.evenorodd(numer);

    }
}
