import java.util.ArrayList;
public class Doors {
    ArrayList<String> doors;
    public Doors(){
        doors = new ArrayList<>();
        doors.add("Goat");
        doors.add("Car");
        doors.add("Nothing");
    }

    public void shuffleDoors(){
        for(int i = 3; i > 0; i--){
            int shuffle = (int)(Math.random()*doors.size());
            int j = shuffle;
            String temp = doors.get(i);
            doors.set(i, doors.get(j));
            doors.set(j, temp);
        }
    }
    
    


}
