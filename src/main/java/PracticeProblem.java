public class PracticeProblem {

	public static String repeatLetter(char letter, int times) {
    String result = "";
    for (int i = 0; i != times; i++) {
        result += letter;
    }
    return result;
}
	public static int countLetter(String text, char letter) {
    int count = 0;
    
    for (int i = 0; i != text.length(); i++) {
        if (text.charAt(i) == letter) {
            count++;
        }
    }
    
    return count;
}
	public static int evenSum(int a, int b) {
    int start;
	int end;
    int sum = 0;
	
    if (a < b) {
        start = a;
        end = b;
    } else {
        start = b;
        end = a;
    }

    for (int i = start; i <= end; i++) {
        
        if (i % 2 == 0) {
            sum += i;
        }
    }

    return sum;
}
}