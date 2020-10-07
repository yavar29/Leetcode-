import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,5,2,17,27,33,64,3,9};
        mergeSort(arr);
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] a){
        int len=a.length;
        if(len==1)
            return;
        int mid= len / 2;
        int[] a1=new int[mid];
        int[] b1=new int[len - mid];

        int k=0;
        for(int i=0; i< a.length; i++){
            if(i<mid){
                a1[i]=a[i];
            }
            else{
                b1[k]=a[i];
                k++;
            }
        }

        mergeSort(a1);
        mergeSort(b1);
        merge(a,a1,b1,mid, len - mid);
    }

    public static void merge(int[] ans, int[] a, int[] b, int left, int right){
        int i=0; int l=0; int r=0;

        while(l<left && r<right){
            if(a[l] < b[r])
                ans[i++]= a[l++];
            else
                ans[i++]=b[r++];
        }

        while(l<left){
            ans[i++]=a[l++];
        }

        while(r<right){
            ans[i++]=b[r++];
        }
    }
}
