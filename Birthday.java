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
            
            for(Person dude : classList){
                ArrayList<Person> matched = new ArrayList<>();
                for(int j = 0; j < classList.size(); j++){
                    if(matched.contains(classList.get(j))){
                        continue;
                    }
                    if(dude.getMonth() == ((Person)classList.get(j)).getMonth()){
                        if(dude.getDay() == ((Person)classList.get(j)).getDay()){
                            matched.add(classList.get(j));
                            match++;
                        }
                    }
                }
            }
            if(match > 0){
                match--;
            }
            double matchPer = (double) match/classList.size() * 100;
            int runCount = i+1;
            System.out.println("The Amount of people that matched in run "+ runCount +  " was " + match + "% of the class");
        }
    }
}
