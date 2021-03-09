import java.util.*;
import java.io.*;

public class Rotated_Sorted_Array_Minimum {
	// Space-O(1)
	// Time-O(n)
	
//	Approach1:
	public int findMin1(int[] nums) {
        if(nums.length==0) return 0;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) return nums[i+1];
        }
        return nums[0];
    }
	
	
	
	
	// Space-O(1)
	// Time-O(logn)
	
//	Approach2:
	 public static int findMin2(int[] nums) {
	        if(nums.length==0) return -1;
	        if(nums.length==1) return nums[0];
	        
	        int left=0;
	        int rt=nums.length-1;
	        int mid;
	        
	        while(left<=rt){
	            mid=left+(rt-left)/2;
	        
	            if(mid>0 && nums[mid-1]>nums[mid]) return nums[mid];
	            else if(nums[left]<=nums[mid] && nums[mid]>nums[rt]) left=mid+1;
	            else rt=mid-1;
	        }
	        return nums[left];
	    }
	

}
