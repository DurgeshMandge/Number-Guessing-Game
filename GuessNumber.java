import java.util.*;

class GuessNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("_______________--  Guess The Number.  --_______________");
        System.out.println("You have Max 5 chances to Guess the no ... ");
        System.out.println(" The Number is Between the range of 1 to 100 ");

        System.out.println("");

        // int no = sc.nextInt();
        // System.out.println("Guess The Number. :-  " + no);
        int min = 0 ;
        int max = 100 ;
        Random r = new Random();
        int x = r.nextInt();
        // System.out.println(x);

        System.out.println("Enter Your Number. ");

        for (int i =1 ; i<= 5 ; i++)
        {
            
            int no = sc.nextInt();

            if (no == x )
            {
                System.out.println("  Ohhh Great... Your Guess is Correct ");
                System.exit(0);
            }

            
            else
            {
                if (x > no ){
                    System.out.println("Your Guess is Small than the Number ... ");
                    System.out.println("Please Try Again  ... ");
                }

                else if (x < no){
                    System.out.println("Your Guess is Greater than the Number ... ");
                    System.out.println("Please Try Again  ... ");
                }
            }
        }


    }
}