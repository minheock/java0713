package practice.submit01;

public class reuslt04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 0도 이상 ~ 60도 미만: 사탕
60도 이상 ~ 120도 미만: 초콜릿
120도 이상 ~ 180도 미만: 쿠키
180도 이상 ~ 240도 미만: 콜라
240도 이상 ~ 300도 미만: 아이스크림
300도 이상 ~ 360도 미만: 커피
		 */
	// 문제 1
		int ruleNum = 5843;
		int Nums = ruleNum;
		int count = 0;
		String gift = "";
		
		// 방법 1
		System.out.println("방법1");
		int ruleCycle = ruleNum/360;
		int rule2 = ruleNum % 360;
		if(rule2 >= 300 && rule2 < 360) {
			gift = "커피";
		}else if(rule2 >= 240) {
			gift = "아이스크림";
		}else if(rule2 >= 180) {
			gift = "콜라";
		}else if(rule2 >= 120) {
			gift = "쿠키";
		}else if(rule2 >= 60) {
			gift = "초콜릿";
		}else {
			gift = "사탕";
		}
		System.out.printf("경품 : %s\n돌아간 바퀴수 : %d\n", gift, ruleCycle);
		// 방법 2
		System.out.println("--------------");
		System.out.println("방법2");
		for(int i = 360; i < ruleNum; i+=360){
			count++;
			Nums -= 360;
			System.out.printf("%d 바퀴를 돌고있습니다\n남은 각도: %d도\n",count, Nums);
		}
		if(Nums >= 300 && Nums < 360) {
			gift = "커피";
		}else if(Nums >= 240) {
			gift = "아이스크림";
		}else if(Nums >= 180) {
			gift = "콜라";
		}else if(Nums >= 120) {
			gift = "쿠키";
		}else if(Nums >= 60) {
			gift = "초콜릿";
		}else {
			gift = "사탕";
		}
		
		System.out.printf("경품 : %s\n돌아간 바퀴수 : %d\n", gift, count);
		
		
	// 문제 2
		String revers = "로꾸꺼 로꾸꺼";
		String subRevers = "";
		for(int i = revers.length()-1 ; i < revers.length(); i--) {
			subRevers += revers.substring(i, i+1);
			if(i == 0) {
				break;
			}
		}
		System.out.printf("거꾸로 뒤집을 문자열 : %s\n뒤집은 문자열 : %s\n",revers,subRevers);
		
		
	
	// 문제 3
//		System.out.println("sfsdfsdf".substring(0,1));
		String tree = "*";
//		tree = "     " + tree;
//		System.out.println(tree);
//		for(int i = 0; i<5; i++) {
//			tree = tree.substring(0,1).replace(" ","");
//			String in = "**";
//			tree = tree.format("%s%s",tree, in);
//		}
//		System.out.println(tree);
		for (int i = 0; i < 5; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println(tree);
			tree += "**";
		}
	
		System.out.println("\n");
		
		int stop = 0;
		for (int i = 0; i < 5; i++) {
			stop = 0;
			for (int j = stop; j < i+1; j++) {
				System.out.print(" ");
			}
			tree = tree.substring(0, tree.length()-2);
			System.out.println(tree);
		}
		
		
	}
}	

