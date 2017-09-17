package com.common.util;


import com.google.gson.Gson;

public class ResultHelper {
	/**
	 * body正文数据
	 */
	private Object data;

	/**
	 * code 状态码
	 */
	private String code;

	/**
	 * 消息头
	 */
	private String message;
	/**
	 * 分页总条数
	 */
	private int totalCnt;
	/**
	 * 分页每页条数
	 */
	private int pageSize;
	/**
	 * 分页当前页
	 */
	private int pageNo;

	public void setCode(String code) {
		this.code = code;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

	public ResultHelper() {

	}

	public ResultHelper(String code, String message) {
		this.message = message;
		this.code = code;
	}

	public ResultHelper(String code, String message, Object object) {
		this.message = message;
		this.code = code;
		this.data = object;
	}

	public ResultHelper(String code, String message, Object object, int totalCnt) {
		this.message = message;
		this.code = code;
		this.data = object;
		this.totalCnt = totalCnt;
	}
	
	public ResultHelper(String code, String message, Object object, int totalCnt, int pageNo, int pageSize) {
		this.message = message;
		this.code = code;
		this.data = object;
		this.totalCnt = totalCnt;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}
	
	public String toString(){
		Gson gson = new Gson();
		String dataJson = gson.toJson(this);
		
		return dataJson;
	}
	
	
}
