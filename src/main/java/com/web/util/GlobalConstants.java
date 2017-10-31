package com.web.util;

import java.util.Properties;

import com.web.start.InterfaceUrlInti;

public class GlobalConstants {

	public static Properties interfaceUrlProperties;
	static {
        if (GlobalConstants.interfaceUrlProperties == null) {
            InterfaceUrlInti.init();
        }
    }
	/**
	 * 
	 * @param key
	 * @return
	 * @author zhenyang.he
	 * DATE 2017-10-31
	 * 
	 */
	public static String getString(String key) {
        String Properties = (String) interfaceUrlProperties.get(key);
        return Properties == null ? null : Properties;
    }
 
    public static Integer getInt(String key) {
        String Properties = (String) interfaceUrlProperties.get(key);
        return Properties == null ? null : Integer.parseInt(Properties);
    }
 
    public static Boolean getBoolean(String key) {
        String Properties = (String) interfaceUrlProperties.get(key);
        return Properties == null ? null : Boolean.valueOf(Properties);
    }
 
    public static Long getLong(String key) {
        String Properties = (String) interfaceUrlProperties.get(key);
        return Properties == null ? null : Long.valueOf(Properties);
    }
}
