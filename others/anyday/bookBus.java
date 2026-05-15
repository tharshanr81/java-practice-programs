public class bookBus {
    public static void main(String[] args) {
        int[] seats = { 0, 1, 1, 1, 0, 0, 0, 1, 1, 0 };
        int count = 0;
        int count_ava = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                System.out.println("Available seats " + seats[i]);
                count_ava++;
            } else {
                count++;
            }
        }
        System.out.println("The "+count+" seats are booked");
        System.out.println("you have " + count_ava + " seats available");
        if (count_ava > 0) {
            count_ava = count_ava - 1;
            System.out.println(
                    "you successfully booked your seats and remaining " + count_ava + " seats are their in the bus");
        }
    }
}
