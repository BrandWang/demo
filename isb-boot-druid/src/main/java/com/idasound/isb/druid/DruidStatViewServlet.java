package com.idasound.isb.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = "/druid/*", 
initParams={
       /* @WebInitParam(name="loginUsername",value="wangH"),// 用户名
        @WebInitParam(name="loginPassword",value="rj090123"),// 密码
*/        @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
})
public class DruidStatViewServlet extends StatViewServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1301341804306729044L;

		
}
