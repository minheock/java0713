package sol_algorithm;

public class Al10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(10);
	}
	
	public static void solution(int n) {
        int num = 0;
        if(n % 2 == 0){
        	num += (n*n);
            solution(n-2);
        }else if(n%2==1){
        	num += n;
            solution(n-2);
        }
        if(n <= 1){
        	System.out.println(num);
            return;
        }      
    }
}
