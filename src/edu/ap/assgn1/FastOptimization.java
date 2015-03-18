package edu.ap.assgn1;
import java.util.*;
class FastOptimization
{
	
	
	
	public int minimized_path(int[] a1, int[] a2, int[] t1, int[] t2, int e1, int e2, int x1, int x2){
		
		
		int [] f1, f2 , l1, l2;
		int f,l,k;
		int size = a1.length;
		f1 = new int[size];
		f2 = new int[size];
		l1 = new int[size];
		l2 = new int[size];
		
		f1[0]=e1+a1[0];
		f2[0]=e2+a2[0];
		
		System.out.println("\n\nLine 1");
		System.out.print("Station\t\tTime\n");
		for (int i=0;i<size;i++){
			System.out.println((i+1)+"\t\t"+a1[i]);
		}
		System.out.println("\n\nLine 2");
		System.out.print("Station\t\tTime\n");
		for (int i=0;i<size;i++){
			System.out.println((i+1)+"\t\t"+a2[i]);
		}
		
		System.out.println("\nEntry Times: \ne1="+e1+"\ne2="+e2);
		System.out.println("\nExit Times:\nx1="+x1+"\nx2="+x2);
		
		for(int j=1;j<size;j++){
			
			if((f1[j-1]+a1[j]) <=(f2[j-1]+t2[j-1]+a1[j])){
				f1[j]=f1[j-1]+a1[j];
				l1[j]=1;
			}
			
			else{
				f1[j]=f2[j-1]+t2[j-1]+a1[j]; l1[j]=2;
			}
			
			if((f2[j-1]+a2[j])<=(f1[j-1]+t1[j-1]+a2[j])){
				f2[j]=f2[j-1]+a2[j]; 
				l2[j]=2;
			}
			
			else{
				f2[j]=f1[j-1]+t1[j-1]+a2[j];
				l2[j]=1;
			}
		}

		if(f1[size-1]+x1 < f2[size-1]+x2){ 
			f=f1[size-1]+x1;
			l=1;
		}
		else{
			f=f2[size-1]+x2;
			l=2;
		}
		

		System.out.println("\n\n");
		System.out.println("Optimal Time is: "+f);
		System.out.println("Optimal line is: "+l);

		System.out.println("\n\nOptimal Path\n");
		System.out.println("Line \t\t Station ");
		System.out.println(l+"\t\t "+size);
		
		k=l;
		for(int j=size-1;j>=1;j--)
		{

			if (k==1)
			{
				k=l1[j]; 
				System.out.println(k+"\t\t "+j);
			}
			else
			{
				k=l2[j];
				System.out.println(k+"\t\t "+j);
			}
		}
		System.out.println();

		return f;
		
		
		
	}
			
}
