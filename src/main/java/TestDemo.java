import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        for(String key : map.keySet()){
            System.out.println("key=" + key + "and value=" + map.get(key));
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println("key=" + entry.getKey() + "and value=" + entry.getValue());
        }


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Iterator<Integer> it1 = arrayList.iterator();
        Integer[] integer = arrayList.toArray(new Integer[0]);
        //
        Integer[] integer3 = new Integer[arrayList.size()];
        arrayList.toArray(integer3);
    }
}
