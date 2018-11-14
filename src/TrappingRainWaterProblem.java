
public class TrappingRainWaterProblem {

	 /* static int findWater(int arr[], int n) 
	    { 
	        // initialize output 
	        int result = 0; 
	           
	        // maximum element on left and right 
	        int left_max = 0, right_max = 0; 
	           
	        // indices to traverse the array 
	        int lo = 0, hi = n-1; 
	           
	        while(lo <= hi)  
	        { 
	            if(arr[lo] < arr[hi]) 
	            { 
	                if(arr[lo] > left_max) 
	      
	                // update max in left 
	                left_max = arr[lo]; 
	                else
	      
	                // water on curr element =  
	                // max - curr 
	                result += left_max - arr[lo]; 
	                lo++; 
	            } 
	            else
	            { 
	                if(arr[hi] > right_max) 
	                  
	                // update right maximum 
	                right_max = arr[hi]; 
	                  
	                else
	                result += right_max - arr[hi]; 
	                hi--; 
	            } 
	        } 
	           
	        return result; 
	    } */
	      
	public static int findWater(int[] A,int n) {
	   if (A.length < 3) return 0;
    
    int ans = 0;
    int l = 0, r = A.length - 1;
    
    // find the left and right edge which can hold water
    while (l < r && A[l] <= A[l + 1]) l++;
    while (l < r && A[r] <= A[r - 1]) r--;
    
    while (l < r) {
        int left = A[l];
        int right = A[r];
        if (left <= right) {
            // add volum until an edge larger than the left edge
            while (l < r && left >= A[++l]) {
                ans += left - A[l];
            }
        } else {
            // add volum until an edge larger than the right volum
            while (l < r && A[--r] <= right) {
                ans += right - A[r];
            }
        }
    }
    return ans;
	}	
	
	    /* Driver program to test above function */
	    public static void main(String[] args)  
	    { 
	        int arr[] = {0, 1, 0, 2, 1, 0, 1, 
	                     3, 2, 1, 2, 1}; 
	        int n = arr.length; 
	          
	        System.out.println("Maximum water that "
	                       + "can be accumulated is " 
	                       + findWater(arr, n)); 
	          
	    } 
}
