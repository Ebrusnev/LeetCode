package easy.arrays.mergeArrays;

import java.util.Map;
import java.util.TreeMap;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            addToMap(map, nums1[i]);
        }
        for (int i : nums2) {
            addToMap(map, i);
        }
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            while (count > 0) {
                nums1[index] = entry.getKey();
                count--;
                index++;
            }
        }
    }

    private static void addToMap(Map<Integer, Integer> m, int i) {
        int count = 0;
        if (m.containsKey(i)) {
            count = m.get(i);
        }
        m.put(i, ++count);
    }

}
