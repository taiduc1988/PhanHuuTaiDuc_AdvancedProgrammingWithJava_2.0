package B13_ThuatToanTimKiem.BinarySearch_De_Qui;

public class BinarySearch {
    public static int binarySearch(int[] array, int num, int high, int low){
        if(high >= low){
            int mid = (high + low) / 2;
            if(num < array[mid]){
                return binarySearch(array, num, mid - 1, low);
            } else if(num > array[mid]){
                return binarySearch(array, num, high, mid + 1);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrays = {1,2,3,6,5,4,7,8,9,10};
        System.out.println(binarySearch(arrays,3,9,0));
    }
}
