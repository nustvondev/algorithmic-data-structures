
public class _05_88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            insertElementToArray(ai, nums1, m);
            m++;
        }
    }

    private static void insertElementToArray(int x, int[] a, int m) {
        boolean findK = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                findK = true;
                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];

                }
                a[k] = x;
                break;
            }
            if (findK == false) {
                a[m] = x;
            }

        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0)// Ca i va j deu hop le
            {
                // Tim phan tu lon hon nhet vao mang nums1
                if (nums1[i] >= nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            } else if (i >= 0)// Chi co i hop le
            {
                nums1[k--] = nums1[i--];
            } else // Chi co j hop le
            {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = { 3, 4, 5, 0, 0, 0 };
        int m = 3;
        int[] num2 = { 2, 3, 6 };
        int n = 3;
        merge(num1, m, num2, n);
        System.out.println("Break test");
        for (int i : num1) {
            System.out.println(i);
        }
    }
}