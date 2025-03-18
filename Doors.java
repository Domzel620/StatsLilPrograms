import java.util.Random;
public class Doors {
    
    public void gameTime(){
        Random random = new Random();
        int switchWins = 0;
        int stayWins = 0;
        //Doors: 1.Goat 2.Car 3.Goat
        //Switch Test
        for(int i = 0; i <10000; i++){
            int choice = random.nextInt(3);
            //Door number 1 is picked, 3 is revealed, they switch to two, they win
            if(choice == 0){  
                switchWins++;
            } else if(choice == 2){//Door 3 is picked, 1 is revealed, they win
                switchWins++;
            }//All other cases for switch test result in a loss
        }
        for(int i = 0; i < 10000; i++){
            int choice = random.nextInt(3);
            //This is the only case in which the contestant would win
            if(choice == 1){
                stayWins++;
            }
        }
        double switchSuc = (double) switchWins/10000*100;
        double staySuc = (double) stayWins/10000*100;
        System.out.println("The player who switched their answer won " + switchSuc + "% of the time!");
        System.out.println("The player who stayed with their answer won " + staySuc + "% of the time!");
    }
    


}
