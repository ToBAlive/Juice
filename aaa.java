package newjava;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class aaa{
	public static void main(String[] args) {
		//第一，二题
		
	Test evenumberTest=(n,sum)->{return n%2==0?1:0;};
	Test primenumberTest=(n,sum)->{int a; if(n==1) {
		return 1;
		}
	else{for(a=2;a<n;a++) {if(n%a==0) {return 0;}}if(a==n) {return 1;}}
	return 0;};
	Test tiredand=(n,sum)->{sum=0;for(int b=1;b<=n;b++) {sum=sum+b;}return sum;};
	//第三题
	LearnLanguage c=(str,value)->str="c";int value=3; System.out.println("在"+str+"语言中打印函数是这么写的：printf（\"value=%d\","+value+"）;");
	LearnLanguage java=(str,value)->str="java";int value=3; System.out.println("在"+str+"语言中打印函数是这么写的：System.out.println("+value+");");
	LearnLanguage python=(str,value)->str="python";int value=3; System.out.println("在"+str+"语言中打印函数是这么写的：print("+value+");");
	//第四题 能
    ArrayList<Integer>list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.forEach((int s)->{
    	public int accept(int s) {
    		int sum=0;
    		sum=sum+s;
    		return sum;
});
    }
	interface Test{
		int operation(int n,int sum);
	}
	private int operate(int n,int sum,Test test) {
		return test.operation(n, sum);
	}
	 interface LearnLanguage{
         void learnToWritePrintMethod(String str ,int value);
}
}