import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] array, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(target - array[i])) {
                res[0] = map.get(target - array[i]);
                res[1] = i;
                return res;
            }
            map.put(array[i], i);
        }
        return res;
    }
}
