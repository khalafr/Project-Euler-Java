
import java.util.PriorityQueue;
import java.util.Comparator;

public class Problem3 {

	
		public static void main(String[] args){
			long num = 600851475143L;
			long result = 2;
			
			PriorityQueue<Long> q = new PriorityQueue<Long>(1, new Comparator<Long>(){

				public int compare(Long arg0, Long arg1) {
					
					return arg0.compareTo(arg1) * -1;
				}
				
			});
			
			while( num > 1 ){
				while( num % result == 0){
					q.offer(result);
					num /= result;
				}
				result += 1;
			}
			
			System.out.println(q.poll());
		}
		
		public static boolean isPrime(long x){
			if(x == 2) return true;
			if(x == 3) return true;
			if(x < 2) return false;
			
			return ((x % 2 != 0) && (x % 3 != 0));
		}
}
