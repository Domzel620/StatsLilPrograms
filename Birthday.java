import java.util.ArrayList;
import java.util.Random;
public class Birthday {
    
    Random random = new Random();
    public void birthdaySim(int people, int runs){
        for(int i = 0; i < runs; i++){
            int match = 0;
            ArrayList<Person> classList = new ArrayList<>();
            for(int j = 0; j < people; j++){
                Person person = new Person();
                int month = random.nextInt(12)+1;
                person.setMonth(month);
                int day;
                if(month%2 != 0 || month == 8){
                    day = random.nextInt(31)+1;
                    person.setDay(day);
                } else if(month == 2){
                    day = random.nextInt(28)+1;
                    person.setDay(day);
                } else{
                    day = random.nextInt(30)+1;
                    person.setDay(day);
                }
                classList.add(person);
            }
            
            for(int k = 0; k < classList.size(); k++){
                Person dude = classList.get(k);
                for(int j = k+1; j < classList.size(); j++){
                    if(dude.getMonth() == classList.get(j).getMonth()){
                        if(dude.getDay() == classList.get(j).getDay()){
                            classList.remove(classList.get(j));
                            match++;
                        }
                    }
                }
            }
            double matchPer = (double) match/people * 100;
            int runCount = i+1;
            System.out.println("In "+ runCount +" runs of "+ people +" people, there were "+ match + " matches, which is about " + matchPer + "% of the class");
        }
    }
}
