public class MaskEmailID01 {
	
    public static void main(String[] args) {
    	
        String email = "testmail@.mailme.com";
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
    	
    	int index = email.indexOf("@");
    	String s1 = "";
    	
    	for(int i = 0 ;i < email.length();i++)
    	{
    		if(i >= 2 && i < index)
    		{
    			s1 = s1 + "X";
    		}
    		else
    		{
    			s1 = s1 + email.charAt(i);
    		}
    		
    	}
    	
       return s1;
    }

}