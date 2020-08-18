package test;

public class vowels {

	public static void main(String[] args) {
		
		String line = "song is";
		int vowels= 0, consonants = 0;
		line = line.toLowerCase();		
		int lengthCount = line.length();
		for (int i=0;i< lengthCount; i++ ) {
			
			char ch = line.charAt(i);
			if (ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u') {
				vowels++;
			}
				else {
					consonants ++;
					
					}
				}
				System.out.println("number of vowels are: " + vowels);
				System.out.println("number of consonants are: " + consonants);
			}

	}

