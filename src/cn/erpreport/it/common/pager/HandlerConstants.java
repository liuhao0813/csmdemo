package cn.erpreport.it.common.pager;


public interface HandlerConstants 
{
	String S_OK = "1";
	
	String S_FAIL = "0";
	
	String S_NOT_FOUND = "-1";
	
	String S_PASSWORD_ERROR = "-3";
	String S_PASSWORD_ERROR2 = "-30";//
	
	String S_LOCK = "-4";
	
	String S_USER_LOCK = "-8";
	
	String S_USER_IS_NOT_EXITST = "-5";
	
	int GROUP_OVERTIME = 5;
	
	String S_USER_IS_CLOSED = "-7";
	
	String S_ECP_ERROR = "-6";
	
	public static interface OP_INFO
	{
		int OP_TYPE_NON_BUSINESS = 0;
		
		int OP_TYPE_BUSINESS_DEAL = 1;
		
		int OP_TYPE_BUSINESS_QUERY = 2;
		
		boolean BUSINESS_OP_SUCC = true;
		
		boolean BUSINESS_OP_FAIL = false;
	}
	
	public static interface CALLBACK_INFO
	{
		int CALLBACK_TYPE_NO_CALLBACK = 0;
		
		int CALLBACK_TYPE_OPEN_URL = 1;
	}
	
	public static interface OPER_TYPE
	{
		String OPER_TYPE_LOGIN = "0";
		
		String OPER_TYPE_QUERY = "1";
		 
		String OPER_TYPE_OPEN = "2";
		
		String OPER_TYPE_CLOSE = "3";
		
		String OPER_TYPE_CHANGE = "4";
		
		String OPER_TYPE_OTHER	= "5";
	}
}
