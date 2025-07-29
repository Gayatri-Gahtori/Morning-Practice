 import java.util.*;
 public class Day1{
    //binary search
    public static boolean binarysearch(int arr[],int key,int start,int end){
        //base case
        if (start<=end){
            int mid=(start+end)/2;
            if (arr[mid]<key){
               start=mid+1;
               return binarysearch(arr,key,start ,end);
            }
            else if  (arr[mid]>key){
               end=mid-1;
               return binarysearch(arr,key,start ,end);
            }
            if (arr[mid]==key){
            return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        int start=0;
        int end=arr.length-1;
        System.out.println("Enter the number you want to search");
        int key=sc.nextInt();
        System.out.println(binarysearch(arr,key,start ,end));

    }

}