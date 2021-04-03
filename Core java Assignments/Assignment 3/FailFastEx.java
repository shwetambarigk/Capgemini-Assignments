import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
  
public class FailFastEx {
    public static void main(String[] args)
    {
        Map<String, Integer> cityCode = new HashMap<String, String>();
        cityCode.put("ONE", 1);
        cityCode.put("TWO", 2);
        cityCode.put("THREE", 3);
  
        Iterator iterator = cityCode.keySet().iterator();
  
        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));
  
            
            cityCode.put("SEVEN", 7);
        }
    }
}