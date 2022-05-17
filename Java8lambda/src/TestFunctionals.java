import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.*;
public class TestFunctionals {

	public static void main(String[] args) {
		
		
		
		Function<String,Integer>lengthFunction=(String str) ->{return str.length();};
		
		
		
			int result = lengthFunction.apply("Miami Beach");
			System.out.println(result);
			
			ArrayList<String>fruits=new ArrayList<>();
			fruits.add("Mango");
			fruits.add("Orange");
			fruits.add("Apple");
			fruits.add("Banana");
			System.out.println(fruits);
			
			List <Integer>lengthList = method(fruits,lengthFunction);
			
			System.out.println(lengthList);
			
			//List<Integer>lengthlist2 = method(fruits,length)
			
			
	
			
			
			
			
			
			
			
		Predicate<Boolean> predicate =(Boolean)->{return true;};
		System.out.println(predicate.test(true));
		
		
		Predicate<Boolean> pr=(Boolean)->{
			
			return 30>27;
			
		};
		
		Consumer<String> consumer =(String str)->{
			
			System.out.println(str);
		};
		
		consumer.accept("monarchy");
		
		//supplier
		
		Supplier<Double> supplier=()->Math.random();
		System.out.println(supplier.get());
		
		Supplier<Integer> supplier2=()->5+6+10;
		System.out.println(supplier2.get());
		
		

	}

	 static List<Integer> method(ArrayList<String> list, Function<String, Integer>functionParam ) {
		// TODO Auto-generated method stub

			
			ArrayList<Integer>intList = new ArrayList<>();
			for(String str:list)
			{
				int length = functionParam.apply(str);
				intList.add(length);
			}
			return intList;
		
	}

}
