//functional programming


@FunctionalInterface 
interface Test{
	// default method 
	public default void paint()
	{
		System.out.println("from default method");
	}
	//static method
	public static void method()
	{
		System.out.println("from static method");
	}
	// abstract method
	//single abstract method(sam)
	public void print();
	//void m();
	//only one abstract method is allowed per FunctionaInterface
}

class TestImpl implements Test
{
	 public void print()
	{
		System.out.println("inside test implements 1");
	}

}



interface Test2{
	public void print(int a,int b);
}
interface Test3
{
	public int factorial(int n);
}

interface Test4
{
	public String getString();
}

public class TestLambdas {

	public static void main(String[] args) {
		
		
		Test test=()->{
			System.out.println("from print ... printing");
			};
test.print();

Test2 test2=(int a,int b)->{
	int c=a+b;
	System.out.println(c);
};

test2.print(2, 3);

Test3 test3 = (int n)->
{
	int fact=1;
	int i=1;
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	return fact;
	
};

int factorialResult=test3.factorial(5);
System.out.println(factorialResult);

//interface anonymous classes
Runnable r= new Runnable()
{
	public void run() {
		System.out.println("from run method.......");
	}
};
Thread thread =new Thread(r);
thread.start();

// the same code by using lambda
Runnable r1=()->
{
	System.out.println("from run()-> method ........ ");
};

Thread thread1 =new Thread(r1);
thread1.start();

String s="Do whatever u want ";
Test4 test4=()-> "Perma culture";
System.out.println(test4.getString());

Test4 t=()->s;
System.out.println(t.getString());
	}

}
