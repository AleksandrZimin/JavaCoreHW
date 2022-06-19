package Task2;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String,String> StringHashMap = new HashMap<>();
    public void add(String phone, String name){
        StringHashMap.put(phone,name);
    }
    public String getPhoneByName(String name){
        if(StringHashMap.containsValue(name)){
            String result = "Number: ";
            for(String key: StringHashMap.keySet()){
                if(StringHashMap.get(key).equals(name)) result += key + "; ";
            }
            return result;
        } else return "False";
    }
}