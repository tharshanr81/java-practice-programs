import java.util.Scanner;

class array1234 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = scan.nextInt();
        System.out.println("Enter the array a values(" + size + ")");
        int[] arra = new int[size];
        for (int i = 0; i < size; i++) {
             arra[i] = scan.nextInt();

        }
        int mid = (size - 1) / 2;

        System.out.println(arra[mid]);

    }
}