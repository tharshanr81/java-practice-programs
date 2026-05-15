import java.util.Scanner;

class ifelseq {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String meghana = scan.nextLine();
        System.out.print(meghana);
        if (meghana.equals("dead")) {
            System.out.print("Surya Meets Ramya");
        } else {
            System.out.print("Surya weds meghana");
        }
    }
}