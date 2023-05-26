package zrj.shiyan10.decoration;

public class ComplexEncryptor implements Encryptor{

    private Encryptor encryptor;

    public ComplexEncryptor(Encryptor encryptor) {
        this.encryptor = encryptor;
    }


    @Override
    public String encrypt(String text) {
        return encryptor.encrypt(text);
    }
}
