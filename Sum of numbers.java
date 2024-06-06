import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str;
    int tot =0;
    System.out.println("enter the value:");
    str=sc.nextLine();
     
    String[] nums=str.split(",");
     System.out.println("Array elements are-");
        
      System.out.println("enter the value:");
      str =sc.nextLine();
    
       System.out.println("array elements are -");
      for(int i=0;i<nums.length;i++)
      {
         System.out.println(nums[i]);
         tot=tot+Integer.parseInt("sum ="+tot);
      }
      System.out.println("Sum="+tot);
  }
}
