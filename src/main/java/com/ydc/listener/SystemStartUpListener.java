package com.ydc.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.ydc.util.Const;

/**
 * 系统启动监听器
 *
 */
public class SystemStartUpListener implements ServletContextListener {
	
    public SystemStartUpListener() {
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	
    }

	/**
     * 将上下文路径存放到Application域
     */
    public void contextInitialized(ServletContextEvent sce)  {
    	ServletContext application = sce.getServletContext();
    	String contextPath = application.getContextPath();
    	application.setAttribute(Const.APP_PATH, contextPath);
    }
	
}
