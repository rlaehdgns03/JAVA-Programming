import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		int month;
		int year = 2015;
		int days = 0;
		System.out.println("���� �Է��Ͻÿ�.");
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			days=31;
			break;
			
		case 4: case 6: case 9: case 11:
			days=30;
			break;

		case 2:
			days = 28;
			break;
			
		default:
			System.out.println("���� �߸� �ԷµǾ����ϴ�.");
			break;
		}
		System.out.println(month+"���� ��¥ ���� "+days+"���Դϴ�.");
		

	}

}
