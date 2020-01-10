package provider.remoteRegister;

import com.example.dubbo.framework.Url;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class remoteRegister {
    private static Map<String, List<Url>> REGISTER=new HashMap<>();
    public static void register(String interfaceName, Url url){
        List list=REGISTER.get(interfaceName);
        list.add(url);
        REGISTER.put(interfaceName,list);


    }
}
