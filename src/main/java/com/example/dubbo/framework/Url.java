package com.example.dubbo.framework;

public class Url {
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    private String hostname;
    private Integer port;

    public Url(String hostname, Integer port) {
        this.hostname = hostname;
        this.port = port;
    }

}
