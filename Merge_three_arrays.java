package arrays;
import java.util.*;
public class Merge_three_arrays {
	public static int[] Merge(int[] a,int[] ar,int[] arr) {
		int i=0,k=0;
		int[] res=new int[a.length+ar.length+arr.length];
		while(k<res.length)
		{
		  if(i<a.length) {
			res[k++]=a[i];
			}
		   if(i<ar.length) {
			res[k++]=ar[i];
		    }
		     
		  if(i<arr.length){
			res[k++]=arr[i];
		   }
		   i++;
		}
		return res;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      int n1=scan.nextInt();
	     int[] a=new int[n1];
	     for(int i=0;i<a.length;i++) {
	    	 a[i]=scan.nextInt();
	    	  }
	     int n2=scan.nextInt();
	     int[] ar=new int[n2];
	     for(int j=0;j<ar.length;j++) {
	    	 ar[j]=scan.nextInt();
	       }
	     int n3=scan.nextInt();
	     int[] arr=new int[n3];
	     for(int k=0;k<arr.length;k++) {
	    	 arr[k]=scan.nextInt();
	       }
	     int[] res=Merge(a,ar,arr);
	     for(int i=0;i<res.length;i++) {
	    	 System.out.println(res[i]+" ");
	     }
	      
	}

}
