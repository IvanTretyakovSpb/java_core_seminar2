public class Array03 {
    public static void main(String[] args) {
//        int[] arr = {1, 5, 9, 4, 3, 1};
        int[] arr = {1, 0, 2, 3, 100};
        int sumStart = 0;
        int sumEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            sumStart += arr[i];

            for (int j = arr.length - 1; j > i; j--) {
                sumEnd += arr[j];
            }

            if (sumStart == sumEnd) {
                System.out.println(true);
                System.out.println(sumStart + " = " + sumEnd);
                return;
            }
            sumEnd = 0;
        }
        System.out.println(false);
    }
}
