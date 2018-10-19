package Compression;

public class Compression {

	
	public static void main(String[] args) {
		
		
		String sentence = "live verses";
		String newSentence = "";
		
		int charRemoveCount=0;
		
		String[] splitSentence = sentence.split(" ");
		
		char[] word1 = splitSentence[0].toCharArray();
		char[] word2 = splitSentence[1].toCharArray();
		
		
		int j = 0;
		int k = 0;
		
		try {
			for (j = 0; j < word2.length;) {
				
				if(word1[j] != word2[k]) {
					j++;
					k=0;
					charRemoveCount = 0;
				}else {
					j++;
					k++;
					charRemoveCount++;
//					if(word1[j+1] == word1[k]) {
//						j++;
//					}else {
//						j++;
//						k++;
//						charRemoveCount++;
//					}
				
				}
				
			}
		}catch(IndexOutOfBoundsException e) {
			newSentence = String.valueOf(word1) + String.valueOf(word2).substring(charRemoveCount, word2.length);
			
		}finally {
			System.out.println(newSentence);
		}
		

	
		
		
		
		
		
//		for (int i = 0; i < splitSentence.length; i++) {
//			compareWords(splitSentence[i], splitSentence[i+1]);
//		}
//		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void compareWords(String word1, String word2) {
		
/*		if(word1.length() > word2.length()) {
			length = word1.length();
		} else {
			length = word2.length();
		}*/
		
//		int length = word1.length() > word2.length() ? word1.length() : word2.length();
		
		int j = 0;
		int k = 0;
		for (j = 0; j < word1.length();) {
			
			if(compareChar(word1.charAt(j), word2.charAt(k))) {
				j++;
				k++;
			} else {
				j++;
			}
			
		}
		
	}
	
	
	public static boolean compareChar(char w1, char w2) {
		return w1 == w2;
	}
	
	
}
