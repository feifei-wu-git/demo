/**
 * 斐波那契数列从第3项开始，每一项都等于前两项之和。
 */
package interview;

import java.util.Random;

public class FibonacciNum {
    public static void main (String[] args){
        int arr[] = new int[randomNum()];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);

        }

    }
    public static int randomNum(){
        Random random = new Random();
        int m = random.nextInt(20);

        return m;
    }



}
