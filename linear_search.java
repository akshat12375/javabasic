import javax.lang.model.util.ElementScanner6;

public class linear_search {
    public static void main(String[] args) {
       int  ar[]={23,2,2,82,62,62,65,52};
       int l=ar.length;
       int  n=53;int flag=0;
       for(int a=0;a<l;a++)
       {
           if(n==ar[a]){
           flag=1;
           break;
           }
       else
       flag=0;

       
        }
        if(flag==1)
        System.out.println("nmber is present");
         else if(flag==0) 
         System.out.println("number not present");
    }
   
}
