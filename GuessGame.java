import java.util.*;
   
class GuessGame {
    
    private static int guess = 0;
	static int point=0;	
    public static void main(String[] args) { 
        Scanner player = new Scanner(System.in);
		int iteration=5;
		for(;;) {
			for(int i=1;i<=5;i++){
				int attempts=5;
				System.out.println("\nRound: "+i);
				Random r = new Random();
				int NUMBER = r.nextInt(100) + 1;
				System.out.println("Number is " + String.valueOf(NUMBER));
				while(attempts!=0){
					System.out.println("\nGuess a number between 1 and 100");
					guess = player.nextInt();
					if ( guess > NUMBER ) {
						System.out.println("Too high");
						attempts--;
						System.out.println(attempts+" attempts left");
					} else if ( guess < NUMBER ) {
						System.out.println("Too low");
						attempts--;
						System.out.println(attempts+" attempts left");
					} else {
						System.out.println("That's right!");
						attempts--;
						switch(attempts){
							case 5:
								point+=5;
								System.out.println("Your Score: "+(++point));
								break;
							case 4:
								point+=4;
								System.out.println("Your Score: "+(++point));
								break;
							case 3:
								point+=3;
								System.out.println("Your Score: "+(++point));
								break;
							case 2:
								point+=2;
								System.out.println("Your Score: "+(++point));
								break;
							case 1:
								point+=1;
								System.out.println("Your Score: "+(++point));
								break;
							case 0:
								System.out.println("Your Score: "+(point));
								break;
						}
						//System.exit(0);
						break;
					}
					if(attempts==0){
						System.out.println("Oops You're out of attempts\nYour Score: "+point);
					}
					
				}
            }
			System.exit(0);
        }
	}
}