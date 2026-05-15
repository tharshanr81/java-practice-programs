public class Tracking {
    public static void main(String... a) {
        int[] trans = { 1400, -20, -80, 100, -200, 1600, 1400, -100, 90, 10 };
        int deposit = 0;
        int withdraw = 0;
        for (int i = 0; i < trans.length; i++) {
            if (trans[i] > 0) {
                deposit = deposit + trans[i];
            } else {

                withdraw = withdraw + (-trans[i]);
            }
        }
        System.out.println("The total deposit is " + deposit);
        System.out.println("The total withdraw is " + withdraw);
        int balance = deposit - withdraw;
        System.out.println("The balance :" + balance);
    }
}
