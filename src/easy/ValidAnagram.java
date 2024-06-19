package easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isValid(s,t));
        System.out.println(isValid2(s,t));
    }

    static boolean isValid(String s, String t){

        if (s.length() != t.length()) return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       return Arrays.equals(arr1, arr2);

    }

    static boolean isValid2(String s, String t){

        if (s.length() != t.length()) return false;

        return getFrequencyMap(s).equals(getFrequencyMap(t));
    }

    static Map<Character,Integer> getFrequencyMap(String s){

        Map<Character,Integer> map = new HashMap<>();
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i],map.getOrDefault(array[i], 0) + 1);
        }
        return map;

    }

}
