package com.web.start;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.web.util.GlobalConstants;

/**
 * 項目啓動配置文件初始化
 * 
 * @author zhenyang.he
 *
 *         DATE : 2017-10-31
 */
public class InterfaceUrlInti {
	public synchronized static void init() {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		Properties props = new Properties();
		if (GlobalConstants.interfaceUrlProperties == null) {
			GlobalConstants.interfaceUrlProperties = new Properties();
		}
		InputStream in = null;
		try {
			in = cl.getResourceAsStream("interface_url.properties");
			props.load(in);
			for (Object key : props.keySet()) {
				GlobalConstants.interfaceUrlProperties.put(key, props.get(key));
			}

			props = new Properties();
			in = cl.getResourceAsStream("wechat.properties");
			props.load(in);
			for (Object key : props.keySet()) {
				GlobalConstants.interfaceUrlProperties.put(key, props.get(key));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return;
	}
}
