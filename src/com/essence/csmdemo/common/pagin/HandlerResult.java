package com.essence.csmdemo.common.pagin;


import java.io.Serializable;


public class HandlerResult implements Serializable
{
	
	private static final long serialVersionUID = 1L;

	ResultState resultState;
	
	protected Object resultObj;
	
	protected PageVO pageVO;
	
	protected ClientCallbackInfo clientCallbackInfo;
	
	public ResultState getResultState() {
		return resultState;
	}

	public void setResultState(ResultState resultState) {
		this.resultState = resultState;
	}

	public HandlerResult(){}



	public PageVO getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO pageVO) {
		this.pageVO = pageVO;
	}

	public Object getResultObj() {
		return resultObj;
	}

	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}


}
