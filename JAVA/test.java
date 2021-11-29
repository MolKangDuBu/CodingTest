/**
 * test
 */
public class test {

	public static void main(String[] args) {

		int line =9;
		if(line%2==0)  // 짝수일때 홀수로 만들고
		{
		   line = line+1;
		}
		else
		   line = line/2+1;  //  9/2 ->4 +1 =>5
		System.out.println(line);
		
		int i ,j;
		   for(i=1 ; i<=line ; i++)
		   {
			   for(j=1 ; j<=line-i ; j++) {
				  System.out.print(" ");
			   }
			   for(j=1;j<=2*i-1;j++){
				  System.out.print("*");
			   }
			   System.out.println();
			}
		
	
		for(i=1; i<=line-1 ;i++)
		{
		
		   for(j=1; j<=i ; j++)
		   {
			  System.out.print(" ");
		   }
		   for(j=1 ; j<=2*(line - i)-1 ; j++)
		   {
			  System.out.print("*");
			}
		   System.out.println();
		} 
	 }
	}
	 
