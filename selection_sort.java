public class selection_sort {
    public static void main(String[] args) {
        int ar[]={12,43,54,2,352,425,};
        int l=ar.length;
        int min;
        int temp;
        int pos;
        for(int a=0;a<l;a++)
        {
            min=ar[a];
            pos=a;
            for(int b=a+1;b<l;b++)
            {
                if(ar[b]<min){
                min=ar[b];
                pos=b;
                }
            }
     temp=ar[a];
     ar[a]=ar[pos];
     ar[pos]=temp;
        
        }
   for(int x=0;x<l;x++)
   System.out.println("array after sorting"+" "+ar[x]);
    }
    
}
