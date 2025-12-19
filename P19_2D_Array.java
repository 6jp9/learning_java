public class P19_2D_Array {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{2,3,4},{3,4,5}};
        // simply, 
        // int[] --> for 1D integer Array
        // int[][] --> for 2D integer Array....soon

        System.out.println(arr[0][1]);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // mostly same as 1D arrays but here we also need to mention row indices along with column indices

        String[][] test = new String[3][3];
        for(String[] row:test){
            for(String s:row){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}
