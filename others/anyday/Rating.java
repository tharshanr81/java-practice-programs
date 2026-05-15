class Rating {
    public static void main(String... a) {
        int[] ratings = { 1, 4, 3, 2, 5, 4, 3, 5, 5, 3, 1, 3, 4, 1, 5 };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum = sum + ratings[i];
            if (ratings[i] == 5) {
                count++;
            }
        }
        int aver = sum / ratings.length;
        System.out.println("The Average rating:" + aver);
        System.out.println("The 5 star count:" + count);
    }
}
