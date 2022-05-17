
import java.util.List;
import java.util.Arrays;
interface A
{
	void show(int x,int y);
	//default method
	 default void mi()
	 {
		 System.out.println("inside mi");
	 }
	//default method 
}
public class Practiselambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a interface is implemented by anonymous class (class which doesnot have name)
		
		
		 
		A a=(int x,int y) -> System.out.println("hello "+x+" Bang "+y);
		
		A b=(int x,int y) -> System.out.println("Java"+x+" "+y);
		
		A c=(int x,int y) -> 
		{
			int sum=x+y;
			System.out.println("Java"+x+" "+y);
			System.out.println("sum of xa and y is "+sum);
			
		};
		
		a.show(3,4);
		b.show(1,20);
		c.show(12, 6);
		
		
		
		
		
		List<Integer> list = Arrays.asList(145,782,36,49,95);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("link");
		
		for(int i:list)
		{
			System.out.println(i);
		}
		System.out.println("world");
		
		//foreach loop 
		
		list.forEach(i->System.out.println(i));
		
		
		
	}

}
