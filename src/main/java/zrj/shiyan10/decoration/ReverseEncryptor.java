package zrj.shiyan10.decoration;

public class ReverseEncryptor extends ComplexEncryptor{

    public ReverseEncryptor(Encryptor encryptor) {
        super(encryptor);
    }

    public String reverse(String text){
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public String encrypt(String text) {
        String encrypt = super.encrypt(text);
        return reverse(encrypt);
    }


}
