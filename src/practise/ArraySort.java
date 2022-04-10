package practise;

/**
  sort the array
 */
public class ArraySort {
    public static void main(String[] args) {
        int arr[]={23,2,1,45,34,12,17,20 ,90};
        int temp=0;
        System.out.println("sorting array");

        for(int i=0;i<arr.length;i++) {

            for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
            System.out.println(arr[i]);
        }

    }
}
