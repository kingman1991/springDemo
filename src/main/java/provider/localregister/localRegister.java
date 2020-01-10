package provider.localregister;

import java.util.HashMap;
import java.util.Map;

public class localRegister {
    static Map<String,Class> map=new HashMap<>();
    public static void register(String interfaceName, Class classImpl){
        map.put(interfaceName,classImpl);

    }
    public static Class get(String interfaceName){
        return this.map.get(interfaceName);
    }
}
