package Practice;

public class CountStringOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=countOccurances("aahbjfjef",'a');
		
		 System.out.println(count);

	}

	private static int countOccurances(String word, char character) {
		int count=0;
		for(int i=0;i<word.length();i++)
		
		{
			if(word.charAt(i)==character)
			{
				count++;
			}
		}
		
		return 0;
		
		
	}

}
