
public class Problem14 {

	
	
	public static void main(String[] args){
		int maxChainCount = Integer.MIN_VALUE;
		int maxChainElement = Integer.MIN_VALUE;
		int currentCount = 0;
		for( int i = 13; i < 1000000; i++){
			currentCount = getChainCount(i);
			if(currentCount > maxChainCount){
				maxChainCount = currentCount;
				maxChainElement = i;
			}
		}
		
		System.out.println("Result: " + maxChainElement);
	}
	
	public static int getChainCount(int x){
		
		int count = 0;
		long start = x;
		
		while(start > 1){
			count++;
			if(start % 2 == 0){
				start = start/2;
				
			}
			else {
				start = (3*start) + 1;
				
			}
		}
		
		if (( x == 910107 ) || (x == 837799))
			System.out.println("Num: " + x + " count: " + count);
		return count;
	}
}
