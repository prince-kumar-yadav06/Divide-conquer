public class mergesort{

    public static void divide(int arr[],int si,int ei){


        if(si >= ei){
            return;
        }
        //find mid
        int mid=(si+ei)/2;

        divide(arr,si,mid); // call for left 
        divide(arr, mid+1, ei); //call for right;

        // merge function
        merge( arr,si ,ei, mid);

    }

    public static void  merge(int arr[],int si ,int ei,int mid){

        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0; //index for temp array


        while(i<=mid && j<= ei){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        // agar kuchh element bache hai to use temp me store kr denge

        while(i<= mid){
            temp[k]=arr[i];
            k++;
            i++;
            
        }

        while(j<= ei){
            temp[k]=arr[j];
            k++;
            j++;

        }

        // store temp arr in original array
        for(k=0 , i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String args[]){

        int arr[]={6,3,5,9,2,8};

        int ei=arr.length-1;

        divide(arr, 0,ei);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
