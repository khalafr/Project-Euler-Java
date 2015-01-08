
public class Problem1 {
	
	public static void main(String[] args){
		long[] fib = new long[1000];
		fib[0] = 0;
		fib[1] = 1;
		
		int sum = 0;
		
		for(int i = 2; i < 1000; i++){
			fib[i] = fib[i-1] + fib[i-2];
			
			if(fib[i] > 4000000)
				break;
			
			if(fib[i] % 2 == 0){
				sum += fib[i];
			}
			
		}
		
		System.out.println("Sum =" + sum);
	}
}
