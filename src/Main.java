import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        Character[] chars = new Character[str.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
            if (Character.isLetter(chars[i])) {
                map.put(chars[i], map.containsKey(chars[i]) ? map.get(chars[i]) + 1 : 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Character key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
            }
        }
        for (Character key : map.keySet()) {
            if (min > map.get(key)) {
                min = map.get(key);
            }
        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);
        System.out.println(map);
    }
}
