

public class Problem15 {

	
	public static void main(String[] args){
		
		
		System.out.println("Count: " + iterCount(20));
		
	}
	
	public static long pathCount(int row, int col){
		
		if((row == 19) && (col == 19))
			return 1;
		if((row < 20) && (col < 20))
			return pathCount(row+1, col) + pathCount(row, col+1);
		if(row < 20)
			return 1 + pathCount(row+1, col);
		if(col < 20)
			return 1 + pathCount(row, col+1);
		
		return 0;
	}
	
	public static long iterCount(int sizeOf){
		long[] l = new long[sizeOf+1];
		
		for( int i = 0; i <= sizeOf ; i++)
			l[i] = 1L;
		
		
		int i = 1;
		
		while( i <= sizeOf ){
			int j = 1;
			while( j < i){
				l[j] = l[j] + l[j-1];
				j++;
				
			}
			l[i] = 2L * l[i-1];
			i++;
		}
		
		return l[sizeOf];
	}
}

