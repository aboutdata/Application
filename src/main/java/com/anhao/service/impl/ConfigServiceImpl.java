/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhao.service.impl;

import com.anhao.commons.bean.BaseConfig;
import com.anhao.commons.bean.SystemConfig;
import com.anhao.service.ConfigService;
import java.io.File;
import java.io.FileInputStream;
import javax.xml.bind.JAXBContext;
import org.springframework.stereotype.Service;
/**
 *
 * @author Administrator
 */
@Service("configServiceImpl")
public class ConfigServiceImpl implements ConfigService {

    private static final String DEFAULT_CONFIG_DIR = "/var/AnHao/config/";
    private JAXBContext unmarshallingClassJAXB;
//    private Unmarshaller unmarshaller;

    @Override
    public String get() {
        // loaderCofig.load();
        return "i  am dubbo demo  server11111111111111111";
    }

    /**
     * 系统配置
     *
     * @return
     */
    @Override
    public SystemConfig getSystemConfig() {
        return (SystemConfig) loadConfig(SystemConfig.class);
    }

    //加载
    private BaseConfig loadConfig(Class clazz) {
        BaseConfig result = null;
        try {
            this.unmarshallingClassJAXB = JAXBContext.newInstance(new Class[]{SystemConfig.class});
            String configName = (String) clazz.getField("CONFIG_NAME").get(null);
            result = (BaseConfig) unmarshallingClassJAXB.createUnmarshaller().unmarshal(new FileInputStream(getConfigFilename(configName)));
            result.setLastUpdate(System.currentTimeMillis());
            result.setLastModified(getLastModified(configName));
        } catch (Exception ex) {
            ex.printStackTrace();
//            this.logger.error("Error init JAXB env", ex);
        }
        return result;
    }

    public long getLastModified(String configName) {
        String configFileName = getConfigFilename(configName);
        File configFile = new File(configFileName);
        if ((configFile.exists()) && (configFile.canRead())) {
            return configFile.lastModified();
        }
        return -1L;
    }

    private String getConfigFilename(String configName) {
        return DEFAULT_CONFIG_DIR + configName + ".xml";
    }

}
