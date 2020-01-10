package com.example.dubbo.framework;

import java.io.Serializable;

public class invocation  implements Serializable {
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethosName() {
        return methosName;
    }

    public void setMethosName(String methosName) {
        this.methosName = methosName;
    }

    public Class[] getPatamtype() {
        return patamtype;
    }

    public void setPatamtype(Class[] patamtype) {
        this.patamtype = patamtype;
    }

    public Object[] getParam() {
        return param;
    }

    public void setParam(Object[] param) {
        this.param = param;
    }

    private String interfaceName;
    private String methosName;
    private Class[] patamtype;
    private Object[]  param;

    public invocation(String interfaceName, String methosName, Class[] patamtype, Object[] param) {
        this.interfaceName = interfaceName;
        this.methosName = methosName;
        this.patamtype = patamtype;
        this.param = param;
    }
}
