package PracticeAssessments;

class Punc
{
	public char[] countPuncMarks;
	void display() {
	int countPuncMarks = 0;  
	String str = "Good Morning! Mr. James Potter. Had your breakfast?";
	{
    for (int i = 0; i < str.length(); i++) 
    {  
        if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '-' ||  
                str.charAt(i) == '\'' || str.charAt(i) == '/' || str.charAt(i) == ':') 
        {  
            countPuncMarks++;  
        }  
    }  
	}
	
}
public class Punctuation 

{  
	    public static void main (String [] args) {  
	        //Stores the count of punctuation marks  
	    	Punc obj=new Punc();
	    	System.out.println(obj.countPuncMarks);
	    	obj.display();
	    	
	        
	         
	    }  
	 

}}
