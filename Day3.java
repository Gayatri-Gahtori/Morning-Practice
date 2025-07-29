public class Day3{
    public static void printSubArray(int arr[]){
        int total=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,32,45,23,21,46};
        printSubArray(arr);
        
    }

}