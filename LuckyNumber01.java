public class LuckyNumber01 {
    public static void main(String[] args) {
        String date = "15-SEP-1995";
        System.out.println(getLuckyNumber(date));
    }

    public static int getLuckyNumber(String date) {
    	
    	String dateParts[] = date.split("-");
    	int dd = Integer.parseInt(dateParts[0]);
    	int mm = convertMMMtoMM(dateParts[1]);
    	int yyyy = Integer.parseInt(dateParts[2]);
    	
    	int sum = getSumOfDigits(dd);
    	sum = sum + getSumOfDigits(mm);
    	sum = sum + getSumOfDigits(yyyy);
    	
    	while(sum > 9)
    	{
    		sum = getSumOfDigits(sum);
    	}
       
    	return sum;
        
    }

    public static int convertMMMtoMM(String mon) {
         
    	String months = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
    	mon = mon.substring(0,3);
    	mon = mon.toUpperCase();
    	int mm = ((months.indexOf(mon)/3)+1);
    	return mm;	
    	
    }
    
    public static int getSumOfDigits(int num) {
         
    	int digit;
    	int sum = 0;
    	
    	while(num > 0)
    	{
    		digit = num % 10;
    		num = num / 10;
    		sum = sum + digit;
    	}
    	return sum;
    	
    }
}