import java.util.Scanner;
public class School{
    String pasorfail(int a){
        if (a<35){
            return "Sorry you need a Mentor";
        }
        else{
            return "Your already awesome";
        }

    }
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
        int total_mark=scan.nextInt();
        School score=new School();
        System.out.println(score.pasorfail(total_mark));
        
    }
}