/**
 * Created by qinsky31 on 2015/1/27.
 */
public class Solution {
    public static void merge(int A[], int m, int B[], int n) {
        for (int i=0;i<n;i++) {
            int flag = 0;
            for (int j=m-1;j>=0;j--){
                if (B[i]>=A[j]) {
                    A[j+1] = B[i];
                    flag = 1;
                    break;
                }else {
                    A[j+1] = A[j];
                }
            }
            if (flag==0) {
                A[0] = B[i];
            }
            m++;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[6];
        int[] B = {1};
        A[0] = 2;
        A[1] = 0;
        A[2] = 0;
        merge(A,1,B,1);
        for (int i=0;i<2;i++) {
            System.out.println(A[i]);
        }
    }
}
