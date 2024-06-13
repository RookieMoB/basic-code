import java.util.Scanner;
public class MyScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的年龄");
		int age = sc.nextInt();
		System.out.println("您的年龄为 " + age);
	}
}