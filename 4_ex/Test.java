import java.util.Scanner;

public class Test  {

//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误，
// 可以重新输 入，最多输入三次。三次均错，则提示退出程序

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = 3;
	String str = "abcd";
	while (count>0) {
		String str2 = scan.nextLine();
		int compareTom2 = 0;
		if ((compareTom2 = str.compareTo(str2)) == 0) {
			System.out.println("登录成功");
			break;
		}else {
			if (count>1) {
				System.out.println("密码错误，重新输入吧");
			}
			
			count--;
			continue;
		}
	}
	if (count==0) {
		System.out.println("机会完了，没了");
	}
	
}


//输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3

// public static void print(int n) {
// 	if (n < 0) {
// 		System.out.print("- ");
// 		n = -n;
// 	}
	
// 	if (n>9) {
// 		print(n/10);
// 	}
// 	System.out.print(n%10+" ");
// }
// public static void main(String[] args) {
// 	System.out.println("请输入一个数：");
// 	Scanner scan = new Scanner(System.in);
// 	int n = scan.nextInt();
// 	print(n);
	
// }

//输出n*n的乘法口诀表，n由用户输入
// public static void main(String[] args) {
// 	System.out.println("请用户输入n：");
// 	System.out.println("请输入一个数：");
// 	Scanner scan = new Scanner(System.in);
// 	int n = scan.nextInt();
// 	int line = 0;//行
// 	int cow = 0;//列
// 	for (line = 1;line <= n;line++ ) {
// 		for (cow = 1;cow <= line ;cow++ ) {
// 			int sum = cow * line;
// 			System.out.print(line+"*"+cow+"="+sum+" ");
// 		}
// 		System.out.println("\n");
// 	}
// }

//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列

// public static void main(String[] args) {
// 	System.out.println("请输入一个数：");
// 	Scanner scan = new Scanner(System.in);
// 	int a = scan.nextInt();
// 	System.out.println("偶数：");
// 	for (int i = 0;i < 32 ;i++ ) {
		
// 		if (i%2 == 0) {
// 			int x =  (a>>i)&1;
//             System.out.print(x);
// 		}
// 	}
// 	System.out.println("\n");
// 	System.out.println("奇数");
// 	for (int i = 0;i < 32 ;i++ ){
// 		if(i%2 != 0) {
// 			int y =  (a>>i)&1;
//             System.out.print(y);
// 		}
// 	}
// }

//二进制1的个数,求一个整数，在内存当中存储时，二进制1的个数
 
 // public static void main(String[] args) {
 // 	System.out.println("请输入一个数：");
 // 	Scanner scan = new Scanner(System.in);
 // 	int a = scan.nextInt();
 // 	int count = 0;
 // 		int i = 0;
 // 		int b = 1;
	// while (i<32) {
	// 	if (((a>>i)&1)  == 1) {
	// 		count++;
	// 		}
	// 	i++;
	
	// }
	// System.out.println(count);
 // }





	//求两个正整数的最大公约数
	
// public static void main(String[] args) {
	
// 	int maxy = 0;
// 	System.out.println("请输入两个整数：");
// 	Scanner scan = new Scanner(System.in);
// 	int a = scan.nextInt();
// 	int b = scan.nextInt();
// 	if (a < b ) {
// 		int temp = a;	
// 		a = b;
// 		b = temp;
// 	}
// 	for (maxy = b;maxy > 0 ;maxy-- ) {
// 		if (a%maxy == 0 && b%maxy == 0) {
// 			System.out.println("最大公约数为："+maxy);
// 			break;
// 		}
// 	}

// }



	//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 
	// public static void main(String[] args) {
	// 	int a = 0;
	// 	double sum = 0;
	// 	 int flag = 1;
	// 	for (a = 1;a <= 100;a++ ) {   
	// 		sum += 1.0/(a*(flag));
 //            flag = -flag;
	// 	}
	// 	System.out.println(sum);
	// }



// 	public static void main1(String[] args) {
// //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
//  			int a = 0;
         

//       		for (a = 1;a <= 999 ; a++) {
// 			    int sum =  0;
// 				int num = a;
//       			while (num != 0) {
//       				int r = num % 10;
//       				sum += r * r * r;
//       				num /= 10;    
//       			}
//       			if(a == sum && a != 1){
//       				System.out.println(a+" ");
//       			}

//       		}		
// 	}
}