package com.example.loadbalance;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wecash on 19/2/27.
 * https://www.open-open.com/code/view/1457074772062
 */
public class ServerConfig {

    public static Map<String, Integer> getServerMap() {
        Map<String, Integer> serveMap = new HashMap<>();
        serveMap.put("192.168.1.12", 1);
        serveMap.put("192.168.1.13", 1);
        serveMap.put("192.168.1.14", 2);
        serveMap.put("192.168.1.15", 2);
        serveMap.put("192.168.1.16", 3);
        serveMap.put("192.168.1.17", 3);
        serveMap.put("192.168.1.18", 1);
        serveMap.put("192.168.1.19", 2);
        return serveMap;
    }

}
