package sol_algorithm;

public class Al9 {

	public static void main(String[] args) {
		 int end;
		 int a = 8;
		 int b = 15;
	     String firstStr = Integer.toString(a) + Integer.toString(b);
	     String lastStr = Integer.toString(b) + Integer.toString(a);
	     System.out.println();
	     
	      int firstNum = Integer.parseInt(firstStr);
	      int lastNum = Integer.parseInt(lastStr);
	    
	       if(firstNum == lastNum){
	           end = firstNum;
	       }else if(firstNum > lastNum){
	           end =firstNum;
	       }else{
	           end = lastNum;
	       }
	       System.out.println(end); 
	}

}
