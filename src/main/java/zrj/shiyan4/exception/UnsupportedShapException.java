package zrj.shiyan4.exception;

public class UnsupportedShapException extends RuntimeException{

    private String msg;

    public String getMsg() {
        return msg;
    }
    public UnsupportedShapException(String msg){
       this.msg=msg;
    }
}
