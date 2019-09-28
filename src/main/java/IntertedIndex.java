import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntertedIndex {
    private Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
    private ArrayList<String> list;
    private Map<String, Integer> nums = new HashMap<String, Integer>();
    public void createIndex(String filepath){
        String[] words = null;
        try{
            File file = new File(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s = null;
            while((s = reader.readLine()) != null){
                words = s.split(" ");
            }
            for (String string : words){
                if(!map.containsKey(string)){
                    list = new ArrayList<String>();
                    list.add(filepath);
                    map.put(string, list);
                    nums.put(string,1);
                }
                else{
                    list = map.get(string);
                    //如果没有包含过此文件名，则把文件名放入
                    if(!list.contains(filepath)){
                        list.add(filepath);
                    }
                    //文件总词频数目
                    int count = nums.get(string)+1;
                    nums.put(string, count);
                }
            }
            reader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        IntertedIndex index = new IntertedIndex();
        for(int i = 1; i <= 3; i++){
            String path = "/home/mjq/桌面/file"+ i;
            index.createIndex(path);
        }
        for(Map.Entry<String, ArrayList<String>> map : index.map.entrySet()){
            System.out.println(map.getKey() + ":" + map.getValue());
        }
        for (Map.Entry<String, Integer> num :index.nums.entrySet()){
            System.out.println(num.getKey() + ":" + num.getValue());
        }
    }
}
