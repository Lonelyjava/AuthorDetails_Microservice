package com.lib.author.demo.response;

public class ApiResponse {

	private String responseMessage;
	private int responseCode;
	private boolean responseError;
	private Object data;

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public boolean isResponseError() {
		return responseError;
	}

	public void setResponseError(boolean responseError) {
		this.responseError = responseError;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
