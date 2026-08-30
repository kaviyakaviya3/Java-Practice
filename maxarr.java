import java.util.*;
class main{
    public static void main(String []args){
        int a[]={1,2,3,4,5,6};
        int k=3;
        int s=0;
        for(int i=0;i<k;i++){
            s=s+a[i];
        }
        int max=0;
        for (int i=k;i<a.length;i++);
        s=s-a(i-k)+a[i];
        max=Math.max(s,max);

        }
        System.out.println((double)max/k);
    }
        