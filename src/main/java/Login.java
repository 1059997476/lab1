import org.apache.commons.codec.digest.DigestUtils;

import java.io.*;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号");
        String uname = sc.next();
        System.out.println(uname);
        System.out.print("请输入密码");
        String password = sc.next();
        String sha256Hex = DigestUtils.sha256Hex(password);
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("..a\\1.txt"));
        outputStream.writeUTF(uname+"\t"+sha256Hex);
        outputStream.close();
    }
}
