
public class Problem12 {

	
		public static int getNumberOfDivisors(long x){
			int count = 0;
			for(int i = 1; i < (int) Math.sqrt(x); i++){
				if( x % i == 0)
					count += 2;
			}
			
			return count;
		}
		
		public static void main(String[] args){
			
			int natural = 1;
			long result = 0;
			
			while(true){
				result += natural;
				System.out.println("Trying: " + result);
				if(getNumberOfDivisors(result) >= 500){
					System.out.println(result);
					break;
				}
				
				natural++;
			}
		}
		
}
