import java.util.Arrays;

// Java arrays are fixed-size data structures stored in contiguous memory, 
// which allows constant-time index access, making them faster than dynamically resizable collections

public class P18_arrays {
    public static void main(String[] args) {
        // just like List in python where its a hetrogenious elements collection. Arrays in java mostly functions save except..
        // few differences....
        // -array is collection of homogenious elements,
        // -its a referene datatype i.e., can only access the elements using the index and cannot return direct array.
        // - i.e., System.out.println(arr); prints --> arrX8ga@&n112 (address)
        // to define string array -> String[] a={"apple","banana","orange"};
        //                           int[] a={1,2,3,4....};
        //                           char[] a={'a','b'....};
        //                           double[] a={1.2,2.0,3,4,8.66666};......

        String[] arr = {"apple","orange","banana"}; 
        System.out.println("address");
        System.out.println(arr); // --> [Ljava.lang.String;@7ad041f3  (address of arr)
        System.out.println(arr[0]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); // --> apple orange banana 
        }

         // or---------------------

        System.out.println();
        Arrays.sort(arr);
         for(String f : arr){
            System.out.print(f+ " "); // --> apple banana orange
        }
        
        System.out.println();

        int[] arr1 = new int[3]; // -> arr1={0,0,0}
                                 // -> we are creating an empty array with the space or length of 3. 
                                 // we cannot use append operations like we do in python list.
                                 // we must decide the array size at creation time. It's a fixed length.
                                 // since they are fixed length. they are faster to access.
        arr1[0]=42;
        arr1[1]=43;

        for(int i:arr1){
            System.out.println(i);
        }

        String[] arr2 = new String[3]; // arr2={null,null,null}
        for(String s:arr2){
            System.out.println(s);
        }

        

    }

}
