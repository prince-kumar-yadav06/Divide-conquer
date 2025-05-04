public class QuickSort {
    

        //swap function
    
        public static void swap(int arr[],int i,int j){
    
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        //partition function
        public static int  partition(int arr[],int st,int end){
    
            int idx=st-1; // lesser element ke liye jagah banayega
            int pivot=arr[end];
    
            for(int j=st;j<=end;j++){
                if(arr[j] < pivot){
                    idx=idx+1;
                    swap(arr,idx,j);
                }
            }
    
            //pivot ko shi position pr rakh ke pivot ka index return kr denge
            idx++;
            swap(arr,idx,end);
            return idx;
        }
    
        public static void quicksort(int arr[],int st,int end){
    
            if(st <end){
                int pidx=partition(arr,st,end);
    
                quicksort(arr,st,pidx-1); //left 
                quicksort(arr,pidx+1,end); //right
    
            }
        }
    
        public static void main(String args[]){
    
            int arr[]={6,5,2,7,1,3};
    
            quicksort(arr,0,arr.length-1);
    
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+",");
            }
        }
    }

