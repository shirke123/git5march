package practise;

public class ArrayDemo {
    public static void main(String[] args) {
        int []arr={12,456,34,56,78,34,23,689};
        System.out.println("duplicate element in the array:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
        int [] a={ 23,45,2,45,2,4,67,90,67};
        System.out.println("print elements");
        for(int i=0;i<a.length;i++){

                System.out.println(a[i]);
            }

        int [] arr1={ 12,23,45,67,45,4,36};
        System.out.println("reverse  array element ");
        for(int i=arr1.length-1;i>=0;i--) {
            System.out.println(arr1[i]);
        }

        int [] arr2={ 12,23,45,67,45,4,36};
        System.out.println("print the present even position ");
        for(int i=1;i<arr2.length;i=i+2){
            System.out.println(arr2[i]);
        }

        int [] arr3={ 2,4,5,6,7,8,92};
        System.out.println("print the present odd position");
        for (int i=0;i<arr3.length;i=i+2);{
           // System.out.println(arr3[i]);
        }

        int [] arr4={ 23,45,34,3,5,7,8};
        int max=arr4[0];
        System.out.println("largest elements in the array");
        for(int i=0;i<arr4.length;i++) {
            if (arr4[i] >max) max=arr4[i]; {
                System.out.println("" + max);
            }
        }

        int[] arr5={ 1,2,3,4,5,6,67};
        int min=arr[0];
        System.out.println("smallest elements in the array");
        for(int i=0;i<arr5.length;i++){
            if(arr5[i]<min) min=arr5[i];{
                System.out.println(""+min);
            }
        }

        int[] arr6={ 23,45,2,4,5,6};
        int sum=0;
        System.out.println("sum elements of the array");
        for(int i=0;i<arr6.length;i++){
            sum=sum+arr6[i];
            System.out.println(sum);
        }


        int[] arr7={ 23 ,56,45,34,89,100};
        int temp=0;
        System.out.println("ascending order the  elements in the array");
        for(int i=0;i<arr7.length;i++){
            System.out.println(arr[i]+"");

         for(i=0;i<arr7.length;i++){
             for(int j=i+1;j<arr7.length;j++){
                 System.out.println(arr7[j]);
             }
//             if(arr7[i]>arr7[j]){
//                 temp=arr7[i];
//                          arr7[i]=arr7[j];
//                          arr[j]=temp;
//                 System.out.println("");
         }
        }


    }
    }

