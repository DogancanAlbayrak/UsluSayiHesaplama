import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int n, k;
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the number to be raised to a power
        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = input.nextInt();
        // Prompt the user to enter the exponent
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();
        // Initialize a variable to store the total result
        int total = 1;
        int i;
        // Iterate from 1 to the value of exponent (k)
        for (i = 1; i <= k; i++) {
            total *= n;// Multiply the total by the base number (n) in each iteration
        }// Print the final result
        System.out.println(total);
    }
}