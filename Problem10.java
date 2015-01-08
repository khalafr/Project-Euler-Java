
public class Problem10 {

	
		public static boolean isPrime(long x){
			if( x == 2 ) return true;
			if( x == 3 ) return true; 
			if(x%2==0) return false;
			
			for(int i = 3; i*i <= x ; i+=2){
				if(x % i == 0)
					return false;
			}
		
			return true;
		}
	
		public static void main(String[] args){
			
			long sum = 0;
			
			for(int i = 2; i <= 2000000; i++){
				if(isPrime(i))
					sum += i;
			}
			
			System.out.println("Sum: " + sum);
			
		}
}
