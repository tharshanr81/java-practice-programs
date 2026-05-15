// class demo1234 { // this is own way
//     public static void main(String[] arg) {
//         for (int i = 1; i <= 3; i++) {

//             System.out.println("*".repeat(i));
//         }
//     }
// }

// this is traditional method
class demo1233 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
