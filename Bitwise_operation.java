import java.util.Scanner;
public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        System.out.println("\nBinary of " + a + ": " + Integer.toBinaryString(a));
        System.out.println("Binary of " + b + ": " + Integer.toBinaryString(b));

        System.out.println("\nBitwise AND (a & b): " + Integer.toBinaryString(andResult));
        System.out.println("Bitwise OR  (a | b): " + Integer.toBinaryString(orResult));
        System.out.println("Bitwise XOR (a ^ b): " + Integer.toBinaryString(xorResult));
        sc.close();
    }
}