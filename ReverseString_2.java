//Reverse String II
//Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
//If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.


public class ReverseString_2 {

//	Space-O(n)
//	Time-O(n)
	
	    public String reverseStr(String s, int k) {
	      
	        char arr[]=s.toCharArray();
	        
	        for(int i=0;i<s.length();i+=2*k){
	            int start=i;
	            int end=Math.min(start+k-1,arr.length-1);
	            
	            while(start<end){
	                char temp=arr[start];
	                arr[start++]=arr[end];
	                arr[end--]=temp;
	            }
	        }
	        return new String (arr);
	    }
	
}
