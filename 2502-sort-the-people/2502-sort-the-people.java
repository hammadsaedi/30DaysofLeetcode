import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        sort(names, heights);
        return names;
    }

    public static void sort(String[] names, int[] heights) {
        boolean swapped;
        for (int i = 0; i < heights.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < heights.length - 1 - i; j++) {
                if (heights[j] < heights[j + 1]) { 
                    int temp = heights[j];
                    String buffer = names[j];
                    heights[j] = heights[j + 1];
                    names[j] = names[j + 1];
                    heights[j + 1] = temp;
                    names[j + 1] = buffer;
                    swapped = true;
                }
            }
            
            if (!swapped)
                break;   
        }
    }
}
