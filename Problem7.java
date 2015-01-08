import java.util.ArrayList;


public class Problem7 {
	public static boolean isPrime(long x){
		for(int i = 2; i <= x/2 ; i++){
			if(x % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		
		
		int count = 0;
		
		for(int i = 2; i < Integer.MAX_VALUE; i++){
			if(isPrime(i)){
				count++;
				
				if(count == 10001){
					System.out.println(i + " and " + count);
					break;
				}
			}
		}
		
	}
}
