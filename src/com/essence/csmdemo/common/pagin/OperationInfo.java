package com.essence.csmdemo.common.pagin;

public class OperationInfo
{
	
	protected int operationType;
	
	protected String businessCode;
	
	protected boolean businessOpResult;

	public String getBusinessCode()
	{
		return businessCode;
	}

	public void setBusinessCode(String businessCode)
	{
		this.businessCode = businessCode;
	}

	public boolean isBusinessOpResult()
	{
		return businessOpResult;
	}

	public void setBusinessOpResult(boolean businessOpResult)
	{
		this.businessOpResult = businessOpResult;
	}

	public int getOperationType()
	{
		return operationType;
	}

	public void setOperationType(int operationType)
	{
		this.operationType = operationType;
	}
}
