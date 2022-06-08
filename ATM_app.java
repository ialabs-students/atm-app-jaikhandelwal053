import java.util.Scanner;

public class ATM_app
{
      public int bal =0;
      Scanner sc = new Scanner(System.in);
      int notes[] = {2000,500,200,100};
      int counts[] = new int[4];
      public void deposite() 
      {

          for(int i =0 ; i<notes.length ; i++) 
          {
              int count=0;
              System.out.print("Total Notes of "+notes[i] + "s : ");
              count = sc.nextInt();
              counts[i]=count;
              bal = bal+count*notes[i];
          }

          System.out.print("Deposite = ");
          for(int i=0;i<counts.length;i++) 
          {
             System.out.print(+notes[i]+"s : "+counts[i] +" , ");
          }
          System.out.println(" ");
          System.out.println("Total Account Balance = " +bal);

      }

      public void widthrow() 
      {
          System.out.print("Enter Withdrawl Amount : ");
          int amount = sc.nextInt();
          int x = amount;
          System.out.print("Withdraw : "+amount + "\n");
          if(amount<=bal) 
          {
               System.out.print("Dispensed :");
               for(int i=0;i<notes.length && amount>=0;i++)
                   {
                         if(amount>=notes[i])
                             System.out.print(notes[i]+"s"+" = "+amount/notes[i]+" ,");
                         counts[i]=counts[i]-(amount/notes[i]);
                         amount=amount%notes[i];
                   }

            System.out.print("\nBalance : ");
            for(int i=0;i<counts.length;i++) 
            {
               System.out.print(notes[i]+"s = "+counts[i] +"  ,  ");
            }
            bal=bal-x;
            System.out.println("Total = " +bal);
         }
         else 
         {
            System.out.println("Insufficient Balance !!! ");
         }
    }


      public static void main(String[] args)
      {
          ATM_aap a = new ATM_app();
          System.out.println("ATM Operations : ");
          System.out.println("For Deposit Press -> 1 ");
          System.out.println("For Withdrawl Press -> 2 ");
          System.out.print("Operation : ");
          int ch = a.sc.nextInt();
          switch(ch) 
          {
            case 1: a.deposite();
                break;
            case 2: a.widthrow();
                break;
            default : System.out.println("Enter Valied Operation");
          }
      }
}
