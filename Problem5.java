
public class Problem5 {

	
		public static void main(String[] args){
			int count = 1;
			boolean result = true;
			while(true){
				for(int i = 1; i<21; i++ ){
					result = result & (count % i == 0);
				}
				
				if(result){
					System.out.println(count);
					break;
				} else {
					count += 1;
					result = true;
				}
			}
		}
}
