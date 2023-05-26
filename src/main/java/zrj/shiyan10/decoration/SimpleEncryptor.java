package zrj.shiyan10.decoration;

public class SimpleEncryptor implements Encryptor{
    @Override
    public String encrypt(String text) {
        int shift=3;
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int shifted = c + shift;
                if (Character.isUpperCase(c)) {
                    if (shifted > 'Z') {
                        shifted -= 26;
                    } else if (shifted < 'A') {
                        shifted += 26;
                    }
                } else {
                    if (shifted > 'z') {
                        shifted -= 26;
                    } else if (shifted < 'a') {
                        shifted += 26;
                    }
                }
                c = (char) shifted;
            }
            result.append(c);
        }
        return result.toString();
    }
}
