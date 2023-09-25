import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    int balance = 80000, withdraw, deposit;
    Scanner sc = new Scanner(System.in);
    int pin=2410;
      System.out.println ("Please enter your pin number: ");
    int pass = sc.nextInt();
    int i = 1;
    if(pass!= pin)
      {
	while (true)
	  {
	    i++;
	    System.out.println ("Wrong pin number!!");
	    System.out.println ("Please Re-enter your pin(Max.Attempts:-3)");
	    pass = sc.nextInt ();
	    if(pass == pin)
	      break;
	  }
	if(i == 3)
	  {
	    System.out.println ("You have exceeded your trails!! Please retry!");
	    System.exit (0);
	  }
      }
  
  if(pass==pin)
    {
      System.out.println ("......WELCOME......");
      while (true)
	 {
	  System.out.println ("1--->Balance amount");
	  System.out.println ("2--->Withdraw money");
	  System.out.println ("3--->Deposit money");
	  System.out.println ("4--->Quit");
	  System.out.println ("Enter your choice: ");
	  int choice = sc.nextInt ();
	  switch (choice)
	    {
	    case 1:
            System.out.println("Your Balance is: "+balance);
            System.out.println("");
            break;
        case 2:
            System.out.println("Enter amount you want to withdraw: ");
            withdraw=sc.nextInt();
            if(withdraw>balance||balance==0)
            {
                System.out.println("You have insufficient balance!!\n");
                break;
            }
            System.out.println("Collect your money");
            balance=balance-withdraw;
            System.out.println("");
            break;
            case 3:
                System.out.println("Enter money to be deposited: ");
                deposit=sc.nextInt();
                balance=balance+deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println(" ");
                break;
        case 4:
            System.out.println("Thank you!");
            System.exit(0);
	    }
	    
	}
    }
    }
}
