import java.math.BigInteger;



public class Problem16 {
	
	public static void main(String[] args){
		
		BigInteger num = new BigInteger("" + (int) Math.pow(2, 10));
		
		for(int i = 0; i < 99; i++)
			num = num.multiply(new BigInteger("" + (int) Math.pow(2, 10)));
		
		String nums = num.toString();
		System.out.println(num);
		int result = 0;
		
		for(int i = 0; i < nums.length() ; i++){
			result += Integer.parseInt("" + nums.charAt(i));
		}
		
		System.out.println("Sum: " + result);
		
	}
}
