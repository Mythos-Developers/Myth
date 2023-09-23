package net.mythos.util;

public class Convert {

	public static int hexToDec(String hexVal) {

		int len = hexVal.length();

		int base = 1;

		int dec_val = 0;

		for (int i = len - 1; i >= 0; i--) {

			// Condition check
			// Case 1
			// If character lies in '0'-'9', converting
			// it to integral 0-9 by subtracting 48 from
			// ASCII value
			if (hexVal.charAt(i) >= '0'
					&& hexVal.charAt(i) <= '9') {
				dec_val += (hexVal.charAt(i) - 48) * base;

				// Incrementing base by power
				base = base * 16;
			}

			// Case 2
			// if case 1 is bypassed

			// Now, if character lies in 'A'-'F' ,
			// converting it to integral 10 - 15 by
			// subtracting 55 from ASCII value
			else if (hexVal.charAt(i) >= 'A'
					&& hexVal.charAt(i) <= 'F') {
				dec_val += (hexVal.charAt(i) - 55) * base;

				// Incrementing base by power
				base = base * 16;
			}
		}

		return dec_val;

	}

}
