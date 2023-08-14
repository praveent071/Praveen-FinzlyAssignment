package forloop;

public class forloop {
	public static void main(String[] args)
	{
		//1
		for(int i=1;i<=25;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//2
		for(int i=25;i>=1;i--) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		//3
		for(int i=1;i<100;i++) {
			if(i%2 !=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//4
		for(int i=1;i<100;i++) {
			if(i%2 ==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//5
		int a = 0;
		for(int i=1;i<50;i++) {
			if(i%2 !=0) {
				a =a+i;
			}
		}
		System.out.println("sum of 1 to 50 Odd nos " + a);
		//6
		int b = 0;
		for(int i=1;i<50;i++) {
			if(i%2 ==0) {
				b =b+i;
			}
		}
		System.out.println("sum of 1 to 50 Odd nos " + b);
		//7
		for(int i=-45;i<=45;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//8
		for(int i=50;i<=100;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//9
		int c = 0;
		for(int i=1;i<50;i++) {
			if(i%2 !=0) {
				c =c+i;
			}
			else if(i%2==0) {
				c=c+i;
			}
		}
		System.out.println("Sum of odd and even "+ c);
		//10
		for(int i=1;i<100;i++) {
			if(i%2 ==0) {
				System.out.print("Even "+ i+" ");
			}
			else {
				System.out.print("Odd "+ i+" ");
			}
		}
		System.out.println();
		//11
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//12
		for(int i=100;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		//13
		for(int i=30;i<=50;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//14
		int d =0;
		for(int i=1;i<=25;i++) {
			if(i%2==0) {
				d=d+1;
			}
		}
		System.out.println("count of even No 1 to 25 no " + d);
		//15
		int e =0;
		for(int i=1;i<=25;i++) {
			if(i%2!=0) {
				e=e+1;
			}
		}
		System.out.println("count of odd No 1 to 25 no " + e);
		//Series for loops
		//1
		for(int i=2;i<=20;i+=2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		//2
		for(int i=9;i<=90;i+=9) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		//3
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			else {
				System.out.print("-"+i+" ");
				
			}
		}
		System.out.println();
		//4
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//5
		for(int i=1;i<=1000;i*=10) {
			System.out.print(i + " ");
				
			}
		System.out.println();
		//6
		int f = 0;
		for(int i=1;i<=10;i++) {
			System.out.print(f + " ");
			f=i+f;

		}
		System.out.println();
		//7
		for(int i=8;i<=80;i+=8) {
			System.out.print(i + " ");
				
			}
		System.out.println();
		//8
		int g =0;
		int x =1;
		for(int i=1;i<=10;i++) {
			System.out.print(g + " ");
			int z = g+x;
			g=x;
			x=z;
		}
		System.out.println();
		//9
		
		for(int i=1;i<=10;i++) {
			System.out.print(i*i + " ");
		}
		System.out.println();
		//10
		for(int i=1;i<=10;i++) {
			System.out.print(i*3 + " ");
		}
		System.out.println();
		//11
		for(int i=1;i<=10;i++) {
			System.out.print(i*7 + " ");
		}
		System.out.println();
		//12
		for(int i=1;i<=10;i++) {
			System.out.print(i*4 + " ");
		}
		System.out.println();
		//13
		for(int i=1;i<=10;i++) {
			System.out.print(i*10 + " ");
		}
		System.out.println();
		//14
		for(int i=1;i<=5;i++) {
			System.out.print(i + " ");
		}
		for(int i=4;i>=1;i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		//15
		for(int i=1;i<=10;i++) {
			System.out.print(i*6 + " ");
		}
	}
}
