public class SearchInRotatedarray {
    
    public static int BinarySearch(int arr[],int target,int st,int end){

        // base case 
        if( st>end){

            return -1;
        }

        int mid=(st+end)/2;

        if(arr[mid] == target){
            return mid;
        }

        //check left part is sorted or not
        if(arr[st] <= mid){
            if(arr[st] <= target && target <= arr[mid]){ //check target exit in b/w startin and mid
                return BinarySearch(arr,target,st,mid-1);
            }
            else{
                return BinarySearch(arr,target,mid+1,end); //check target not exit in b/w startin and mid call right arr
            }

        }

        // if left is not sorted serach in right
        else{

            if( arr[mid] <= target && target <= arr[end] ){
                return BinarySearch(arr,target,mid+1,end);
            } 
            else{
                return BinarySearch(arr,target,st,mid-1);
            }
        }
    }

    public static void main(String args[]){
         
        int arr[]={3,4,5,6,7,0,1,2};

        int st=0;
        int end=arr.length-1;
        int target=2;

        System.out.println(BinarySearch(arr,target,st,end));
    }
}
