package B2_VongLapTrongJava.PrimeNumber;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (checkPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * hàm kiểm tra số nguyên tố
     *
     * @param num
     * @return
     */
    public static boolean checkPrimeNumber(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
