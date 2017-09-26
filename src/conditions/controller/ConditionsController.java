package conditions.controller;

import conditions.view.ConditionsDisplay;

public class ConditionsController {
	private ConditionsDisplay popup;
	public ConditionsController () {
		popup = new ConditionsDisplay();
	}
	public void start() {
		String str = "I am a String";
		// if test
		int num = 1365;
		String numb = "";
		boolean boo = false;
		numb = popup.getResponse("Type a Number.");
		num = Integer.parseInt(numb);
		if (num < 4265) {
			popup.displayText(str);
			boo = true;
			//nested if
			if(boo) {
				popup.displayText(numb);
				//sequential if
				if (num < 1000) {
					popup.displayText("num is less than 1000");
				}
				if (num == 1000) {
					popup.displayText("num is 1000");
				}
				if (num > 1000) {
					popup.displayText("num is greater than 1000");
				}
				//if else
				if (str.substring(0,3).equals("I a")) {
					popup.displayText(str + " yes");
				} else {
					popup.displayText(str + " no");
					boo = false;
					//nested if else
					if (boo == false) {
						num = 1234567;
					} else {
						num = 123456;
					}
					popup.displayText(numb);
				}
			}
			//if else if else
			if ((num % 2) == 0) {
				popup.displayText(num + " is even.");
			} else if ((num % 3) == 0) {
				popup.displayText(num + " is divisable by 3.");
			} else {
				popup.displayText(num + " is dumb. :(");
			}
		}
	}
}
