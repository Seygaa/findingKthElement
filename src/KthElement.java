
public class KthElement {
    private static int partition(int[] array, int lowerBond, int upperBond) {
        int x = array[upperBond], i = lowerBond;
        for (int j = lowerBond; j <= upperBond - 1; j++) {
            if (array[j] <= x) {
                ArrayHelper.swap(array, i, j);
                i++;
            }
        }
        ArrayHelper.swap(array, i, upperBond);
        return i;
    }

    public static int findKthElement(int[] array, int lowerBond, int upperBond, int k) {
        if (k > 0 && k <= upperBond - lowerBond + 1) {
            int pivotPosition = partition(array, lowerBond, upperBond);
            if (pivotPosition - lowerBond == k - 1) {
                return array[pivotPosition];
            }
            if (pivotPosition - lowerBond > k - 1) {
                return findKthElement(array, lowerBond, pivotPosition - 1, k);
            }

            return findKthElement(array, pivotPosition + 1, upperBond, k - pivotPosition + lowerBond - 1);
        }

        return Integer.MAX_VALUE;
    }
}
