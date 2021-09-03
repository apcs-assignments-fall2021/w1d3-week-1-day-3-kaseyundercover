import java.util.Scanner;

public class MyMain {
    // Adds 5 to the given integer
    // This method has been written for you
    public static int add5(int x) {
        return (x + 5);
    }

    // Given three ints x, y, and z, this method
    // returns the largest of the three numbers
    public static int findBiggestNumber(int x, int y, int z) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter number");
//        int x = scan.nextInt();
//        System.out.println("enter another number");
//        int y = scan.nextInt();
//        System.out.println("enter another number");
//        int z = scan.nextInt();

        if (x>y && x>z) {
        System.out.println(x + " is the biggest number");}
        else if (y>z && y>x){
        System.out.println(y + " is the biggest number");}
        else if (z>x && z>y){
        System.out.println(y + " is the biggest number");}


        return 0;
    }

    // This method simulates the flip of a coin, where
    // true represents "heads" and false represents "tails"
    // This method should return true half the time, and false the other half
//    public static boolean flipCoin()
        // REPLACE THIS WITH YOUR CODE
//        if (Math.random() >= 0.5) {
//            return true;
//        }
//        else {
//            return false;

           // return (Math.random() >= 0.5);




    // This method simulates the flip of a weighted coin,
    // that is a coin that is biased towards heads
    public static boolean flipWeightedCoin() {
        // REPLACE THIS WITH YOUR CODE
        return false;
    }

    // This method rounds a double to the nearest whole number
    public static int round(double d) {
        // REPLACE THIS WITH YOUR CODE
        return 0;
    }

    // This method returns a random number between 1 and 6, inclusive
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

//        if (r>0 && r<1){
//        return 1;
//        else if (r>1 && r<2){
//        return 2;
//        else if (r>2 && r<3){
//        return 2;
//        else if (r>3 && r<4){
//        return 3;
//        else if (r>4 && r<5){
//        return 4;
//                        }
//        else if (r>5 && r<5.99999999){
//        return 5;
//                    }
//                    }
//
//        }
//    }

    // This method carries out the quadratic formula and *prints* out the answers
//    public static void quadForm(int a, int b, int c) {
//        return;
//    }
//
    public static void main(String[] args) {
        // Test the add5 method
        int x = 2;
        int y = add5(x);
        System.out.println(y);

        System.out.println(rollDie());
    }
}

