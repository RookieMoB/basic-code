import java.util.Scanner;
public class NumAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		System.out.println("请输入第一个值");
		num1 = sc.nextInt();
		System.out.println("请输入第二个值");
		num2 = sc.nextInt();
		int num = num1 + num2;
		System.out.println("他们的和为: " + num);
	}
}