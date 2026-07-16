// ดูโจทย์ spec และวิธีทำใน README.md
public class PasswordValidator {

    static final int MIN_LEN = 8;
    static final int MAX_LEN = 20;

    static boolean validate(String pw) {
        // R1: pw ต้องไม่เป็น null -> throw IllegalArgumentException[cite: 1]
        if (pw == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }

      
        if (pw.length() < MIN_LEN || pw.length() > MAX_LEN) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpace = false;

        for (int i = 0; i < pw.length(); i++) {
            char ch = pw.charAt(i);

       
            if (Character.isWhitespace(ch) || ch == ' ') {
                hasSpace = true;
            }

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
     
      
        return hasUpper && hasLower && hasDigit && !hasSpace;
    }
}