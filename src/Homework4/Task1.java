package Homework4;
import java.util.*;

    public class Task1 {
        public static int arrayStringSize = 20;
        public static String[] arrayString = new String[arrayStringSize];
        public static List<String> stringArrayList = Arrays.asList(arrayString);

        public static void main(String[] args) {
            createStringArray();

            System.out.println("Array size=  " + stringArrayList.size());
            HashSet<String> targetSet = new HashSet<>(stringArrayList);
            System.out.println("Repeat=  " + targetSet.size());

            HashMap<String,Integer> result = new HashMap<>();
            for(String str: targetSet){
                result.put(str,count(str));
            }

            System.out.println(result);
        }

        public static void createStringArray(){
            Random random = new Random();
            for(int i = 0; i<arrayStringSize;i++){
                arrayString[i] = String.valueOf(random.nextInt(20));
            }

        }

        public static Integer count(String str){
            Integer result = 0;
            for(String strThis : stringArrayList){
                if(strThis.equals(str)) result++;
            }
            return result;
        }

    }

