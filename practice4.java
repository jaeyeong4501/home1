package chapter2;

public class practice4 {
	public static void main(String [] args) {
		//1번
		System.out.println("1번");
		int num1=10;
		int num2=2;
		char operator = '+';
		
		if(operator == '+') {
			System.out.println(num1 + num2);
		}else if(operator == '-'){
			System.out.println(num1 - num2);
		}else if(operator == '*'){
			System.out.println(num1 * num2);
		}else if(operator == '/'){
			System.out.println(num1 / num2);
		}
		
		switch(operator){
			case '+' :
				System.out.println(num1 + num2);
				break;
			case '-' :
				System.out.println(num1 - num2);
				break;
			case '*' :
				System.out.println(num1 * num2);
				break;
			case '/' :
				System.out.println(num1 / num2);
				break;
		}
		
		//2번
		System.out.println();
		System.out.println("2번");
		for(int i=2; i<=9; i++) {
			if(i%2==1) {
				continue;
			}
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}
		
		//3번
		System.out.println();
		System.out.println("3번");
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j>i) {
					break;
				}
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}
		
		//4번
		System.out.println();
		System.out.println("4번");
		int count = 3;
		for(int i=4; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				if(j<=count) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			count--;
			System.out.println();
		}
		
		//5번
		System.out.println();
		System.out.println("5번");
		count = 3;
		for(int i=4; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				if(j<=count) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			count--;
			System.out.println();
		}
		count=1;
		for(int i=6; i>=4; i--) {
			for(int j=1; j<=i; j++) {
				if(j<=count) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			count++;
			System.out.println();
		}
	}
}
