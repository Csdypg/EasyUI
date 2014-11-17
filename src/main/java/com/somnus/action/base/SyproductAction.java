package com.somnus.action.base;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;

import com.somnus.action.BaseAction;
import com.somnus.model.base.SessionInfo;
import com.somnus.model.base.Syorganization;
import com.somnus.model.base.Syproduct;
import com.somnus.model.base.Syrole;
import com.somnus.model.base.Syuser;
import com.somnus.model.easyui.Grid;
import com.somnus.model.easyui.Json;
import com.somnus.service.base.SyproductServiceI;
import com.somnus.service.base.SyuserServiceI;
import com.somnus.util.base.BeanUtils;
import com.somnus.util.base.ConfigUtil;
import com.somnus.util.base.HqlFilter;
import com.somnus.util.base.IpUtil;
import com.somnus.util.base.MD5Util;

/**
 * 用户
 * 
 * action访问地址是/base/syuser.action
 * 
 * @author 孙宇
 * 
 */
@Namespace("/base")
@Action
public class SyproductAction extends BaseAction<Syproduct> {

	/**
	 * 注入业务逻辑，使当前action调用service.xxx的时候，直接是调用基础业务逻辑
	 * 
	 * 如果想调用自己特有的服务方法时，请使用((TServiceI) service).methodName()这种形式强转类型调用
	 * 
	 * @param service
	 */
	@Autowired
	public void setService(SyproductServiceI service) {
		this.service = service;
	}

	

}
