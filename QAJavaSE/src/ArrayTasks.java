import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ArrayTasks {
	
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5,9,8,12);
		
		//1 print each
		System.out.println("#1#");
		System.out.println(numbers.toString());
		
		//2 print even
		System.out.println("#2#");
		for (Integer num : numbers) {
			if(num%2 == 0) {
				System.out.println(num);
			}
		}
		
		//3 each element x10
		System.out.println("#3#");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i)*10);
		}
		
		//4 print highest
		System.out.println("#4#");
		Collections.sort(numbers);
		System.out.println(numbers.get(numbers.size()-1));
		
		//5 print lowest
		System.out.println("#5#");
		System.out.println(numbers.get(0));
		
		//6 square each number, add to new list
		System.out.println("#6#");
		ArrayList<Double> squaredList = new ArrayList<>();
		for (Integer num : numbers) {
			squaredList.add(Math.pow(num, 2));
		}
		System.out.println(squaredList.toString());
		
		//7 square unique numbers, add to new list
		System.out.println("#7#");
		ArrayList<Double> uniqueSquaredList = new ArrayList<Double>();
		uniqueSquaredList = (ArrayList<Double>) numbers.stream().distinct().map(a -> Math.pow(a, 2)).collect(Collectors.toList());
		System.out.println(uniqueSquaredList.toString());
		
		
	}
	
	

}
