import java.util.*;

class GuessNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("    _______________--  Guess The Number.  --_______________");
        System.out.println("        You have maximum 5 chances to Guess the number");
        System.out.println("        If you entere the generated number you will win .");
        System.out.println("        The generated number will be between the range of 1 to 100 ");
        System.out.println();

        // Generate the random number using Math.random() method and initialise the array of inputs

        int generatedNumber = (int)(Math.random()*100)+1 ;
        System.out.println(generatedNumber);
        int[] inputs = new int[5] ;

        System.out.println("Enter Your Number. ");

        for (int i =1 ; i<= 5 ; i++)
        {
            
            inputs[i-1] = sc.nextInt();

            if( i!= 5) 
            {
                if ( inputs[i-1] == generatedNumber )
                {
                    System.out.println("  WOW Super ! Your Guess is Correct ");
                    System.exit(0);
                }

            
                else
                {
                    if ( inputs[i-1] > generatedNumber ){
                        System.out.println("Your Guess is Grater than the Number ... ");
                        System.out.println("Try to guess smaller number than " + inputs[i-1] );
                    }

                    else {
                        System.out.println("Your Guess is Smaller than the Number ... ");
                        System.out.println("Try to guess greater number than " + inputs[i-1]);
                    }
                }
            }else 
            {
                if ( inputs[i-1] == generatedNumber )
                {
                    System.out.println("  Ohhh Great... Your Guess is Correct ");
                    System.exit(0);
                }

            
                else
                {
                    if ( inputs[i-1] > generatedNumber ){
                        System.out.println("Your Guess is Grater than the Number ... ");
                    }

                    else {
                        System.out.println("Your Guess is Smaller than the Number ... ");
                    }

                    System.out.println("You Have attempted all 5 available attempts:");
                    System.out.println("Press 1 to retry, Press 2 to exit");
                    int press = sc.nextInt();
                    
                    if( press == 1 ){
                        //retry
                    }else if( press == 2 ){
                        //exit
                    }else{
                        System.out.println("Enter either 1 or 2");
                    }
                }
            }
            System.out.println();
        }


    }
}
