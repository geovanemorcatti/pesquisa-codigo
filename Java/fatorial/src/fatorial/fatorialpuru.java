package fatorial;

public class fatorialpuru {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
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
	    long elapsed = System.currentTimeMillis() - start;

	   System.out.println(elapsed-start );
	   
	}

}
