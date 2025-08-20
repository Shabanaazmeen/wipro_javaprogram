package java2;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        System.out.println("Leaders in the array:");

        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight + " ");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}
