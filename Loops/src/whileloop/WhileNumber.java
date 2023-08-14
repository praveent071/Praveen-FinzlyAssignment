package whileloop;


public class WhileNumber {
	//1
	public void While1() {
		int i = 1;
		while(i<=25) {
			System.out.println(i);
			i++;
		}
	}
	
	//2
	public void While2() {
		int i = 25;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	//3
	public void While3() {
			int i=1;
		while(i<=100) {
			if(i%2!=0) {
				System.out.println(i);

			}
			i++;
		}
	}
	//4
	public void While4() {
		int i=1;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);

			}
			i++;
		}
	}
	//5
	public int While5() {
		int i=1,sum=0;
		while(i<=50) {
			if(i%2!=0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		return sum;
	}
	//6
	public int While6() {
		int i=1,sum=0;
		while(i<=50) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		return sum;
	}
	//7
	public void While7() {
		int i = -45;
		while(i<=45) {
			System.out.println(i);
			i++;
		}
	}
	//8
	public void While8() {
		int i = 50;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
	//9
	public void While9() {
		System.out.println(While5()+While6());
	}
	//10
	public void number10() {
		While3();
		While4();
	}
	//11
	public void While11() {
		int i = 1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
	//12
	public void While12() {
		int i = 100;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	//13
	public void While13() {
		int i = 30;
		while(i<=50) {
			System.out.println(i);
			i++;
		}
	}
	//14
	public void While14() {
		int i=1,count=0;
		while(i<=25) {
			if(i%2!=0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
	//15
	public void While15() {
		int i=1,count=0;
		while(i<=25) {
			if(i%2==0) {
				count++;
			}
			i++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		WhileNumber n = new WhileNumber();
		n.While1();
		n.While2();
		n.While3();
		
	}
}

