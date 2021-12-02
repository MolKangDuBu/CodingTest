

import java.util.Scanner;

class MyUtil
{
   Scanner sc = new Scanner(System.in);
   public void readArray(int []nums)
   {
      for(int i=0; i<nums.length; i++)
      {
         System.out.printf("%d번째 : ", i+1);
         nums[i] = sc.nextInt();
      }
   }
   
   public void writeArray(int []nums)
   {
      for(int i=0; i<nums.length; i++)
      {
         System.out.printf("%4d", nums[i]);
      }
      System.out.println();
   }
   
   //배열주면 최대값 위치 반환함수 
   int getMaxPos(int []nums)
   {
      int max;
      int pos;
      
      max=nums[0];
      pos = 0;
      for(int i=1; i<nums.length; i++)
      {
         if( max<nums[i])
         {
            max = nums[i];
            pos = i;
         }
      }
      
      return pos;
   }
}

public class Test {
   
   public static void main(String[] args) {
      int []a=new int[10];
   
      MyUtil util = new MyUtil();
      //util.readArray(a);
      //util.writeArray(a);
      a = new int[] {2,3,1,5,9,8,7,11};
      int pos = util.getMaxPos(a);
      System.out.println("제일큰값 : " + a[pos]);
   
//      int []b=new int[5];
//      util.readArray(b);
//      util.writeArray(b);
//      
//      int []c=new int[7];
//      util.readArray(c);
//      util.writeArray(c);
//      
   }
}







