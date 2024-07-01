package medium;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {


        String[] strs = {"act","pots","tops","cat","stop","hat"};

        System.out.println(groupAnagrams(strs));

    }

    static List<List<String>> groupAnagrams(String[] strs){

       Map<String,List<String>> ans = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);

            if (!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }

            ans.get(key).add(s);

        }

        return new ArrayList<>(ans.values());

    }




}
