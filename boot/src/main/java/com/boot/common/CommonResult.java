package com.boot.common;

public class CommonResult {
	private Integer code;
	private String message;
	private  Object item;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	public static CommonResult success(Object item, String message){
		return new CommonResult(CommonConst.SUCCESS_CODE,message,item);
	}
	public static CommonResult fail(String message){
		return new CommonResult(CommonConst.FALED_CODE, message, null);
	}
	private CommonResult(Integer code, String message, Object item) {
		super();
		this.code = code;
		this.message = message;
		this.item = item;
	}
}
