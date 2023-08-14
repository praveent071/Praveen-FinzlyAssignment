package dowhileloop;

public class DoWhile {
	public static void main(String[] args) {
			//1
			
			int i = 1;
			do {
				System.out.println(i);
				i++;
			}while(i<=25);
			
			//2
			int j = 25;
			do {
				System.out.println(j);
				j--;
			}while(j>0);
			
			
			//3
			int k = 1;
			do {
				if(i%2!=0) {
					System.out.println(i);
				}
				k++;
			}while(k<100);
			
			//4
			int l = 2;
			do {
				if(i%2==0) {
				System.out.println(l);
				}
				l++;
			}while(l<=100);
			
			//5
			int m = 1;
			do {
				if(m%2!=0) {
				System.out.println(m);
				}
				m++;
			}while(m<=50);
			
			//6
			int n = 2;
			do {
				if(i%2==0) {
				System.out.println(n);
				}
				n++;
			}while(n<=50);
			
			//7
			int o = -45;
			do {
				System.out.println(o);
				o++;
			}while(o<= 45);
			
			
			//8
			int p = 50;
			do {
				System.out.println(p);
				p++;
			}while(p<= 100);
			
			
			//9
			int q = 0;
			int oddSum = 0;
			int evenSum = 0;
			do {
				if(q%2==0) {
					evenSum +=1;
				}else {
					oddSum +=1;
				}
				q++;
			}while(q< 100);
			System.out.println("Odd Sum : "+oddSum+" Even Sum : "+ evenSum);
			
			//10
			int r = 0;
			do {
				if(r%2==0) {
					System.out.println(r+ " even");
				}else {
					System.out.println(r + " odd");
				}
				r++;
			}while(r<=100);
			
			//11
			int s = 1;
			do {
				System.out.println(s);
				s++;
			}while(s<=100);
			
			//12
			int t = 100;
			do {
				System.out.println(t);
				t--;
			}while(t>0);

			//13
			int u =  30;
			do {
				System.out.println(u);
				u++;
			}while(u<=50);
		
			//14
			int v = 1;
			int evenSumSec = 0;
			do {
				if(v%2==0) {
					evenSumSec +=1;
				}
				v++;
			}while(v<=25);
			System.out.println("Even Sum : "+ evenSumSec);
			
			//15
			int w = 1;
			int oddSumSec = 0;
			do {
				if(w%2!=0) {
					oddSumSec +=1;
				}
				w++;
			}while(w<=25);
			System.out.println("Odd Sum : "+oddSumSec);
			
			
			// 1
			int x = 2;
			do {
				System.out.print(x+" ");
				x+=2;
			}while(x<=20);
			
			
			System.out.println();

			//2
			int y = 9;
			do {
				System.out.print(y+" ");
				y+=9;
			}while(y<=90);
			System.out.println();
			
			//3
			int z = 1;
			int temp = 0;
			do {
				if(z%2 == 0) {
					temp = z;
					temp = z *-1;
					System.out.print(temp+" ");
				}else{
					System.out.print(z+" ");
				}
				z++;
			}while(z<=10);
			System.out.println();
			
			//4
			int a = 5;
			do {
				System.out.print(a+" ");
				a+=5;
			}while(a<=50);
			System.out.println();
			
			//5
			int b = 1;
			do {
				System.out.print(b+" ");
				b = b*10;
			}while(b<=1000);
			System.out.println();
			
			//6
			int c = 1;
			int tem = 1;
			do {
				System.out.print(c+" ");
				tem++;
				c += tem;
			}while(c <=45);
			System.out.println();
			
			//7
			int d = 8;
			do {
				System.out.print(d+" ");
				d+=8;
			}while(d<=80);
			System.out.println();
			
			//8
			int count = 0;
			int firstTerm = 0;
			int secTerm = 1;
			int nextTerm = 0;
			 	
			do {
				System.out.print(firstTerm+" ");
				nextTerm = firstTerm + secTerm;
				firstTerm = secTerm;
				secTerm = nextTerm;
				count++;
			
			}while(count<9);
			System.out.println();
			
			//9
			int g = 1;
			do {
				System.out.print(g*g+" ");
				g++;
			}while(g<=10);
			System.out.println();
			
			//10
			int h = 3;
			do {
				System.out.print(h+" ");
				h+=3;
			}while(h<=30);
			System.out.println();
			
			//11
			int aa = 7;
			do {
				System.out.print(aa+" ");
				aa+=7;
			}while(aa<=70);
			System.out.println();
			
			//12
			int bb = 4;
			do {
				System.out.print(bb+" ");
				bb+=4;
			}while(bb<=40);
			System.out.println();
			//13
			int cc = 1;
			do {
				System.out.print(cc*10+" ");
				cc++;
			}while(cc<=10);
			System.out.println();
			
			//14
			int dd = 1;
			int te = 4;
			do {
				if(dd <= 5) {
					System.out.print(dd+" ");
				}
				if(dd>5) {
					System.out.print(te+" ");
					te--;
				}
				dd++;
			}while(dd<10);
			System.out.println();
		
			//15
			int ee = 6;
			do {
				System.out.print(ee+" ");
				ee+=6;
			}while(ee<=60);
			
		}
}


