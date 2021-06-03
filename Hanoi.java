import java.util.Scanner;
import java.util.InputMismatchException;
public class Hanoi extends MyException
{
  private int from_rod;
  private int to_rod;
  private int aux_rod;
  static int num;
  static int count=0;
  //defining constructor by passing number of disc
  public Hanoi(int num)
  {
      this.num=num;
  }
  //static method to ask user input number of disc and valid the number of input disc 
  public static void askInput()
  {
     System.out.println("Enter your number");
     try
     {
        num=new Scanner(System.in).nextInt();        
        if((num<3) || (num>10)){
          MyException ex=new MyException();
          throw ex;
        }
     }catch(InputMismatchException e1)
     {
         System.out.println(e1.getMessage());
     }catch(Exception e3)
     {
        System.out.println(e3.getMessage());
     }      
  }
  //method for recursive call 
  public static void towerOfHanoi(int num,int from_rod, int to_rod, int aux_rod) 
  {  
    if(num==1) 
    { 
       System.out.println("Step no "+(++count)+" Move disk "+ num +" from rod " +  from_rod + " to rod " + to_rod); 
       return; 
    } 
    towerOfHanoi(num-1, from_rod, aux_rod, to_rod); 
    System.out.println("Step no "+(++count)+" Move disk " + num +" from rod " +  from_rod + " to rod " + to_rod); 
    towerOfHanoi(num-1, aux_rod, to_rod, from_rod);      
  }
  //main method for output
  public static void main (String[]args)
  {
    Hanoi obj=new Hanoi(num);
    obj.askInput(); 
    obj.towerOfHanoi( num, 1, 3, 2);
   }
}