
import java.util.*;
public class BINARYSEARCH {
    public static int  BnrySrch(int arr[],int target){

        int st=0;
        int end=arr.length-1;

        while(st<=end){
            int mid=(st+end)/2;


            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
      
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,9};
        int target=6;

        System.out.println(BnrySrch(arr, target));
    }
}
