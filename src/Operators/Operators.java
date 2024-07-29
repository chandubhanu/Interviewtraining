package Operators;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic Operators
		int a = 5, b = 3;
		System.out.println("Arithmetic Operators:");
		System.out.println("Addition: " + (a + b)); // 8
		System.out.println("Subtraction: " + (a - b)); // 2
		System.out.println("Multiplication: " + (a * b)); // 15
		System.out.println("Division: " + (a / b)); // 1
		System.out.println("Modulus: " + (a % b)); // 2

		// Unary Operators
		System.out.println("\nUnary Operators:");
		int c = +a;
		System.out.println("Unary plus: " + c); // 5
		c = -a;
		System.out.println("Unary minus: " + c); // -5
		c = a++;
		System.out.println("Post-increment: " + c); // 5 (a is now 6)
		c = a--;
		System.out.println("Post-decrement: " + c); // 6 (a is now 5)
		c = ++a;
		System.out.println("Pre-increment: " + c); // 6 (a is now 6)
		c = --a;
		System.out.println("Pre-decrement: " + c); // 5 (a is now 5)

		// Assignment Operators
		System.out.println("\nAssignment Operators:");
		int d = 5;
		d += 3;
		System.out.println("Add and assign: " + d); // 8
		d -= 3;
		System.out.println("Subtract and assign: " + d); // 5
		d *= 3;
		System.out.println("Multiply and assign: " + d); // 15
		d /= 3;
		System.out.println("Divide and assign: " + d); // 5
		d %= 3;
		System.out.println("Modulus and assign: " + d); // 2

		// Comparison Operators
		System.out.println("\nComparison Operators:");
		System.out.println("Equal to: " + (a == b)); // false
		System.out.println("Not equal to: " + (a != b)); // true
		System.out.println("Greater than: " + (a > b)); // true
		System.out.println("Less than: " + (a < b)); // false
		System.out.println("Greater than or equal to: " + (a >= b)); // true
		System.out.println("Less than or equal to: " + (a <= b)); // false

		// Logical Operators
		System.out.println("\nLogical Operators:");
		boolean x = true, y = false;
		System.out.println("Logical AND: " + (x && y)); // false
		System.out.println("Logical OR: " + (x || y)); // true
		System.out.println("Logical NOT: " + (!x)); // false

		// Bitwise Operators
		System.out.println("\nBitwise Operators:");
		int e = 5; // 0101 in binary
		int f = 3; // 0011 in binary
		System.out.println("Bitwise AND: " + (e & f)); // 1 (0001)
		System.out.println("Bitwise OR: " + (e | f)); // 7 (0111)
		System.out.println("Bitwise XOR: " + (e ^ f)); // 6 (0110)
		System.out.println("Bitwise Complement: " + (~e)); // -6 (bitwise complement of 0101 is 1010, which is -6 in
															// two's complement)

		// Shift Operators
		System.out.println("\nShift Operators:");
		System.out.println("Left shift: " + (e << 1)); // 10 (0101 << 1 = 1010)
		System.out.println("Right shift: " + (e >> 1)); // 2 (0101 >> 1 = 0010)
		System.out.println("Unsigned right shift: " + (e >>> 1)); // 2 (0101 >>> 1 = 0010)

		// Ternary operator
		int ab = 5, ba = 3;
		String result = (a > b) ? "a is greater than b" : "a is not greater than b";
		System.out.println("Ternary Operator:");
		System.out.println(result); // "a is greater than b"

		// Another example with ternary operator
		int xh = 10, yh = 20;
		int max = (xh > yh) ? xh : yh;
		System.out.println("The maximum value is: " + max); // 20
	}
}
