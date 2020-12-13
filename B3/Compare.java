package B3;

public class Compare {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		String s1 = "Hello ";
		String s2 = "world ";
		String s3 = "!!!! ";
		String s0 = s1+s2+s3;
		System.out.println(s0);
		long time2 = System.nanoTime();
		System.out.println("Thời gian cần thiết: " + (time2-time1));
		
		long time3 = System.nanoTime();
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello ");
		buffer.append("world ");
		buffer.append("!!!! ");
		String str = buffer.toString();
		System.out.println(str);
		long time4 = System.nanoTime();
		System.out.println("Thời gian cần thiết: " + (time4-time3));
	}
}


