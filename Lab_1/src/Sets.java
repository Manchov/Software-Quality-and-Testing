import java.util.HashSet;
import java.util.Set;

public class Sets {

    public Set SetDifference(Set set1, Set set2) {
        try{
            if (set1.containsAll(set2)) {
                return null;
            }else{
                set1.removeAll(set2);
                if (set1.isEmpty())
                        return null; //"empty set"
                return set1;
            }
        }
        catch(NullPointerException e){
            System.out.println("Invalid Set");
            e.printStackTrace();
            return null;
        }
    }
}
