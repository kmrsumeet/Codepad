
public class IsPower {
	
/* Given two positive numbers x and y, check if y is a power of x or not.*/	
	public static boolean isPower(int x, int y) 
    { 
        // The only power of 1 is 1 itself 
        if (x == 1) 
            return (y == 1); 
  
        // Repeatedly compute power of x 
        int pow = 1; 
        while (pow < y) 
            pow = pow * x; 
  
        // Check if power of x becomes y 
        return (pow == y); 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(isPower(10, 1) ? 1 : 0); 
	        System.out.println(isPower(1, 20) ? 1 : 0); 
	        System.out.println(isPower(2, 128) ? 1 : 0); 
	        System.out.println(isPower(2, 30) ? 1 : 0); 
	        
	        System.out.println(isPower(10, 1000) ? 1 : 0); 
	        System.out.println(isPower(10, 100) ? 1 : 0); 
	        System.out.println(isPower(10, 200) ? 1 : 0); 
	        System.out.println(isPower(10, 5000) ? 1 : 0); 
	}

}
