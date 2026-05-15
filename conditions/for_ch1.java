import java.util.Scanner;

class evenbetw{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter A :");
        int a=scan.nextInt();
        System.out.println("Enter A :");
        int b=scan.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}