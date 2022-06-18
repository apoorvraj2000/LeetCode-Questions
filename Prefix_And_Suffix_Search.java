package AllCodes;

import java.util.*;

class WordFilter {
    private Map<String, Integer> map;

    public WordFilter(String[] words) {
        this.map = new HashMap<>();
        
        for (int index = 0; index < words.length; index++) {
            String word = words[index];
            Integer w = word.length();
            for (int i = 0; i <= w; i++) {
                String prefix = word.substring(0, i);
                for (int j = 0; j <= w; j++) {
                    String suffix = word.substring(j, w);
                    String key = getKey(prefix, suffix);
                    map.put(key, index);
                }
            }
        }
    }
    
    public int f(String prefix, String suffix) {
        String key = getKey(prefix, suffix);
        int index = this.map.getOrDefault(key, -1);
        int s = map.size();
        return index;
    }
    
    private String getKey(String prefix, String suffix) {
        return String.format("%s-%s", prefix, suffix);
    }
}
public class Prefix_And_Suffix_Search {

}
