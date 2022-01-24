package codes;

public class SelectionSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      SelectionSort obj =new SelectionSort();
      int a[]= {1,4,0,5,7};
      int n=5;
      
      //int a[]= {1,5,2,7,3,4,12,8,9,11,13};
      //int n=11;
      obj.sort(a,n);
     
	}
	
	public void sort(int a[], int n)
	{
	    int min;	
		for( int i=0;i<n;i++)
		{
			 min=i;
			 
			 for(int j=i+1;j<n;j++)
			{
		      if(a[j]<a[min])
		      {
		    	min=j;//update the index of minimum element 
		    	
		      
		      int temp=a[i];
		      a[i]=a[min];
		      a[min]=temp;
		      }
			}//inner for loop
		}//outer  for loop
		
		 for(int i=0;i<n;i++)
	      {
	    	  System.out.println(a[i]);
	      }
		
	}
	
}
