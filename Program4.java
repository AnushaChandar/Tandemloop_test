import java.util.Scanner;

class Program4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[11];
		int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0;
		System.out.println(" Enter the input");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%1==0)
				c1++;
			
			if(a[i]%2==0)
				c2++;
			
			if(a[i]%3==0)
				c3++;
			
			if(a[i]%4==0)
				c4++;
			
			if(a[i]%5==0)
				c5++;
			
			if(a[i]%6==0)
				c6++;
			
			if(a[i]%7==0)
				c7++;
			
			if(a[i]%8==0)
				c8++;
			
			if(a[i]%9==0)
				c9++;
		}
		System.out.println("{1:"+c1+",2:"+c2+",3:"+c3+",4:"+c4+",5:"+c5+",6:"+c6+",7:"+c7+",8:"+c8+",9:"+c9+"}");
		

	}

}
