
public class mergearray {
    public static void main(String[] args) {
        int a[]={12,43,42,64,12,64};
        int b[]={76,98,68,987,98,78};
        int ar[]=new int[12];
        for(int c=0;c<a.length;c++)
        {
            ar[c]=a[c];

        }
        for(int d=0;d<b.length;d++)
        {
            ar[6+d]=b[d];
        }
    for(int  z=0;z<ar.length;z++)
    {
        System.out.println("numbers are"+ar[z]);
    }
    
    }

}
