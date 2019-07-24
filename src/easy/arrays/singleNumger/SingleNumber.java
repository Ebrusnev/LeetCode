package easy.arrays.singleNumger;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    private static int uniqueNumber(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : nums) {
            int n = 0;
            if (m.containsKey(i)) {
                n = m.get(i);
            }
            m.put(i, ++n);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() == 1) {
                result = e.getKey();
                break;
            }
        }
        return result;
    }

    private static int uniqueNumber2(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(uniqueNumber2(new int[]{2, 2, 1}));
        System.out.println(uniqueNumber2(new int[]{1, 2, 4, 1, 2, 16, 35, 16, 35}));
    }

}
