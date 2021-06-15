package itwn.com.test06;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while (true) {

			try {
				sex(scanner.nextInt());
				break;

			} catch (SexException e) {
				e.printStackTrace();
			}

		}
	}
	public static void sex(int sex) throws SexException {
		if (sex>=18){
			throw new SexException("lalala");
		}

	}
}
