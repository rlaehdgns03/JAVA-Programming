import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		int pay;
		int hours;
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ð��� �Է��ϼ���:");
		hours=input.nextInt();
			if(hours>0) {
				pay = hours*8350;
				System.out.printf("�ӱ��� %d�Դϴ�.\n", pay);
			}
			else {
				System.out.println("�ð��� �߸� �ԷµǾ����ϴ�.");
			}
			

	}

}
