import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] digitCounts = new int[10];
        for (int digit : digits) {
            digitCounts[digit]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 100; i <= 998; i += 2) {
            int[] numCounts = new int[10];
            int temp = i;
            numCounts[temp % 10]++;
            temp /= 10;
            numCounts[temp % 10]++;
            temp /= 10;
            numCounts[temp]++;

            boolean canForm = true;
            for (int j = 0; j < 10; j++) {
                if (numCounts[j] > digitCounts[j]) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                result.add(i);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}