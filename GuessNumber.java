import java.util.*;

class GuessNumber{
    public static void main(String[] args) {

        // Initializing variables, Messages and input array

        Scanner sc = new Scanner(System.in);
        int score = 0 ;
        int points = 0;
        int add = 0;
        int press = 1;

        System.out.println("    _______________--  Guess The Number.  --_______________");
        System.out.println("        You have maximum 5 chances to Guess the number");
        System.out.println("        If you entere the generated number you will win .");
        System.out.println("        The generated number will be between the range of 1 to 100 ");
        System.out.println();


        int[] inputs = new int[5] ;

        // Game is on while press is equal to 1

        while(press==1){
            
        // Generate the random number using Math.random() method and initialise the array of inputs

            int generatedNumber = (int)(Math.random()*100)+1 ;

            System.out.println("    Enter Your Number. ");
    
            // Limiting number of attempts to 5

            for (int i =1 ; i<= 5 ; i++)
            {
                
                inputs[i-1] = sc.nextInt();
    
                //for first 4 chances

                if( i!= 5) 
                {
                    // For correct Guess

                    if ( inputs[i-1] == generatedNumber )
                    {
                        System.out.println("    WOW Super ! Your Guess is Correct ");
                        score+=1;
                        add = (i==1 || i==2 || i==3)? 5 : 3 ;
                        points+=add;
                        break;
                    }
    
                    // For incorrect guess
                    
                    else
                    {
                        if ( inputs[i-1] > generatedNumber ){
                            System.out.println("    Your Guess is Grater than the Number ... ");
                            System.out.println("    Try to guess smaller number than " + inputs[i-1] );
                        }
    
                        else {
                            System.out.println("    Your Guess is Smaller than the Number ... ");
                            System.out.println("    Try to guess greater number than " + inputs[i-1]);
                        }
                    }
                }

                //for last chance

                else
                {
                    // For correct Guess

                    if ( inputs[i-1] == generatedNumber )
                    {
                        System.out.println("    Ohhh Great... Your Guess is Correct ");
                        score+=1;
                        add = (i==1 || i==2 || i==3)? 5 : 3 ;
                        points+=add;
                        break;
                    }
    
                    //incorrect last guess
                    else
                    {
                        if ( inputs[i-1] > generatedNumber ){
                            System.out.println("    Your Guess is Grater than the Number ... ");
                        }
    
                        else {
                            System.out.println("    Your Guess is Smaller than the Number ... ");
                        }
    
                        System.out.println("    ans you Have attempted all 5 available attempts:");System.out.println();
                        System.out.println("    --------The Generated number was << " + generatedNumber + " >> and Your Guesses are :--------");
                        System.out.println("                " + Arrays.toString(inputs));System.out.println();

                    }
                }
            }

            //Round completed

            System.out.println();
            System.out.println("    Your Score is : " + score);
            System.out.println("    Your Points are : " + points);
            System.out.println("    Press 1 to Retry, Press any number to Exit");
            press = sc.nextInt();
        }

        // Game Quited

        System.out.println("    Number Guessing Game Exited.");
        System.out.println("    Thank You");
        sc.close();
    }
}
