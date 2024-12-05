public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String ans ="";
		char ch = str.charAt(0);
		if (ch >= 'a' && ch <='z'|| ch >='!' && ch <= '@')ans = "" + ch;
		else if(ch >= 'A' && ch <= 'Z') 
		{
			ch+=32;
			ans = "" + ch;
		}
		int i=1;
		while (i < str.length()) {
			ch= str.charAt(i);
			if (ch >= 'A' && ch <= 'Z'){
				ch+=32;
				ans = ans + ch;
			}
			else if (ch >= 'a' && ch <='z' || ch >='!' && ch <= '@') ans = ans + ch;
			i++;
		}
		return ans;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if(str1.length()<str2.length()) return false;
        else if(str1.equals(str2)) return true;
        else{
            String str="";
            int options= str1.length()-str2.length()+1;
            for(int i=0; i< options; i++){
                str = str1.substring(i, str2.length()+i);
                if(str.equals(str2))return true;
            }
        }
        return false;
    }
}
