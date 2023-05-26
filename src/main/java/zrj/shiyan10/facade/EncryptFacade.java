package zrj.shiyan10.facade;

public class EncryptFacade implements Encryption {
    private FileReader fileReader;
    private Encryptor encryptor;
    private FileSaver fileSaver;
    public EncryptFacade() {
        this.fileReader = new FileReader();
        this.encryptor = new Encryptor();
        this.fileSaver = new FileSaver();
    }
    public void encrypt() {
        fileReader.readFile();
        encryptor.encryptFile();
        fileSaver.saveFile();
    }
}
