class return1 {

    void firstName(String user) {
        System.out.println("My Name is :" + user);
        // return user;
    }

    int numberPh(int numb) {
        System.out.println("MY Number is :" + numb);
        return numb;
    }

    public static void main(String[] args) {
        return1 onb = new return1();
        return1 numer = new return1();

        onb.firstName("Tharshan");
        numer.numberPh(723432112);
    }
}