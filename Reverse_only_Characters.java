
public class Reverse_only_Characters {

//	Space- O(n)
//	Time- O(n)
	
	    public String reverseOnlyLetters(String s) {
	        int i=0;
	        int j=s.length()-1;
	    
	        char arr[]=s.toCharArray();
	        
	        while(i<=j){
	            while(i<j && !Character.isLetter(s.charAt(i))){
	                i++;
	            }while(j>i && !Character.isLetter(s.charAt(j))){
	                j--;
	            }
	                char temp= arr[i];  
	                arr[i]=arr[j];
	                arr[j]=temp;
	                i++;
	                j--;
	            }        
	        return new String (arr);
	    }
	}
	
