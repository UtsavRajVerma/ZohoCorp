// Find Minimum in Rotated Sorted Array
// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

// [4,5,6,7,0,1,2] if it was rotated 4 times.
// [0,1,2,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.




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
