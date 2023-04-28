import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTables {
    public static void main(String args[]){
        Map detailStudent = new HashMap();
        detailStudent.put("alfred", 5);
        System.out.println(detailStudent);

        Map more_Details = new TreeMap();
        more_Details.put("alfred", "150");
        more_Details.put("jolly", "500");
        more_Details.put("elly", "650");
         System.out.println(more_Details);

    }
    
}
