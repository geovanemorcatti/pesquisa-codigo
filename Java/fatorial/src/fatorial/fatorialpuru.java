package fatorial;

public class fatorialpuru {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(null);        
	    int f = 1; 
	    int c = n; 
	    String s = ""; 

	    while(c>=1){ 
	        f *= c;
	        if (c == 1) {
	            s += c; 
	        } else if (c>1) {
	            s += c + " x " ;
	        }
	        c--;
	    }

	   System.out.println();
	   
	}

}
