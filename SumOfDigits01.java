
public class SumOfDigits01 
{
    public static void main(String[] args) {

    	int num = 45;
        System.out.println(getSumOfDigits(num));
    }

    public static int getSumOfDigits(int num)	{
	    //ADD YOUR CODE HERE
    	
    	int sum = 0;
    	int digit;
    	
    	if(num >= 10 && num <= 99)
    	{
    		while(num > 0)
    		{
    			digit	= num % 10;
    			num		= num / 10;
    			sum		= sum + digit;
    			
    		}
    		return sum;
    	}
    	else
    	{
    		return 0;
    	}
    }
}