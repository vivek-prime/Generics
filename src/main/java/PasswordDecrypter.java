/**
 * For decryption,
 * we sub 1 from character , but for second last we add 1.
 */
public class PasswordDecrypter {
    public static void main(String[] args) {
        String encryptedPwd = "Cbtbou@87";
        char ch, decrypted_ch = 0;
        String password = "";
        for(int i=0;i<encryptedPwd.length();i++)
        {
            ch = encryptedPwd.charAt(i);
            if(ch >= 48 && ch<=57) // if ch is a number
            {
                if(ch == 56)
                    decrypted_ch = (char) (ch+1);
                else
                    decrypted_ch = (char) (ch-1);
            }
            else if(ch>=97 & ch<=122)
            {
                if(ch==121)
                    decrypted_ch = (char) (ch+1);
                else
                    decrypted_ch = (char) (ch-1);
            }
            else if(ch>=65 & ch<=90)
            {
                if(ch==89)
                    decrypted_ch = (char) (ch+1);
                else
                    decrypted_ch = (char) (ch-1);
            }
            else
                decrypted_ch = ch;
            password = password + decrypted_ch;
        }
        System.out.println("Password - " + password);
    }
}
