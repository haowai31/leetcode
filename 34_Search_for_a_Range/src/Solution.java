/**
 * Created by qinsky31 on 2015/2/3.
 */
public class Solution {
    public static int getfirst(int[] A,int l,int r,int target){
        int middle = (r+l)/2;
        if (r-l==1) {
            if (A[r]==target) {
                return r;
            }else if (A[l]==target) {
                return l;
            }else {
                return -1;
            }
        }
        if (l==r) {
            if (A[l]==target) {
                return l;
            }else {
                return -1;
            }
        }
        if (target>A[middle]) {
            return getfirst(A,middle,r,target);
        }else if (target<A[middle]) {
            return getfirst(A,l,middle,target);
        }else {
            return middle;
        }
    }

    public static int getleft(int[] A,int point,int target) {
        int result = point;
        int rex = 1;
        while (true) {
            if (result<0 || target!=A[result]) {
                int left = (result>=0) ? result : 0;
                for (int i=left;i<=result+rex/2;i++) {
                    if (A[i]==target) {
                        return i;
                    }
                }
            }else {
                result -= rex;
                rex *= 2;
            }
        }
    }

    public static int getright(int[] A,int point,int target) {
        int result = point;
        int rex = 1;
        while (true) {
            if (result>=A.length || target!=A[result]) {
                int right = (result>=A.length) ? A.length-1 : result;
                for (int i=right;i>=result-rex/2;i--) {
                    if (A[i]==target) {
                        return i;
                    }
                }
            }else {
                result += rex;
                rex *= 2;
            }
        }
    }
    public static int[] searchRange(int[] A, int target) {
        int[] result = {-1,-1};
        if (A.length==0) {
            return result;
        }
        int point = getfirst(A,0,A.length-1,target);
        if (point==-1) {
            return result;
        }
        if (point==0 || A[point-1]!=target) {
            result[0]=point;
            result[1]=getright(A,point,target);
        }else if (point==A.length-1 || A[point+1]!=target) {
            result[0]=getleft(A,point,target);
            result[1]=point;
        }else {
            result[0]=getleft(A,point,target);
            result[1]=getright(A,point,target);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1,5};
        int target = 4;
        int[] result = searchRange(A,target);
        System.out.println(String.valueOf(result[0])+' '+String.valueOf(result[1]));
    }
}
