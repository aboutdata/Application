/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.commons.ip;

import com.anhao.domain.IP;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Administrator
 */
public class IpProvinceSearchEngine extends RangeSearchEngine<Long, String> {
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * @Title: load
     * @Description: 载入Ip库文件
     * @author Administrato
     */
    public void load(List<IP> ips) {
        TreeMap<Long, RangeRow<Long, String>> map = new TreeMap<Long, RangeRow<Long, String>>();
        for (IP ip : ips) {
            IpProvinceRow row = new IpProvinceRow();
            row.setBegin(convertIpToLong(ip.getStart()));
            row.setEnd(convertIpToLong(ip.getEnd()));
            row.setValue(ip.getProvince());
            row.setCity(ip.getArea());
            map.put(row.getBegin(), row);
        }
        setCache(map);
    }

    /**
     * @Title: getProvince
     * @Description: 获取省份信息
     * @author Administrator
     * @param @param ip
     * @param @return 设定文件
     * @return String 返回类型
     */
    public String getProvince(String ip) {
        //
        long intIp = convertIpToLong(ip);
        //
        return getValue(intIp);
    }

    /**
     * @Title: convertIpToLong
     * @Description: 转换Ip为256进制整数
     * @author Kolor
     * @param ip
     * @return long
     */
    public static long convertIpToLong(String ip) {
        String[] checkIp = ip.split("\\.", 4);
        long intIp = 0;

        for (int i = 3, j = 0; i >= 0 && j <= 3; i--, j++) {
            intIp += Integer.parseInt(checkIp[j]) * Math.pow(256, i);
        }
        return intIp;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
//        String file = "C:\\Users\\Administrator.PC-20110801LBXQ\\Desktop\\ip\\ip.data";
//        IpProvinceSearchEngine engine = new IpProvinceSearchEngine();
//        //
//        long beginTime = System.currentTimeMillis();
//        engine.load(file);
//        long endTime = System.currentTimeMillis();
//        System.out.println("load cost " + (endTime - beginTime));
//        //
//        System.out.println(engine.getProvince("202.101.15.61"));
    }
}
