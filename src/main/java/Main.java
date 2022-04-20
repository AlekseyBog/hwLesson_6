import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(arrayAfterLast4(new int[]{1, 2, 5, 6, 7})));
//        System.out.println(oneAndFourArr(new int[]{1, 3, 4}));
//        System.out.println(oneAndFourArr(new int[]{1, 4}));
//        System.out.println(oneAndFourArr(new int[]{44, 11}));
    }

    public static int [] arrayAfterLast4 (int [] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4){
                return Arrays.copyOfRange(arr, i +1, arr.length);
            }
        }
        throw new RuntimeException("4 was not present in the array");
    }

    public static boolean oneAndFourArr (int[] arr){
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] !=4){
                return false;
            }
            if (arr[i] == 1){
                one = true;
            }
            if (arr[i] == 4){
                four = true;
            }
        }
        return one && four;
    }
}
