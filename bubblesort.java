class bubblesort
{
    public static void main(String[] args) {
        int ar[]={12,54,65,23,65,23};
        int s=ar.length;
        int temp;
        for(int a=0;a<s;a++)
        {
            for(int b=0;b<s-1-a;b++)
            {
                if(ar[b]>ar[b+1])
                {
                    temp=ar[b];
                    ar[b]=ar[b+1];
                    ar[b+1]=temp;
                }
            }
        }    
      System.out.println("array after sorting is");
      for(int d=0;d<s;d++)
      {
          System.out.println(""+ar[d]);
      }
    }
}
