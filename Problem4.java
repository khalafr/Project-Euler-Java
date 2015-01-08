

public class Problem4 {

	
		public static void main(String[] args){
			
			int max = 999*999;
			
		
			for(int i = max; i > 9999 ; i--){
				if(isPalindrome(i)){
					for(int j = 999; j > 99; j--){
						
						if ((i % j == 0) && ((i / j) > 99) && (i/j < 1000)) {
							System.out.println(i);	
						}
					}
					
				}
			}
			
		}
		
		public static boolean isPalindrome(int num){
			StringBuffer str = new StringBuffer("" + num);
			StringBuffer rvrs = new StringBuffer("" + num);
			rvrs.reverse();
			return str.toString().equals(rvrs.toString());
		}
}
