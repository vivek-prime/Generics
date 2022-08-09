/**
 * For Encryption,
 * we add 1 to character , but for last we sub 1.
 */
public class PasswordEncrypter {
    public static void main(String[] args) {
        String password = "vivek400";
        char ch, decrypted_ch = 0;
        String encryptedPassword = "";
        for(int i=0;i<password.length();i++)
        {
            ch = password.charAt(i);
            if(ch >= 48 && ch<=57) // if ch is a number
            {
                if(ch==57)
                    decrypted_ch = (char) (ch-1);
                else
                    decrypted_ch = (char) (ch+1);
            }
            else if(ch>=97 & ch<=122)
            {
                if(ch==122)
                    decrypted_ch = (char) (ch-1);
                else
                    decrypted_ch = (char) (ch+1);
            }
            else if(ch>=65 & ch<=90)
            {
                if(ch==90)
                    decrypted_ch = (char) (ch-1);
                else
                    decrypted_ch = (char) (ch+1);
            }
            else
                decrypted_ch = ch;
            encryptedPassword = encryptedPassword + decrypted_ch;
        }
        System.out.println("encryptedPassword - " + encryptedPassword);
    }
}
