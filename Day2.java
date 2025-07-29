public class Day2 {
    //reverse an array 
    public static void reversearray(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
    public static void pairsOfarray(int arr[]){
        int total=0;
        for(int i=0;i<arr.length-1;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" +curr+","+arr[j]+")");
                total++;
            }
            
            System.out.println();
        }
        
      System.out.println(total);  

    }
    public static void main(String[] args) {
        int arr[]={2,34,67,43,23,4};

        reversearray(arr);
        pairsOfarray(arr);
        
    }
}
