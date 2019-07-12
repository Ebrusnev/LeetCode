package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_I_and_II {
    public static List<List<Integer>> getPascalsTriangle(int rowsNum) {
        List<List<Integer>> result = new ArrayList<>();
        if (rowsNum == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int i = 1; i < rowsNum; i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    result.get(i).add(1);
                    continue;
                }
                result.get(i).add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
        }
        return result;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0 || j == i) {
                    l.add(1);
                    continue;
                }
                l.add(row.get(j-1) + row.get(j));
            }
            row = l;
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(getPascalsTriangle(4));
        System.out.println(getRow(3));
    }

}
