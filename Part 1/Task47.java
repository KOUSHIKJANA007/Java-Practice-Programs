public class Task47 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        int[] c=marge(a, b);
        int i=0;
        while (i<c.length) {
            System.out.print(c[i]+" ");
            i++;
        }
    }
    public static int[] marge(int[] a,int[] b){
        int[] newarr=new int[a.length+b.length];
        int i=0,k=0,j=0;
        while(i<a.length || j<b.length){
            if(j==b.length || (i<a.length && a[i]<b[j])){
                newarr[k]=a[i];
                k++;
                i++;
            }
            else{
                newarr[k] = b[j];
                k++;
                j++; 
            }
        }
        return newarr;
    }
}
