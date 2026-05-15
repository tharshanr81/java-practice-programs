import java.util.Scanner;

class eatsje {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the mark:" );
        int mark = scan.nextInt();
        
        if (mark >= 35) {
            System.out.print("Passeed buddy");

        } else {
            System.out.println("Sorry buddy, You have to hard for next time");
        }
    }
}