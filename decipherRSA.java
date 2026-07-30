import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("1487932939581322413763429");
        BigInteger e = new BigInteger("157");
        BigInteger p = new BigInteger("21646157677");
        BigInteger q = new BigInteger("68738894069977");
                
        BigInteger phi = p.subtract(BigInteger.ONE)
                         .multiply(q.subtract(BigInteger.ONE));        
        BigInteger d = e.modInverse(phi);
        
        String[] ciphertexts = {
            "1221452609927320607780724",
            "1070635318622894620123042",
            "1234660723733489496548997",
            "1187680576276238932467507",
            "0462335466800705147652322",
            "0155857522345508720927245",
            "0734726920089060482937205",
            "0717552499748517415525649",
            "0216175998279034013180163",
            "0744631996076889398831580",
            "0843146475217094457104881",
            "0196052595269218722591822",
            "1204699116114648990915780",
            "1425141587631982783760667"
        };
        
        StringBuilder message = new StringBuilder();
        
        for (String cipher : ciphertexts) {
            BigInteger c = new BigInteger(cipher);
            BigInteger m = c.modPow(d, n);
            
            int ascii = m.intValue();
            if (ascii >= 32 && ascii <= 126) {
                message.append((char) ascii);
            } else {
                String hex = m.toString(16);
                if (hex.length() % 2 != 0) {
                    hex = "0" + hex;
                }
                for (int i = 0; i < hex.length(); i += 2) {
                    String part = hex.substring(i, i + 2);
                    int val = Integer.parseInt(part, 16);
                    if (val >= 32 && val <= 126) {
                        message.append((char) val);
                    }
                }
            }
        }
        
        System.out.println(message.toString());
    }
}
