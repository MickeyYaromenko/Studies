package by.htp.hw2.launcher;

import java.io.InputStreamReader;
import java.util.Scanner;

import by.htp.hw2.arrayandcheck.InputCheck;
import by.htp.hw2.arrayandcheck.IntArray;

public class Sort {
	public static void main(String[] Args) {
		IntArray sort = new IntArray();
		InputCheck check = new InputCheck();

		System.out.println("������� ����������� ����� �����, ����� ������� ��������:");
		System.out.println("1. ��������� ������ ���������� ����������.");
		System.out.println("2. ������� ������ �� �����.");
		System.out.println("3. �������� ����� �������.");
		System.out.println("4. ������������� ������ �� �����������.");
		System.out.println("5. ������������� ������ �� ��������.");
		System.out.println("6. ������� �� ����� ����������� ��������.");
		System.out.println("7. ������� �� ����� ������������ ��������.");

		while (true) {
			String input = check.input();
			if (check.validCheck(input)) {
				int num = Integer.parseInt(input);
				switch (num) {
				case 1:
					sort.fill();
					break;

				case 2:
					sort.print();
					break;
				case 3:
					System.out.println("������� �������� ��������, ������� ���������� �������� � ������");
					Scanner sc2 = new Scanner(new InputStreamReader(System.in));
					int num2 = sc2.nextInt();
					sort.addElement(num2);
					break;
				case 4:
					sort.ascendingSort();
					break;
				case 5:
					sort.descendingSort();
					break;
				case 6:
					sort.findMin();
					break;
				case 7:
					sort.findMax();
					break;
				}

			} else {
				System.out.println("������� ������������ ������, ������� ���������� �����:");
			}
		}

	}

}
