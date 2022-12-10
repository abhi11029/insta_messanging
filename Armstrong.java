import java.util.Scanner;
class Armstrong
{   
    public static void main(String[] args)    
  { 
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter any number");
       int number=sc.nextInt();         
          if(Armstrong(number)==1)
          System.out.println("Number is Armstrong number");
          else
          System.out.println("Number is not Armstrong number");       
             
  }              
         
  
  public static int CountDigit(int number)
  {
    int count=0;
    while(number!=0) 
      {
        count++;
        number=number/10;
      }
     return count;
  }
  
 public static int Power(int number,int pow)
  {

    int sum=1;
    while(pow>1)
    {
       sum=sum*number;
       pow--;
    } 
     return sum;
     
   }  

   public static int Armstrong(int number) 
   {
      int remainder=0,sum=0,power=0,armstrong=number; 

        power=CountDigit(number);

         while(number!=0) 
         {
            remainder=number%10;
            sum=sum+Power(remainder,power);
            number=number/10; 
         } 
     if(sum==armstrong)
        return 1;
    else 
        return 0;


   }











}








