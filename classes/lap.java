public class lap {
    String name = "";
    String proc = "";
    int Ram = 0;
    int price=0;

    public static void main(String[] args){
        lap lap1=new lap();
        lap lap2=new lap();
        lap lap3=new lap();

        lap1.name="Hpp";
        lap2.name="hock";
        lap3.name="leno";
        lap1.proc="i3";
        lap2.proc="i5";
        lap3.proc="i9";
        lap1.Ram=8;
        lap2.Ram=16;
        lap3.Ram=32;
        lap1.price=21000;
        lap2.price=24500;
        lap3.price=56000;
        System.out.println(lap1.name);
        System.out.println(lap2.name);
        System.out.println(lap3.name);

    }
}
