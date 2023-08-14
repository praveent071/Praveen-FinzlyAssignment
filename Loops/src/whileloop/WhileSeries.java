package whileloop;


public class WhileSeries {
	//1
	public void series1() {
		int i=2;
		while(i<=20) {
			System.out.print(i+" ");
			i+=2;
		}
	}
	//2
	public void series2() {
		int i=9;
		while(i<=90) {
			System.out.print(i+" ");
			i+=9;
		}
	}
	//3
	public void series3() {
		int i=1,j=-2;
		while(i<=9 && j>=-10) {
			System.out.print(i+" "+j+" ");
			i+=2;
			j-=2;
		}		
	}
	//4
	public void series4() {
		int i=5;
		while(i<=50) {
			System.out.print(i+" ");
			i+=5;
		}
	}
	//5
	public void series5() {
		int i=1;
		while(i<=1000) {
			System.out.print(i+" ");
			i*=10;
		}
	}
	//6
	public void series6() {
		int i=1,j=-1;
		while(i<=45) {
			System.out.print(i+" ");
			j++;
			i+=2+j;
		}
	}
	//7
	public void series7() {
		int i=8;
		while(i<=80) {
			System.out.print(i+" ");
			i+=8;
		}
	}
	//8
	public void series8() {
		int i=0,j=1;
		while(i<=21) {
			System.out.print(i+" ");
			int c = i+j;
			i=j;
			j=c;
		}
	}
	//9
	public void series9() {
		int i=1;
		while(i<=10) {
			System.out.print(i*i+" ");
			i++;
		}
	}
	//10
	public void series10() {
		int i=3;
		while(i<=30) {
			System.out.print(i+" ");
			i+=3;
		}
	}
	//11
	public void series11() {
		int i=7;
		while(i<=70) {
			System.out.print(i+" ");
			i+=7;
		}
	}
	//12
	public void series12() {
		int i=4;
		while(i<=40) {
			System.out.print(i+" ");
			i+=4;
		}
	}
	//13
	public void series13() {
		int i=10;
		while(i<=100) {
			System.out.print(i+" ");
			i+=10;
		}
	}
	//14
	public void series14() {
		int i=1,j=4;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		while(j>=1) {
			System.out.print(j+" ");
			j--;
		}
	}
	//15
	public void series15() {
		int i=6;
		while(i<=60) {
			System.out.print(i+" ");
			i+=6;
		}
	}
	public static void main(String[] args) {
		WhileSeries s = new WhileSeries();
		s.series1();
		s.series3();
		s.series6();
	}
	
	
	
	
	

}

