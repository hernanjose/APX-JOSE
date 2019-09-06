package bbva.apx.kata1;

public class kata1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dig="57727277272";
		int m=0;
		int p=0;
	       for(int i=0;i<dig.length();i++){
	    	   p=Integer.parseInt(dig.substring(m,i+1));
	    	   if(p==5) {
	    		 p=5;  
	    	   }else if(p<5) {
	    		   p=0;
	    	   }else  {
	    		   p=1;
	    	   }
	             System.out.println(p);
	             m++;
	            
	        }

	}

}
