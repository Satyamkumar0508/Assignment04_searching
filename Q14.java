public class Q14 {
    static void trip(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("(" + arr[i] + " , " + arr[j] + " , " +arr[k]+ ")");
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int aa[]={
                -1,3,-7,6,-5,-9
        };
        trip(aa);
    }
}
