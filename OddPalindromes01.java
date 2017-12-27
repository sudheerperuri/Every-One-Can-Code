public class OddPalindromes01 {
    public static void main(String[] args) {
        int num1 = 1500;
        int num2 = 2000;
        System.out.println(generateOddPalindromes(num1, num2));
    }

    public static String generateOddPalindromes(int start, int limit) {
    	String s = "-1";
    	String a = "-2";
    	String b = "-3";
    	String c = "";
    	
    	if(start > 0 && limit > 0)
    	{
    		if(start < limit)
    		{
    			for(int i = start;i <= limit;i++)
    			{
    				if(isAllDigitsOdd(i))
    				{
    					if(isPalindrome(i))
    						c = c + i + ",";
    				}		
    			}
    		}
    		else
    		{
    			return a;
    		}
    	}
    	else
    	{
    		return s;
    	}
    	if(c.length() == 0)
    	{
    		return b;
    	}
    	else
    	return c.substring(0,c.length()-1);
    }

    public static boolean isPalindrome(int num) {
    	
    	if(reverse(num) == num)
    	{
    		return true;
    	}
    	else
    		return false;
    	

    }

    public static int reverse(int num) {
    
    	int digit;
    	int rev = 0;
    	
    	while(num > 0)
    	{
    		digit = num % 10;
    		num = num / 10;
    		rev = rev * 10 + digit;
    	}
    	
    	return rev;
    }

    public static boolean isAllDigitsOdd(int num) {
        
    	int digit;
    	int c = 0;
    	
    	while(num > 0)
    	{
    		digit = num % 10;
    		num = num / 10;
    		
    		if(digit % 2 == 0 && digit != 0)
    		{
    			c++;
    		}
    	}
    	if(c == 0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}
