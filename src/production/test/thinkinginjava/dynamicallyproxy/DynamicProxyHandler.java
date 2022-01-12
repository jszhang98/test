package production.test.thinkinginjava.dynamicallyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.format("***proxy: %s , method: %s, args: %s",proxy.getClass(),method,args);
        if (args != null){
            for (Object arg: args){
                System.out.println(" "+arg);
            }
        }
        return method.invoke(proxied,args);
    }
}
