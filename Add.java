import java.util.Scanner; // Scanner 클래스 포함

public class Add {  // main 메소드에서 실행이 시작 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 사용자로부터 입력을 받기 위해서 Scanner객체를 생성
		int x=5;
		int y=0;
		int sum;
		
		System.out.println("첫번째 숫자를 입력하시오:");
		x = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오:");
		y = input.nextInt();
		
		sum = x/y;
		
		System.out.println(sum);
		System.out.println("나눈값 = " +x/y);

	}

}
