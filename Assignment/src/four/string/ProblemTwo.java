package assignment.four.string;

public class ProblemTwo {

	public static void main(String[] args) {
		String s = "AZHAR HUSSAIN";
		char[] ch = s.toCharArray();
		int i = 0;
		int count = 0;
		for (i = 0; i < ch.length; i++) {
			
			if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {			
				count++;			
			}
		}
		System.out.print(count);
	}

}
