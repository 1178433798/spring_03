package zrj.shiyan8.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicallyCreated {
    private Object BeProxyObject;
    private InvocationHandler handler ;
    public DynamicallyCreated(Object beProxyObject, InvocationHandler handler) {
        BeProxyObject = beProxyObject;
        this.handler = handler;
    }
    public Object Create(){
        ClassLoader loader = this.getClass().getClassLoader();

        Class[] interfaces = this.BeProxyObject.getClass().getInterfaces() ;

        return Proxy.newProxyInstance(loader, interfaces, handler) ;
    }
}
