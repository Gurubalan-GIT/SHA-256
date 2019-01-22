package guru.security.sha_256;

import java.util.Scanner;

import static guru.security.sha_256.SHAHasher.applySha256;

public class SHA {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        System.out.println(applySha256(string));
    }

}
