import java.util.Scanner; // Scanner Ŭ���� ����

public class Add {  // main �޼ҵ忡�� ������ ���� 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // ����ڷκ��� �Է��� �ޱ� ���ؼ� Scanner��ü�� ����
		int x=5;
		int y=0;
		int sum;
		
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ�:");
		x = input.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�:");
		y = input.nextInt();
		
		sum = x/y;
		
		System.out.println(sum);
		System.out.println("������ = " +x/y);

	}

}
