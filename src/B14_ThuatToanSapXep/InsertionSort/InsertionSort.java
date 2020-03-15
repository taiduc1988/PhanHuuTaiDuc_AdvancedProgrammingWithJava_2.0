package B14_ThuatToanSapXep.InsertionSort;

public class InsertionSort {
    private static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    private static void insertionSort(double[] list){
        int n = list.length;
        for (int i=0; i< n;i++){
            double key = list[i];
            int j = i -1;
            while (j >= 0 && list[j] > key){
                list[j + 1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (double v : list) {
            System.out.println(v + " ");
        }
    }
}
