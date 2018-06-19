package com.ford.custException;

import java.util.Map;

import net.sf.json.JSONObject;
/**
 * 版权所有：重庆长安车联科技有限公司 创建日期: 2018年4月8日 下午11:25:44 创建作者：tanv 类名称 ：ResultEnum.java 版
 * 本：1.0 功 能：ResultEnum 最后修改： 修改记录：
 */
public class ResultUtils {
	private static final String SUCCESS_MSG = "成功";

	/**
	 * http回调成功
	 * 
	 * @param object
	 * @return
	 */
	public static JSONObject success(Map<String, Object> object) {
		Result result = new Result();
		result.setSuccess(true);
		result.setMsg(SUCCESS_MSG);
		result.setValue(object);
		JSONObject rs = JSONObject.fromObject(result);
		return rs;
	}

	/**
	 * 无object返回
	 * 
	 * @return
	 */
	public static JSONObject success() {
		return success(null);
	}

	/**
	 * http回调错误
	 * 
	 * @param code
	 * @param msg
	 * @return
	 */
	public static JSONObject error(Integer code, String msg) {
		Result result = new Result();
		result.setSuccess(false);
		result.setMsg(msg);
		JSONObject rs = JSONObject.fromObject(result);
		return rs;
	}
}
