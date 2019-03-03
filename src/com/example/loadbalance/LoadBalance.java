package com.example.loadbalance;

import java.util.*;

/**
 * Created by wecash on 19/2/27.
 */
public class LoadBalance {

    private Integer pos = 0;

    private String testRoundRobin() {
        Map<String, Integer> serverMap = new HashMap<>();
        serverMap.putAll(ServerConfig.getServerMap());
        Set<String> ipSet = serverMap.keySet();
        List<String> ipList = new ArrayList<>();
        ipList.addAll(ipSet);

        String server;
        synchronized (pos) {
            if (pos >= ipSet.size()) {
                pos = 0;
            }
            server = ipList.get(pos);
            pos++;
        }
        return server;
    }

    public static void main(String[] args) {
        LoadBalance loadBalance = new LoadBalance();
        for (int i = 0; i < 10; i++) {
            System.out.println(loadBalance.testRoundRobin());
        }
    }

}
