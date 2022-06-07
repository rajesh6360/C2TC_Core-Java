
public class do_while_loop {

	public static void main(String[] args) {
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }

			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	

			int i1=1,j1=1;
			do {
				i1++;
				j1++;
				System.out.println("i=" + i1 + " and j=" + j1);
			    }while (i1 < 10 || j1 < 10);
	}

}
