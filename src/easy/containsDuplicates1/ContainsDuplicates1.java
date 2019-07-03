package easy.containsDuplicates1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates1 {
    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(containsDuplicates(arr1));
        System.out.println(containsDuplicates(arr2));
    }
}
