public class function_overloading {
    void display(int a){
        System.out.println(a);
    }
    void display(){
        System.out.print("without parameter");
    }
    public static void main(String arg[]){
       function_overloading sios=new function_overloading();
       sios.display(78);
       sios.display();
    }
}
