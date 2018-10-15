package Exc7Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		int[] numbers = IntStream.rangeClosed(1, 100).toArray();
		for (int i : numbers) {
			System.out.println(i);
		}
		
		List<Integer> list = IntStream.rangeClosed(100,999).boxed().collect(Collectors.toList());
		System.out.println(list.toString());
	
		list = list.stream().map(a -> a*10).collect(Collectors.toList());
		System.out.println(list.toString());
		
	}
	
}
