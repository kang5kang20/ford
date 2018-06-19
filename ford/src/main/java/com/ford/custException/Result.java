package com.ford.custException;

import java.util.Map;

/**
 * 版权所有：重庆长安车联科技有限公司
 * 创建日期: 2018年4月8日 下午11:24:10
 * 创建作者：tanv
 * 类名称 ：ResultEnum.java
 * 版 本：1.0
 * 功 能：ResultEnum
 * 最后修改：
 * 修改记录：
 */
public class Result<T> {
	private String msg="";
	private boolean success;
	private Map<String,Object> value ;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Map<String, Object> getValue() {
		return value;
	}
	public void setValue(Map<String, Object> value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ResponeToWeb [msg=" + msg + ", success=" + success + ", value="
				+ value + "]";
	}
}
