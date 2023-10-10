
public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int numOfDigits = calNumOfDigits(i);
            if (numOfDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int calNumOfDigits(int i) {
        // implement 1: divide 10
        // example:
        // 2345/10= 234 (remainder 3)
        // 234/10= 23 (remainder 4)
        // 23/10=2 (remainder 3)
        // 2/10=0 (remainder 2) ==> STOP

        // implement 2: Logarit 10
        // return (int)Math.floor(Math.log10(i)) + 1;

        int result = i;
        int count = 0;
        while (result != 0) {
            result = i / 10;
            i = result;
            count++;
        }
        // while (n != 0) {
        //     n = n / 10;
        //     count++;
        // }
        return count;
    }

    public static void main(String[] args) {
        int[] test_1 = { 12, 345, 2, 6, 7896 };// 2
        int[] test_2 = { 555, 901, 482, 177 };// 0
        int[] test_3 = { 12, 345, 2, 6, 7896 };// 2
        int[] test_4 = { 555, 901, 482, 1771 };// 1

        System.out.println(findNumbers(test_1));
        System.out.println(findNumbers(test_2));
        System.out.println(findNumbers(test_3));
        System.out.println(findNumbers(test_4));

    }
}