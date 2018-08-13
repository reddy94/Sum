public class natural {
	
	public static int sumOfDigits(int n)
	{
		int fd=n/10;
		int ld=n%10;
		int sum=fd+ld;
		return sum;
	}
	public static void main(String[] args){
		int n=24;
				int sum=sumOfDigits(n);
		System.out.println(sum);
	}
}
