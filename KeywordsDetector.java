public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        String str="";
        for(int i=0; i<sentences.length; i++){
            str = lowerCase(sentences[i]);
            for(int j=0; j<keywords.length; j++){
                if(contains(str, keywords[j])){
                    System.out.println(str);
                    break;
                }
            }
        }
    }


    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String ans ="";
		char ch = str.charAt(0);
		if (ch >= 'a' && ch <='z'|| ch >='!' && ch <= '@' || ch ==' ')ans = "" + ch;
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
			else if (ch >= 'a' && ch <='z' || ch >='!' && ch <= '@'|| ch ==' ') ans = ans + ch;
			i++;
		}
		return ans;
    }


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
