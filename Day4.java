public class Day4{
    public static int  maxsumsubarray(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){                                            //BRUEFORCE APPROACH
            for(int j=i;j<arr.length;j++){
                int currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.print("Maximum sum of the array = ");
        return maxsum;

    }
    public static int prefixsumsubarray(int arr[]){                                        //PREFIXSUM APPROACH
        int maxsum=Integer.MIN_VALUE;

        int PrefixArray[]=new int[arr.length];
        PrefixArray[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            PrefixArray[i]=PrefixArray[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int currsum=0;
            for(int j=i;j<arr.length;j++){
                currsum = i==0? PrefixArray[j]: PrefixArray[j] - PrefixArray[i-1];
            }
            if(currsum>maxsum){
                 maxsum=currsum;
                
            }
        }
         System.out.print("Maximum sum of the array = ");
        return maxsum;
    }
    public static int kadansalgo(int arr[]){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            } 
            maxsum=Math.max(maxsum,currsum);
        }
        System.out.print("Maximum sum of the array = ");
        return maxsum;
        
    }
    public static void main(String[] args){
        int arr[]={1,-2,6,-1,3};
        System.out.println(maxsumsubarray(arr));
        System.out.println(prefixsumsubarray(arr));
        System.out.println(kadansalgo(arr));
    }
}