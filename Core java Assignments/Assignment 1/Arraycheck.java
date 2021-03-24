public class Main {
        public static void main(String[] args) {

            int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
            int n = arr.length;
            if (arraySortedOrNot(arr, n))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
        static boolean arraySortedOrNot(int a[], int n) {

            if (n == 1 || n == 0)
                return true;
            return a[n - 1] >= a[n - 2]
                    && arraySortedOrNot(a,n - 1);
    }
}