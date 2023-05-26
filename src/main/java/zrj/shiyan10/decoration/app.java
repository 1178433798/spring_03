package zrj.shiyan10.decoration;

public class app {
    public static void main(String[] args) {
        Encryptor simple=new SimpleEncryptor();
        String text = simple.encrypt("zrj123456789");
        System.out.println(text);

        Encryptor reverse=new ReverseEncryptor(simple);
        String text2 = reverse.encrypt("zrj123456789");
        System.out.println(text2);

        Encryptor modulus=new ModulusEncryptor(reverse);
        String text3 = modulus.encrypt("zrj12345679");
        System.out.println(text3);

    }
}
