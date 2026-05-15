import java.util.Scanner;
class getwell{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the income:");
        int income=scan.nextInt();
        if(income > 7000){
            System.out.print("ScholarShips are Available for you buddy");
        }
        else{
            System.out.print("Sorry, try to get the best job and increase the salary");
        }
    }
}