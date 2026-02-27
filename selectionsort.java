

public class selectionsort{

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mimPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[mimPos] > arr[j]) {
                    mimPos = j;
                }
            }
            //swap
            int temp = arr[mimPos];
            arr[mimPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }  
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        sort(arr);
        printArr(arr);
    
    }
}

