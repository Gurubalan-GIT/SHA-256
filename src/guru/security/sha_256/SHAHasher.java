package guru.security.sha_256;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

class SHAHasher {
    static String applySha256(String input){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            //Using Standard Charsets as it is faster than regular UTF-8 and hence exception is also handled
            byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            //Using StringBuilder, can use StringBuffer also, depends.
            StringBuilder hexString = new StringBuilder();
            for(int i:hash) {
                String hex = Integer.toHexString(0xff & i);
                if (hex.length() == 1) hexString.append(0);
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
