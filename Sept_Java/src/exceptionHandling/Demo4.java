package exceptionHandling;

import java.time.Duration;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Code Started");
		System.out.println("2");
		System.out.println("4");
		System.out.println("6");
		System.out.println("8");
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("10");
		System.out.println("12");
		System.out.println("14");
		System.out.println("16");
		
	}

}
