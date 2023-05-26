package zrj.shiyan10.decoration;

public class ModulusEncryptor extends ComplexEncryptor{
    public ModulusEncryptor(Encryptor encryptor) {
        super(encryptor);
    }
    public String modulus(String text){
        int mod = 10;
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int shifted = c % mod;
                c = (char) shifted;
            }
            result.append(c);
        }
        return result.toString();
    }
    @Override
    public String encrypt(String text) {
        String encrypt = super.encrypt(text);
        return modulus(encrypt);
    }
}
