
public class Assignment2 {

	public static void main(String[] args) {
		int n1=0,n2=1,count=10;   
		
		 for(int i=2;i<count;++i)
		 {    
		  int n3=n1+n2;    
		  System.out.println(n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}

}
