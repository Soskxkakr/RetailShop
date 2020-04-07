package RetailStore;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author Reinaldo Taslim
 */
public class ASD {
    public static void main(String[] args) {          
        CopyOnWriteArrayList<Map<String, String>> AL = new CopyOnWriteArrayList<>();
        Map<String, String> MPDetails = new HashMap<>();
        MPDetails.put("Name", "Reinaldo");
        MPDetails.put("Age", "12");
        AL.add(MPDetails);
            
        Map<String, String> MPDetails2 = new HashMap<>();
        MPDetails2.put("Name", "Steven");
        MPDetails2.put("Age", "21");
        
        
        Map<String, CopyOnWriteArrayList<Map<String,String>>> MP = new HashMap<>();
        MP.put("C1", AL);
        
        
        for (CopyOnWriteArrayList<Map<String, String>> X : MP.values()){
            X.add(MPDetails2);
            for (Map<String, String> Y : X){
                if ( Y.get("Name").equals("Steven") ){
                    X.remove(Y);
                }
            }
            System.out.println(X);
        }
        System.out.println(MP);
    }
}
