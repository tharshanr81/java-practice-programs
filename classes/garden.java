public class garden {

    void total_money(int apple_price, int apple_count) {
        int add = apple_price + apple_count;
        System.out.println(add);

    }

    public static void main(String[] args) {
        int apple_price = 20;
        int apple_count = 5;
        garden obe = new garden();
        obe.total_money(apple_price, apple_count);
    }
}
