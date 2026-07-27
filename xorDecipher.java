package xorDecipher;

public class xorDecipher {
	public static void main(String[] args) {
		String paramString = "L\bHM";
		String str = new String("");
		
		for (int i = 0; i < paramString.length(); i++) 
			str = (char)(paramString.charAt(i) ^ 0x7C) + str;
		
		System.out.println(str);
	}
}
