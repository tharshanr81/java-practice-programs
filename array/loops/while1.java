import java.util.Random;
public class while1 {
    public static void main(String[] arg){
       Random ran=new Random();
       int neww =0;
       while(neww !=5){
         neww=ran.nextInt(11);
        System.out.println(neww);
       }

    }
}
