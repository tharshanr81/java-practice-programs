import java.util.Scanner;
public class addition {
    void add(int a,int b){
        int add=a+b;
        System.out.println(add);
    }
    void mul(int c,int d){
        int mul=c*d;
        System.out.println(mul);
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        addition ob=new addition();
        ob.add(a,b);
        ob.mul(a,b);

    }
}
