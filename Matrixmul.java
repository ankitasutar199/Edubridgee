
public class Matrixmul {
	// matrix multiplication 3*3
	public static void main(String args[]){  
	 
	int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
	int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
	    
	   
	int c[][]=new int[3][3];  
	    
	   
	for(int i=0;i<3;i++){  // row 
	  
		for(int j=0;j<3;j++){  // col  
			c[i][j]=0;      
			for(int k=0;k<3;k++)  // ans 3*3    
			{      
				c[i][j] = c[i][j] + a[i][k]*b[k][j];    //  1*1 + 1*2 + 1*3   = 6
			} 
	   System.out.print(c[i][j]+" ");   
	    } 
		System.out.println();   
	  }    
	}
	}


