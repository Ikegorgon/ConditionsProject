package conditions.controller;

public class ConditionsController {
	public void start() {
		String str = "I am a String";
		// if test
		int num = 1365;
		boolean boo = false;
		if (num < 4265) {
			System.out.println(str);
			boo = true;
			//nested if
			if(boo) {
				System.out.println(num);
				//sequential if
				if (num < 1000) {
					System.out.println("num is less than 1000");
				}
				if (num == 1000) {
					System.out.println("num is 1000");
				}
				if (num > 1000) {
					System.out.println("num is greater than 1000");
				}
				//if else
				if (str.substring(0,3).equals("I a")) {
					System.out.println(str + " yes");
				} else {
					System.out.println(str + " no");
					boo = false;
					//nested if else
					if (boo == false) {
						num = 1234567;
					} else {
						num = 123456;
					}
					System.out.println(num);
				}
			}
			//if else if else
			if ((num % 2) == 0) {
				System.out.println(num + " is even.");
			} else if ((num % 3) == 0) {
				System.out.println(num + " is divisable by 3.");
			} else {
				System.out.println(num + " is dumb. :(");
			}
		}
	}
}
