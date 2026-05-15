import java.util.Scanner;
class array1{
    public static void main (String[] arg){
        int[] books=new int[5];
        Scanner scan =new Scanner(System.in);
        books[0]=scan.nextInt();
        books[1]=scan.nextInt();
        books[2]=scan.nextInt();
        books[3]=scan.nextInt();
        books[4]=scan.nextInt();
        System.out.println(books[0]+books[1]+books[2]+books[3]+books[4]);

    }
}