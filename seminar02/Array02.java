public class Array02 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][length - i - 1] = 1;
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
