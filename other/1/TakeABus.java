public class TakeABus {
	public static void main(String[] args) {
		System.out.println("统计公交车到站后车上一共有多少个人");
		int per_num = 0;		// 初始人数为 0
		
		per_num += 1;
		System.out.println("第一站： 上去一位乘客,此时车上有乘客 " + per_num + " 位");
		
		per_num += 2;
		per_num -= 1;
		System.out.println("第二站： 上去两位乘客，下来一位乘客,此时车上有乘客 " + per_num + " 位");
		
		
		per_num += 2;
		per_num -= 1;
		System.out.println("第三站： 上去两位乘客，下来一位乘客,此时车上有乘客 " + per_num + " 位");
		
		per_num -= 1;
		System.out.println("第四站： 下来一位乘客,此时车上有乘客 " + per_num + " 位");
		
		per_num += 1;
		System.out.println("第五站： 上去一位乘客,此时车上有乘客 " + per_num + " 位");
		System.out.println("终点站： 此时车上有乘客 " + per_num + " 位");
	}
}