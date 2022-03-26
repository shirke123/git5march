package practise;

public class Array {
    public static void main(String[] args) {
     /*   int temp;
        int [] arr={12,45,89,345,342,12};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

                System.out.println(arr.length);
            }
        }*/
        /**
         duplicate element in the array
         */
        System.out.println();
        int [] arr1={ 23,56,35,2,24,23,24,90};
        System.out.println("duplicate elements array");
        for (int i=0;i<arr1.length;i++){
            for (int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    System.out.println(arr1[j]);
                }

            }
        }
    }
}
