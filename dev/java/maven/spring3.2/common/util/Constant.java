package com.common.util;

import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 通用常量数据
 * 
 * @author uyues-wangj   
 *
 */
public class Constant {

	private Constant() {

	}
     
	/*** 成功*/
	public static final int success_code = 0;
	/** 失败*/
	public static final int failed_code = -1;
	
	/*** app平台号1*/
	public static int app  = 1;
	/**
	 * pc 2
	 */
	public static int pc = 2;
	/****************************************common接口常量  8*********************************************************/
	public static final String APPLICATION_NAME = "OIEWP对外投资预警平台";
	public static final String BADREQUEST_ILLEGAL = "Bad Request,This is an illegal request! ";
	public static final String BADREQUEST_ILLEGAL_CODE = "800302";
	public static final String REQUEST_SUCCESS_UNKNOWN_RESULTS = "1、请求成功，处理结果未知";
	
	public static final String GUESTER_STATUS_IS_EMPTY = "留言状态不能为空";
	public static final String GUESTER_STATUS_IS_EMPTY_CODE = "800303";
	public static final String GUESTER_CONTENT_IS_EMPTY = "留言内容不能为空";
	public static final String GUESTER_CONTENT_IS_EMPTY_CODE = "800304";
	public static final String GUESTER_EMAIL_IS_EMPTY = "留言者邮箱不能为空";
	public static final String GUESTER_EMAIL_IS_EMPTY_CODE = "800305";
	public static final String GUESTER_NAME_IS_EMPTY = "留言者姓名不能为空";
	public static final String GUESTER_NAME_IS_EMPTY_CODE = "800306";
	
	public static final String GUESTER_ID_IS_EMPTY = "留言编号不能为空";
	public static final String GUESTER_ID_IS_EMPTY_CODE = "800307";
	
	
	public static final String SAVE_GUEST_SUCCESS = "保存留言成功";
	public static final String SAVE_GUEST_SUCCESS_CODE = "800208";
	public static final String DELETE_GUEST_SUCCESS_CODE = "800207";
	public static final String DELETE_GUEST_SUCCESS = "删除留言成功";
	public static final String UPDATE_GUEST_SUCCESS_CODE = "800206";
	public static final String UPDATE_GUEST_SUCCESS = "更新留言成功";
	public static final String FIND_GUEST_SUCCESS_CODE = "800205";
	public static final String FIND_GUEST_SUCCESS = "检索留言成功";
	public static final String FIND_MANY_GUEST_SUCCESS_CODE = "800204";
	public static final String FIND_MANY_GUEST_SUCCESS = "多留言查找成功";
	public static final String FIND_ONE_GUEST_SUCCESS_CODE = "800203";
	public static final String FIND_ONE_GUEST_SUCCESS = "单一留言查找成功";
	
	public static final Object RECHARGE = "充值";
	public static final Object PAYMENT = "支付";
	
	public static String ACCEPT_CHARGE_SUCCESS = "接受chargeEvent成功";
	public static String ACCEPT_CHARGE_SUCCESS_CODE = "800202";
	
	

	
	
	public static final String DISABLE="该接口已经废弃，过时了";
	public static final String USERNONE="session中用户不存在";
	public static final String USER_IS_NULL="该用户不存在";
	public static final String USER_IS_EXIST="用户可以报名参加比赛";
	public static final String UYUESKEY = "UUID_KEY";
	public static final String UYUESPWD = "UYUESPWD";
	public static final String SUCCESS="操作成功";
	public static final String EMAIL_MODIFY_SUCCESS="修改邮箱操作成功";
	public static final String PASSWD_MODIFY_SUCCESS="修改密码操作成功";
	public static final String SYSSUCCESS="系统操作成功";
	public static final String FILENOTFOUND = "文件不存在";
	public static final String FILE_NOT_FOND_CODE = "-1";
	
	public static final String UPLOAD_FILE_SUCCESS = "文件上传成功";
	public static final String UPLOAD_FILE_SUCCESS_CODE = "800201";
	public static final String UPLOAD_FILE_FAILURE = "ftp上传文件失败";
	public static final String UPLOAD_FILE_FAILURE_CODE = "800401";
	
	public static final String MESSAGE_SENDED_FAILTRUE = "短信发送失败";
	public static final String MESSAGE_SENDED_FAILTRUE_CODE = "800301";
	
	public static final String MESSAGE_SENDED_SUCCESS = "短信发送成功";
	public static final String MESSAGE_SENDED_SUCCESS_CODE = "800202";
	
	public static final String DOWNLOAD_FILE_SUCCESS = "文件下载成功";
	public static final String IDNOTFOUND = "用户ID为空";
	public static final String FILESIZETOBIG = "文件太大";
	public static final String FILETYPEERR = "文件类型错误";
	public static final String VALIDATIONFAILED="验证失败";
	public static final String NEWPHONE_NOT_FOUND="未填写新的手机号码";
	public static final SerializerFeature[] serializerFeatures = { SerializerFeature.QuoteFieldNames,
			SerializerFeature.WriteNullNumberAsZero, SerializerFeature.WriteDateUseDateFormat,
			SerializerFeature.WriteNullListAsEmpty, SerializerFeature.WriteNullStringAsEmpty,
			SerializerFeature.WriteNullBooleanAsFalse, SerializerFeature.SkipTransientField ,SerializerFeature.DisableCircularReferenceDetect};
	public static final String USER_SIGNUP_FAILED = "用户报名信息更新失败";
	public static final String UNAVAILABLE_DATA_FOUND = "未找到有效的数据";
	public static final String NEWEAMIL_NOT_FOUND = "未填写新的邮箱地址";
	public static final String LOCATION_IS_LOCK = "区域初始化已经被锁定了";
	
	/****************************************快递接口常量 7*********************************************************/
	
	public static final String KUAIDI100API = "http://api.kuaidi100.com/api?id=PARAM1&com=PARAM2&nu=PARAM3&show=PARAM4&muti=PARAM5&order=PARAM6";
	//快递100的key
	public static final CharSequence KUAIDI100KEY = "be0a403f9e36dc1d";
	//是否显示json 0 表示json
	public static final Integer KUAIDI100SHOW = 0;//0|1|2|3
	//是否显示全部内容  1全部， 0一行
	public static final Integer KUAIDI100MUTI = 1;//0|1
	//是否按照时间的新旧顺序排序 desc 降序
	public static final CharSequence KUAIDI100DESC = "desc";//desc|asc
	public static final String KUAIDI_MESSAGE_NOTFOUND = "没有找到物流信息，请稍后再试";
	

	/****************************************用户管理常量  4*********************************************************/
	
	public static final String LOGIN_SUCCESS = "用户登录成功";
	public static final String LOGIN_FAILURE = "用户登录失败，用户名或密码错误"; 
	public static final String LOGIN_FAILURE_CODE = "";
	
	public static final String LOGIN_OFF_CODE=null;

	public static final int ONE=1;//用户 被禁用 值为1
	public static final int TWO=2;
	public static final int THREE=3;
	
	public static final String  PHONEEXIST= "用户已注册";
	public static final String  PHONEEXIST_CODE= "400301";
	
	public static final String USER_ACTION_FAILED_CODE = "400303";
	public static final String USER_ACTION_FAILED = "操作用户失败";
	
	public static final String CODEERROR="验证码无效";
	public static final String CODEERROR_CODE="400302";
	
	public static final String SIGN="我想要的生活";
	public static final String PORTRAIT="/oiewp/1.jpg";
	
	public static final String LOGIN="已登录";
	
	
	public static final String LOGINERROR="用户名或密码错误";
	public static final String FORBIDDEN="账号已被禁用";
	public static final String FAIL="操作失败";
	public static final String PHONENOTEXIT="此号码尚未注册";
	public static final String PHONENONE="请输入手机号码";
	public static final String PASSWDNONE="请输入密码";
	public static final String PLATFORMCODENONE="请输入平台号";
	public static final String VALIDATECODENONE="请输入验证码";
	public static final String AESFAILE="加密异常";
	public static final String FILENONE="请选择要上传的文件";
	public static final String EMAILNONE="请输入邮箱号码";
	public static final String EMAILNOTFOUND="邮箱号码没有找到";
	public static final String USERID="请输入用户编号";
	public static final String OldPasswd="旧密码不正确";
	
	public static final String UPLOAD_FILE_EMPTY = "上传文件为空";
	public static final String UPLOAD_FILE_EMPTY_CODE = "400301";
	
	
	
	public static final String SMTPHOST="smtp.126.com";
	public static final String EMAIL_FROM="mrmaker@126.com";
	public static final String EMAIL_PASSWORD="mrmaker2015";
	public static final String EMAIL_RESET_TITLE="[创客先生]密码重置邮件--reset password by email for mrmaker!";
	
	//百度天气预报的接口api
	public static final String WEATHER_HTTP_URL = "http://apis.baidu.com/heweather/weather/free";
	public static final String BAIDU_APIKKEY = "8b29303afda0f1a47dbd0a38221a01c0";
	public static final String DEFAULT_CITY = "无锡";
	public static final Object WEATHER_COND_ICON = "http://files.heweather.com/cond_icon/";// 最后一个/一定要有
	
	/****************************操作日志管理常量 5 *************************************/
	
	public static final String FIND_ALLNOTE_SUCCESS = "查找所有的操作日志成功";
	
	public static String WECHAT_SUCCESS_CODE = "500201";
	public static String WECHAT_SUCCESS = "微信用户操作成功";
	public static String WECHAT_ID_IS_EMPTY_CODE = "500300";
	public static String WECHAT_ID_IS_EMPTY = "微信用户id不能为空";
	public static String WECHAT_CONTENT_IS_EMPTY="发送的内容不能为空";
	public static String WECHAT_CONTENT_EMPTY_CODE="500301";
	public static String WECHAT_COUNT_IS_EMPTY="小组人员数量不能为空";
	public static String WECHAT_COUNT_EMPTY_CODE="500302";
	public static String WECHAT_FILE_CODE="500302";
	public static String WECHAT_FILE="操作失败";
	public static String APPID ="wx5eae41b78bb1ef39";
	public static String APPKEY="bd753ae86f7c6d30a7b47b5116cafcc7";
	
	/****************************初始化省系统常量 6*************************************/
	public static final String INIT_ENTERPRISE_ERROR_CODE="600301";
	public static final String INIT_ENTERPRISE_ERROR = "初始化企业信息失败，该操作已经被锁定";
	
	public static final String INIT_ENTERPRISE_OK_CODE = "600204";
	public static final String INIT_ENTERPRISE_OK = "初始化企业信息成功";
	
	
	public static final String ADD_ENTERPRISE_OK_CODE = "600201";
	public static final String ADD_ENTERPRISE_OK = "添加一个企业信息成功";
	
	public static final String DELETE_ENTERPRISE_OK_CODE = "600202";
	public static final String DELETE_ENTERPRISE_OK = "删除一个企业信息成功";
	
	public static final String GET_ENTERPRISE_OK_CODE = "600203";
	public static final String GET_ENTERPRISE_OK = "获取企业信息成功";
	
	public static final String INIT_PROJECT_ERROR_CODE="600302";
	public static final String INIT_PROJECT_ERROR = "初始化项目信息失败，该操作已经被锁定";
	
	public static final String INIT_PROJECT_OK_CODE = "600205";
	public static final String INIT_PROJECT_OK = "初始化项目信息成功";
	
	/****************************临时常量 8*************************************/
	
	public static final String VALIDATE_PHONE_EMPTY = "手机号码为空";
	public static final String VALIDATE_PHONE_EMPTY_CODE = "800408";
	public static final String VALIDATE_PLATEFORM_EMPTY = "平台号为空";
	public static final String VALIDATE_PLATEFORM_EMPTY_CODE = "800409";
	public static final String VALIDATE_TYPE_EMPTY = "验证类型为空";
	public static final String VALIDATE_TYPE_EMPTY_CODE = "800410";
	public static final String VALIDATE_CODE_EMPTY = "验证码为空";
	public static final String VALIDATE_CODE_EMPTY_CODE = "800411";
	public static final String DISABLE_CODE = "800412";
	

	/**
	 * 验证码类型
	 */

	/**
	 * 注册获取验证码
	 */
	public static final int type_1 = 1;
	/**
	 * 忘记密码获取验证码
	 */
	public static final int type_2 = 2;
	/**
	 * 充值
	 */
	public static final int type_3 = 3;
	/**
	 * 提现
	 */
	public static final int type_5 = 5;
	/**
	 * 转账
	 */
	public static final int type_8 = 8;
	/**
	 * 手机平台
	 */
	public static final int platform_1 = 1;
	/**
	 * 电商平台
	 */
	public static final int platform_2 = 2;

	public static final int platform_3 = 3;

	public static final int platform_4 = 4;
	/**
	 * 平台
	 */
	/**
	 * 注册发送验证码
	 */
	
	public static final String paramUnvalidate = "参数不对";
	public static final String phoneUnvalidate = "手机号码格式不对";
	public static final String typeUnvalidate = "类型不存在";
	public static final String platformUnvalidate = "平台号不存在";
	public static final String success_message = "获取验证码成功";
	public static final String message = "对不起，请一分钟后再获取验证码";
	public static final String max_count = "对不起，已超过发送短信条数";
	public static final String faile_message = "请检查手机号格式";
	public static final String phone_exist = "该号码已经注册";
	public static final String phone_not_exist = "该号码尚未注册";
	public static final String type_not_exist = "验证码类型不存在";
	public static final String contents = "您的操作验证码为";
//	public static final String phone_none = "该用户不存在";
	public static final String phone_none = "手机号不能为空";
	public static final String paramUnvalidate_code="800413";
	public static final String phoneUnvalidate_code="800414";
	public static final String typeUnvalidate_code="800415";
	public static final String platformUnvalidate_code="800416";
	public static final String VALIDATE_FAILE_CODE = "800417";
	public static final String ValidateCodeExists_CODE = "800418";
	
	public static final String ACTIONNOTE_ID_IS_EMPTY = "操作日志的编号不能为空";
	public static final String PARAM_NOT_INVALID = "输入的参数不正确";
	public static final String PARAM_NOT_INVALID_CODE = "800419";
	public static final String ACTIONNOTE_ID_IS_EMPTY_CODE = "800419";
	
	
	public static final String LINK_NAME_IS_EMPTY = "链接名称不能为空";
	public static final String LINK_NAME_IS_EMPTY_CODE = "800420";
	public static final String FIIND_NOTE_SUCCESS_CODE = "800210";
	public static final String DELETE_NOTES_SUCCESS_CODE = "800211";
	public static final String DELETE_NOTES_SUCCESS = "清除操作日志成功";
	public static final String DELETE_NOTE_SUCCESS_CODE = "800212";
	public static final String ADD_NOTE_SUCCESS_CODE = "800213";
	public static final String ADD_NOTE_SUCCESS = "添加操作日志成功";
	
	/***************************5*********************************/
	public static final String COMPLANY_ACTION_SUCCESS_CODE = "500200";
	public static final String COMPLANY_ACTION_SUCCESS = "读取企业成功";
	
	public static final String ADD_PROJECT_OK_CODE = null;
	public static final String DELETE_PROJECT_OK_CODE = null;
	public static final String GET_PROJECT_OK_CODE = null;
	public static final String ADD_PROJECT_OK = null;
	public static final String DELETE_PROJECT_OK = null;
	public static final String GET_PROJECT_OK = null;
	
	/***************************11********************************/

	public static final String ARTICLE_SUBMIT_IS_EMPTY = "参数文章简介不能为空";
	public static final String ARTICLE_CONSTANT_IS_EMPTY = "参数文章内容不能为空";
	public static final String ARTICLE_AUTHOR_IS_EMPTY = "参数文章作者不能为空";
	public static final String ARTICLE_TITLE_IS_EMPTY = "参数文章标题不能为空";
	public static final String ARTICLE_TITLE_IS_EMPTY_CODE = "800420";
	public static final String ARTICLE_AUTHOR_IS_EMPTY_CODE = "800421";
	public static final String ARTICLE_CONSTANT_IS_EMPTY_CODE = "800422";
	public static final String ARTICLE_SUBMIT_IS_EMPTY_CODE = "800423";
	public static final String ARTICLE_ID_IS_EMPTY = "参数文章编号不能为空";
	public static final String ARTICLE_ID_IS_EMPTY_CODE = "800424";
	public static final String ARTICLE_TERMID_IS_EMPTY = "文章分类编号不能为空";
	public static final String ARTICLE_TERMID_IS_EMPTY_CODE = "110205";
	public static final String FIND_ONE_ARTICLE_SUCCESS_CODE = "110204";
	public static final String FIND_ONE_ARTICLE_SUCCESS = "读取文章成功";
	public static final String ADD_ARTICLE_SUCCESS_CODE = "110202";
	public static final String ADD_ARTICLE_SUCCESS = "添加文章成功";
	public static final String DELETE_ARTICLE_SUCCESS_CODE = "110203";
	public static final String DELETE_ARTICLE_SUCCESS = "删除文章信息成功";
	public static final String UPDATE_ARTICLE_SUCCESS_CODE = "110201";
	public static final String UPDATE_ARTICLE_FAIL_CODE = "110210";
	public static final String UPDATE_ARTICLE_FAIL_MESSAGE = "更新文章信息失败";
	public static final String UPDATE_ARTICLE_SUCCESS = "更新文章信息成功";

	public static final String FIND_ARTICLE_SUCCESS_CODE = "110200";

	public static final String FIND_ARTICLE_SUCCESS = "读取文章成功";
	public static final String FIND_ARTICLE_WITH_TERM_SUCCESS = "分类下的文章读取成功";
	
	
	/************************************数据库备份********************************************/
	public static final String DATABASE_BACKUP_TEST_CODE = null;
	public static final String DATABASE_BACKUP_TEST_SUCCESS = "数据库备份测试成功";

	public static final String DATABASE_RECOVERY_NAME_IS_EMPTY = "还原的数据库名不能为空";
	public static final String DATABASE_BACKUPNAME_IS_EMPTY = "备份的数据库名不能为空";
	public static final String DATABASE_LOGIN_PASSWORD_IS_EMPTY = "登录密码不能为空";
	public static final String DATABASE_ACCOUNT_IS_EMPTY = "数据库账号不能为空";
	public static final String DATABASE_ACCOUNT_IS_EMPTY_CODE = null;
	public static final String DATABASE_LOGIN_PASSWORD_IS_EMPTY_CODE = null;
	public static final String DATABASE_BACKUPNAME_IS_EMPTY_CODE = null;
	public static final String DATABASE_RECOVERY_NAME_IS_EMPTY_CODE = null;
	public static final String DATABASE_BACKUP_CODE = null;
	public static final String DATABASE_BACKUP_SUCCCESS = null;
	public static final String DATABASE_BACKUP_LOCALHOST_CODE = null;
	public static final String DATABASE_BACKUP_LOCALHOST_SUCCCESS = null;
	public static final String DATABASE_RECOVERY_CODE = null;
	public static final String DATABASE_RECOVERY_SUCCESS = null;
	
	/************************************数据库备份********************************************/
	
	public static final String CATEGORY_ID_IS_EMPTY = "分类编号不能为空";
	public static final String CATEGORY_ID_IS_EMPTY_CODE = null;
	public static final String CATEGORY_STATUS_IS_EMPTY = "状态不能为空";
	public static final String CATEGORY_DESCRIPTION_IS_EMPTY = "描述不能为空";
	public static final String CATEGORY_PARENT_ID_IS_EMPTY = "参数父类id不能为空";
	public static final String CATEGORY_NAME_IS_EMPTY = "参数分类名称不能为空";
	public static final String CATEGORY_STATUS_IS_EMPTY_CODE = "";
	public static final String CATEGORY_DESCRIPTION_IS_EMPTY_CODE = "";
	public static final String CATEGORY_PARENT_ID_IS_EMPTY_CODE = "";
	public static final String CATEGORY_NAME_IS_EMPTY_CODE = "";

	public static final String CATEGORY_ACTION_SUCCESS_CODE="120200";
	public static final String FIND_CATEGORYS_SUCCESS = "读取文章分类成功";
	public static final String CATEGORY_ACTION_FAILD_CODE="120400";
	public static final String CATEGORY_ACTION_FAILD = "读取文章分类失败";

	

	

	public static final String FIND_CATEGORY_SUCCESS_WITH_PARENTID = null;
	public static final String FIND_CATEGORY_SUCCESS_WITH_NAME = null;
	public static final String FIND_CATEGORY_SUCCESS_WITH_ID = null;
	public static final String FIND_CATEGORY_SUCCESS = null;
	public static final String UPDATE_CATEGORY_SUCCESS = null;
	public static final String DELETE_CATEGORYS_SUCCESS = null;
	public static final String DELETE_CATEGORY_SUCCESS = null;
	public static final String ADD_CATEGORY_SUCCESS = null;
	
	
	/****************************************企业和公司管理*************************************************/
	public static final String COMPANY_NAME_EN_IS_EMPTY = "公司英文名称不能为空";
	public static final String PROJECT_ID_IS_EMPTY = "项目编号不能为空";
	public static final String LATEST_TWO_RECODES_REMIND = "至少勾选一条以上的记录";
	public static final String COMMPANY_INNER_LOAN_IS_EMPTY = "境内银行贷款不能为空";
	public static final String COMPANY_ADDRESS_IS_EMPTY = "公司的地址不能为空";
	public static final String COMPANY_ID_IS_EMPTY = "公司的id不能为空";
	public static final String COMPANY_ID_IS_EMPTY_CODE = null;
	public static final String COMPANY_ADDRESS_IS_EMPTY_CODE = null;
	public static final String COMMPANY_INNER_LOAN_IS_EMPTY_CODE = null;
	public static final String LATEST_TWO_RECODES_REMIND_CODE = "900420";
	public static final String PROJECT_ID_IS_EMPTY_CODE = null;
	public static final String COMPANY_NAME_EN_IS_EMPTY_CODE = null;
	
	/**********************************************大使馆****************************************************/
	public static final String EMBASSIES_FIELD_IS_EMPTY = "州名不能为空";
	public static final String EMBASSIES_ID_IS_EMPTY = "大使馆编号不能为空";
	public static final String EMBASSIES_ID_IS_EMPTY_CODE = null;
	public static final String EMBASSIES_FIELD_IS_EMPTY_CODE = null;
	
	
	
	/********************************文件管理**********************************/
	public static final String FILE_ID_IS_EMPTY = "参数文件编号不能为空";
	public static final String FILE_IS_NOT_FOUNDED = "上传文件为空";
	public static final String FILE_PUBLISH_STATUS_IS_EMPTY = "文件发布状态不能为空";
	public static final String FILE_DESCRPTION_IS_EMPTY = "文件描述不能为空";
	public static final String FILE_NAME_IS_EMPTY = "参数文件名称不能为空";
	public static final String FILE_NAME_IS_EMPTY_CODE = null;
	public static final String FILE_DESCRPTION_IS_EMPTY_CODE = null;
	public static final String FILE_PUBLISH_STATUS_IS_EMPTY_CODE = null;
	public static final String FILE_ID_IS_EMPTY_CODE = null;
	public static final String FILE_IS_NOT_FOUNDED_CODE = null;
	
	
	//***********************************************************************/
	public static final String GOV_TEAM_ID_IS_EMPTY = "政府组织/驻外团编号不能为空";
	public static final String GOV_TEAM_ID_IS_EMPTY_CODE = "";
	public static final String GOV_ORG_ID_IS_EMPTY = "政府组织机构编号不能为空";
	public static final String GOV_ORG_ID_IS_EMPTY_CODE = "";
	public static final String GOV_ORG_FAILURE_CODE = null;
	public static final String GOV_ORG_NOS_IS_EMPTY = "多机构组织或政府部门编号不能为空";
	public static final String GOVORG_ACTION_SUCCESS_CODE = "";
	public static final String GOV_DELETE_ALL_SUCCESS = "删除多个政府组织部门成功";
	public static final String GOV_DELETE_SUCCESS = "删除政府组织部门成功";
	public static final String GOV_SEARCH_SUCCESS = "搜索政府组织部门成功";
	
	//***********************************************************************/
	public static final String PRODUCT_ID_IS_EMPTY = "产品编号不能为空";
	public static final String PRODUCT_ID_IS_EMPTY_CODE = "9000001";
	public static final String PRODUCT_LAWACTION_SUCCESS_CODE = "200201";
	public static final String PRODUCT_LAWACTION_SUCCESS = "商品操作成功";
	
	/***********************************帮助中心*************************************/
	public static final String HELP_ID_IS_EMPTY = "请输入帮助分类id";
	public static final String HELP_DESCRIPTION_IS_EMPTY = "请输入分类标题描述";
	public static final String HELP_TITLE_IS_EMPTY = "请输入帮助分类名称";
	public static final String HELP_ID_IS_EMPTY_CODE = "";
	public static final String HELP_DESCRIPTION_IS_EMPTY_CODE = "";
	public static final String HELP_TITLE_IS_EMPTY_CODE = "";
	public static final String HELP_INFO_ID_IS_EMPTY = "请输入帮助信息id";
	public static final String HELP_INFO_ANSWER_IS_EMPTY = "请输入帮助答案";
	public static final String HELP_INFO_TITLE_IS_EMPTY = "请输入帮助问题";
	public static final String HELP_CATEGORY_ID_IS_EMPTY = "请输入帮助分类";
	public static final String HELP_INFO_ID_IS_EMPTY_CODE = "";
	public static final String HELP_INFO_ANSWER_IS_EMPTY_CODE = "";
	public static final String HELP_INFO_TITLE_IS_EMPTY_CODE = "";
	public static final String HELP_CATEGORY_ID_IS_EMPTY_CODE = "";
	
	
	
	
	/**********************************用户常量2***************************************/
	public static final String USER_AVATAR_IS_EMPTY = "用户名头贴不能为空";
	public static final String USER_UUID_IS_EMPTY = "用户的UUID不能为空";
	public static final String USER_MOBILE_IS_EMPTY = "用户手机不能为空";
	public static final String USER_USER_TYPE_IS_EMPTY = "用户类型不能为空";
	public static final String USER_EMAIL_IS_EMPTY = "用户email不能为空";
	public static final String USER_WEBSITE_IS_EMPTY = "用户网站不能为空";
	public static final String USER_STATUS_IS_EMPTY = "用户状态不能为空";
	public static final String USER_PHONE_IS_EMPTY = "手机不能为空";
	public static final String USER_USERID_IS_EMPTY = "用户的id不能为空";
	public static final String USER_LOGIN_OFF = "您已退出，欢迎您下次登录";
	public static final String USER_RELOGIN_REMIND = "您的信息已清除，请重新登录";
	public static final String PASSWORDKEY_IS_EMPTY = "passwordkey不能为空";
	public static final String VALUEKEY_IS_EMPTY = "valuekey不能为空";
	public static final String USER_PASSWORD_IS_EMPTY = "密码不能为空";
	public static final String USER_USERNAME_IS_EMPTY = "用户名不能为空";
	//用户错误部分统一的错误的代码
	public static final String USER_ACTION_SUCCESS_CODE = "400200";
	public static final String UPDATE_USER_SUCCESS = "用户更新成功";
	public static final String DELETE_USER_SUCCESS = "删除用户成功";
	public static final String DISABLE_USER_SUCCESS = "该用户已经被禁用";
	public static final String ADD_USER_SUCCESS = "添加用户成功";
	public static final String USER_PLATEFORM_IS_EMPTY = "操作平台号为空";
	
	
	/*************************************版本更新升级*******************************************/
	public static final String UPGRADE_ID_IS_EMPTY = "请填写id";
	public static final String UPGRADE_INFO_IS_EMPTY = "请填写更新内容";
	public static final String UPGRADE_VERSION_NUM_IS_EMPTY = "请填写版本号";
	public static final String UPGRADE_FAILURE_CODE = "";
	
	
	
	/***********************************国家和本地化数据19*********************************************/
	public static final String LOCAL_COUNTRY_ID_IS_EMPTY = "国家id不能为空";
	public static final String LOCAL_FIELD_NAME_IS_EMPTY = "洲名称不能为空";
	public static final String LOCAL_COUNTRY_NAME_IS_EMPTY = "国家名称不能为空";
	public static final String COUNTRY_NAME_MUST_NOT_BE_BULL = "country name  must not be bull";
	public static final String LOCATION_FAILURE_CODE="地点操作成功";
	public static final String LOCATION_ACTION_SUCCESS_CODE = "1900200";
	public static final String FIND_COUNTRY_SUCCESS = null;
	public static final String FIND_CITY_SUCCESS = null;
	public static final String INIT_LOCATION_SUCCESS = null;
	
	
	/*********************************************友情链接****************************************/
	public static final String LINK_HREF_IS_EMPTY = "链接路径不能为空";
	public static final String LINK_ID_IS_EMPTY = "链接编号不能为空";
	public static final String LINK_FAILURE_CODE="";
	
	
	/****************************************风险预警***********************************************/
	public static final String RISK_FILEDID_IS_EMPTY = "地区区域id不能为空";
	public static final String RISK_ID_IS_EMPTY = "风险资讯id不能为空";
	public static final String TERM_ID_IS_EMPTY = null;
	public static final String RISK_FAILURE_CODE="";
	public static final String RISK_REGION_ID_IS_EMPTY = "地区区域id不能为空";
	public static final String RISK_TERM_ID_IS_EMPTY = "文章类型id不能为空";
	public static final String RISK_RELEASE_FAILED = "2000400";
	
	/****************************************幻灯片设置预警***********************************************/
	
	public static final String PICTURE_BANNER_ID_IS_EMPTY = "幻灯片编号不能为空";
	public static final String PICTURE_FAILEURE_CODE = "";
	public static final String PICTURE_FILE_IS_EMPTY = "幻灯片文件不能为空";
	public static final String PICTURE_NAME_IS_EMPTY = "幻灯片名称不能为空";
	
	/**************************************************突发事件*************************************************/
	public static final String EMERGENCY_UNION_ID_IS_EMPTY = "突发事件单一编号 不能为空";
	public static final String EMERGENCY_UNION_ID_IS_EMPTY_CODE = null;
	public static final String EMERGENCY_CONTACT_PHONE_IS_EMPTY_CODE = null;
	public static final String EMERGENCY_HANDLE_GOV_IS_EMPTY_CODE = null;
	public static final String EMERGENCY_STATUS_IS_EMPTY_CODE = null;
	public static final String EMERGENCY_FROM_IS_EMPTY_CODE = null;
	public static final String EMERGENCY_ID_IS_EMPTY_CODE = null;
	public static final String LOGIN_USER_ID_IS_EMPTY_CODE = null;
	public static final String EMERGENCY_FAILURE_CODE = null;
	public static final String EMERGENCY_ACTION_SUCCESS_CODE = "120200";
	
	
	public static final String EMERGENCY_HANDLE_GOV_IS_EMPTY = "处理突发事件的全部相关政府部门编号不能为空";
	public static final String LOGIN_USER_ID_IS_EMPTY = "登录用户ID不能为空";
	public static final String EMERGENCY_STATUS_IS_EMPTY = "突发事件状态不能为空";
	public static final String EMERGENCY_FROM_IS_EMPTY = "信息来源类型不能为空";
	public static final String EMERGENCY_ID_IS_EMPTY = "ID不能为空";
	public static final String EMERGENCY_COMPANNYID_IS_EMPTY = "公司编号不能为空";
	public static final String EMERGENCY_CONTENT_IS_EMPTY = "突发事件内容不能为空";
	public static final String EMERGENCY_LOCATION_IS_EMPTY = "突发事件发生的详细地址不能为空";
	public static final String EMERGENCY_TITLE_IS_EMPTY = "突发事件发生的主题不能为空";
	public static final String EMERGENCY_CITY_IS_EMPTY = "突发事件发生的城市不能为空";
	public static final String EMERGENCY_CONTACT_NAME_IS_EMPTY = "请填写您的姓名";
	public static final String EMERGENCY_CONTACT_PHONE_IS_EMPTY = "请填写您的联系电话并检验格式是否正确";
	public static final String EMERGENCY_MAIL_IS_EMPTY = "请填写您的邮箱并检查格式是否正确";
	public static final String EMERGENCY_FIELD_IS_EMPTY = "请选择突发事件所在的洲";
	public static final String EMERGENCY_COUNTRY_IS_EMPTY = "请选择突发事件所在的国家";
	public static final String EMERGENCY_PALTEFORM_IS_EMPTY = "突发事件传递平台不能为空";
	
	
	
/**********************************安全培训******************************************/
	
	public static final String SAFETY_TRAINING_ID_IS_EMPTY = "安全培训项目的id不能为空";
	public static final String SAFETY_TRAINING_FILEURE_CODE = null;
	public static final String SAFE_COMPANY_SERIALNO_IS_EMPTY = "公司序列号不能为空";
	public static final String SAFE_NAME_IS_EMPTY = "名称不能为空";
	public static final String SAFE_TIPS_IS_EMPTY = "备注内容不能为空";
	public static final String SAFE_BUYIN_ID_IS_EMPTY = "购入须知的id不能为空";
	public static final String SAFE_WEITUO_ID_IS_EMPTY = "安保委托的id不能为空";
	public static final String SAFE_END_TIME_IS_EMPTY = "培训项目截止日期不能为空";
	public static final String SAFE_PROJECT_DESC_IS_EMPTY = "培训项目简述不能为空";
	public static final String SAFE_PHONE_IS_EMPTY = "联系电话不能为空";
	public static final String SAFE_TITLE_IS_EMPTY = "培训主题不能为空";
	public static final String SAFE_METHOD_IS_EMPTY = "培训方式不能为空";
	public static final String SAFE_PROJECT_IS_EMPTY = "培训项目不能为空";
	public static final String SAFE_CHAGER_IS_EMPTY = "负责人不能为空";
	public static final String SAFE_START_DATE_IS_EMPTY = "开始日期不能为空";
	public static final String SAFE_AUTHOR_IS_EMPTY = "安全介绍作者不能为空";
	public static final String SAFETY_TRAINNER_IS_EMPTY = "培训对象不能为空";
	public static final String SAFETY_TRAINING_CHARGERNO_IS_EMPTY = "公司负责此次培训的负责人的工号不能为空";
	public static final String SAFETY_TRAINING_NUM_IS_EMPTY = "公司参加此次培训的人数不能为空";
	public static final String SAFE_STATUS_IS_EMPTY = "培训状态不能为空";
	public static final String SAFETY_CONTENT_IS_EMPTY = "安全培训内容不能为空";

	public static final String SAFETY_PRINCIPAL_USER_ID_IS_EMPTY = "培训负责人工号不能为空";
	public static final String SAFETY_TELEPHONE_IS_EMPTY = "联系电话不能为空";
	public static final String SAFETY_WEITUO_COMPANY_IS_EMPTY = "受托单位不能为空";
	public static final String SAFETY_WEITUO_TIME_IS_EMPTY = "委托的时间期限不能为空";
	
	/***********************************************************************************/
	
	public static final String COMPANY_FIRMID_IS_EMPTY = "项目系统代码不能为空";
	public static final String COMPANY_GROUP_NO_CODE = null;
	public static final String COMPANY_TIPS_IS_EMPTY = "备注不能为空";
	public static final String COMPANY_GROUP_NUMBER_IS_EMPTY = "项目组人数不能为空";
	public static final String COMPANY_GROUP_NAME_IS_EMPTY = "项目组名称不能为空";
	public static final String COMMPANY_EMPNO_CAEER_IS_EMPTY = "职务不能为空";
	public static final String COMMPANY_EMPNO_DEPART_IS_EMPTY = "所属部门不能为空";
	public static final String COMMPANY_EMPNO_SEX_IS_EMPTY = "性别不能为空";
	public static final String COMMPANY_EMPNO_TELEPHONE_IS_EMPTY = "电话不能为空";
	public static final String COMMPANY_EMPNO_LOCATION_IS_EMPTY = "地点不能为空";
	public static final String COMMPANY_EMPNO_REMARKS_IS_EMPTY = "备注不能为空";
	public static final String COMMPANY_EMPNO_EMAIL_IS_EMPTY = "联系邮箱不能为空";
	public static final String COMMPANY_EMPNO_NAME_IS_EMPTY = "姓名不能为空";
	public static final String COMMPANY_EMPNO_IS_EMPTY = "员工编号不能为空";
	public static final String COMMPANY_USER_ID_IS_EMPTY = "登录用户ID不能为空";
	public static final String COMMPANY_NO_IS_EMPTY = "公司编号不能为空";
	public static final String COMPANY_FAILURE_CODE="";
	
	public static final String COMPANY_PERSONAL_MANAGERMENT_CODE="";
	public static final String COMMPANY_EMPNO_PHONE_IS_EMPTY = "联系方式不能为空";
	public static final String COMPANY_SERIALNO_IS_EMPTY = "公司序列化编号不能为空";
	
	/*********************************************************************************/
	
	public static final String MESSAGE_FAILURE_CODE = "300500";
	public static final String MESSAGE_SENDER_PHONE_IS_EMPTY = "发件人手机号码不能为空";
	public static final String MESSAGE_SENDER_CONTENT_IS_EMPTY = "发件的内容不能为空";
	public static final String MESSAGE_SNEDER_IS_EMPTY = "发件人不能为空";
	public static final String MESSAGE_IS_VISIBLE_IS_EMPTY = "是否彻底删除不能为空";
	public static final String MESSAGE_RECIVER_IS_EMPTY = "收件人不能为空";
	public static final String MESSAGE_ID_IS_EMPTY = "该站内信的id不能为空";
	public static final String MESSAGE_IS_DELETE = "信息是否删除不能为空";
	
	/******************************************************************************/
	public static final String NOTIFY_FAILURE_CODE = "-1";
	public static final String NOTIFY_ACTION_SUCCESS_CODE = "300200";

	public static final String NOTIFY_CATEGORY_IS_EMPTY = "通知类型不能为空";
	public static final String NOTIFY_STATUS_IS_EMPTY = "通告状态不能为空";
	public static final String NOTIFY_GRADE_IS_EMPTY = "通告等级不能为空";
	public static final String NOTIFY_CONTENT_IS_EMPTY = "通告内容不能为空";
	public static final String NOTIFY_TOPIC_IS_EMPTY = "通告主题不能为空";
	public static final String NOTIFY_ID_IS_EMPTY = "通知的id不能为空";
	public static final String NOTIFY_COM_IS_EMPTY = "通知的对象不能为空";
	public static final String NOTIFY_IS_DELETE_IS_EMPTY = "是否删除不能为空";
	public static final String SELECT_COMPANY_NOTIFY_SUCCESS = "搜索公司通知成功";
	public static final String SELECT_SYSTEM_NOTIFY_SUCCESS = "搜索系统通知成功";
	public static final String SELECT_DELETE_NOTIFY_SUCCESS = "搜索已经删除的通知成功";
	public static final String CHECK_NOTIFY_SUCCESS = "检测通知成功";
	public static final String DELETE_NOTIFY_SUCCESS = "删除通知成功";
	public static final String BATCH_NOTIFY_SUCCESS = "批量删除通知成功";
	
	/******************************************************************************/
	
	public static final String PROJECT_FAILURE_CODE = null;
	public static final String PROJECT_CREATER_ID_IS_EMPTY = "创建项目人员编号不能为空";
	public static final String PROJECT_INVEST_METHOD_IS_EMPTY = "项目出资方式不能为空";
	public static final String PROJECT_INVEST_COUNTRY_IS_EMPTY = "投资项目所在国不能为空";
	public static final String PROJECT_INVEST_STATUS_IS_EMPTY = "项目投资状态不能为空";
	public static final String PROJECT_CASH_IS_EMPTY = "投入资金不能为空";
	public static final String PROJECT_UPGRADE_NO_IS_EMPTY = "项目更新人工号不能为空";
	public static final String PROJECT_STATUS_IS_EMPTY = "项目状态不能为空";
	public static final String PROJECT_END_TIME_IS_EMPTY = "结束日期不能为空";
	public static final String PROJECT_NAME_IS_EMPTY = "项目名不能为空";
	
	
	/******************************************************************************************************/
	
	public static final String MEDICAL_FAILURE_CODE = null;
	public static final String COMPLAINT_FAILURE_CODE = null;
	public static final String INSURANCE_FAILURE_CODE = null;

	public static final String INSURANCE_ID_IS_EMPTY = "理赔单的id不能为空";
	public static final String COMPLAINT_ID_IS_EMPTY = "理赔投诉单的id不能为空";
	public static final String INSURANCE_MEDICAL_ID_IS_EMPTY = "现场医疗的id不能为空";
	public static final String INSURANCE_PHONE_ID_IS_EMPTY = "电话不能为空";
	public static final String INSURANCE_HOSPITAL_ID_IS_EMPTY = "医院不能为空";
	public static final String INSURANCE_FIELD_ID_IS_EMPTY = "地区不能为空";
	public static final String INSURANCE_TIME_ID_IS_EMPTY = "时间不能为空";
	public static final String INSURANCE_SAVING_ID_IS_EMPTY = "查询现场医疗的id不能为空";
	
	/******************************************************************************************************/
	
	public static final String INTRODUCTION_FAILURE_CODE = null;

	public static final String INTRODUCTION_AUTHOR_IS_EMPTY = "作者不能为空";
	public static final String INTRODUCTION_NAME_IS_EMPTY = "名称不能为空";
	public static final String INTRODUCTION_TIPS_IS_EMPTY = "备注内容不能为空";
	public static final String INTRODUCTION_BUYIN_ID_IS_EMPTY = "购入须知的id不能为空";
	public static final String INTRODUCTION_TYPE_IS_EMPTY = "安保安防分类intro_type不能为空";
	
	
	
	/*************************************************************************************************/
	
	public static final String ENTERPRISE_XMLVALUE = "http://139.196.4.11/data/xml/enterprise.xml";
	public static final String PROJECT_XMLVALUE = "http://139.196.4.11/data/xml/project.xml";
	public static final String AREA_XMLVALUE = "http://139.196.4.11/data/xml/area.xml";
	public static final String INDUSTRY_XMLVALUE = "http://139.196.4.11/data/xml/industry.xml";
	public static final String COUNTRY_XMLVALUE = "http://139.196.4.11/data/xml/country.xml";
	
	public static final String ADD_Industry_OK_CODE = null;
	public static final String ADD_Industry_OK = null;
	
	/********************************************4**************************************************/
	public static final String PASSWORDS_ID_IS_EMPTY = "密码不能为空";
	public static final String PASSWORDS_ID_IS_EMPTY_CODE = "400400";

	/********************************************网站设置 13*****************************************************/
	public static final String CATEGORY_LINKACTION_SUCCESS = "网站设置模块操作成功";
	public static final String CATEGORY_LINKACTION_SUCCESS_CODE = "1300201";
	/********************************************平台面板 2*****************************************************/
	public static final String CATEGORY_LAWACTION_SUCCESS_CODE = "200201";
	public static final String CATEGORY_LAWACTION_SUCCESS = "平台面板模块操作成功";
	/********************************************系统设置14*****************************************************/
	public static final String CATEGORY_SYSTEMACTION_SUCCESS_CODE = "1400201";
	public static final String CATEGORY_SYSTEMACTION_SUCCESS = "系统设置操作成功";
    /********************************************10相册管理******************************************************/
	public static final String PHOTOS_SUCCESS_CODE = "1000200";
	public static final String PHOTOS_SUCCESS="相册操作成功";
	public static final String PHOTOS_ID_IS_EMPTY_CODE = "1000300";
	public static final String PHOTOS_ID_IS_EMPTY = "相册id不能为空";
	
	
	
	public static final String APPPREFIX = "OIEWP";

	public static final String DELETE_Industry_OK_CODE = null;
	public static final String DELETE_Industry_OK = null;
	public static final String UPDATE_Industry_OK_CODE = null;
	public static final String UPDATE_Industry_OK = null;
	public static final String SELECT_Industry_OK_CODE = null;
	public static final String SELECT_Industry_OK = null;
	public static final String INIT_Industry_OK_CODE = null;
	public static final String INIT_Industry_OK = null;
	public static final String INIT_INDUSTRY_ERROR = null;
	public static final String INIT_INDUSTRY_ERROR_CODE = null;
	public static final String ADD_COUNTRY_OK_CODE = null;
	public static final String ADD_COUNTRY_OK = null;
	public static final String DELETE_COUNTRY_OK_CODE = null;
	public static final String DELETE_COUNTRY_OK = null;
	public static final String SELECT_COUNTRY_OK_CODE = null;
	public static final String SELECT_COUNTRY_OK = null;
	public static final String INIT_COUNTRY_OK_CODE = null;
	public static final String INIT_COUNTRY_OK = null;
	public static final String INIT_COUNRY_ERROR = null;
	public static final String INIT_COUNRY_ERROR_CODE = null;
	public static final String SELECT_AREA_OK_CODE = null;
	public static final String SELECT_AREA_OK = null;
	public static final String DELETE_AREA_OK = null;
	public static final String DELETE_AREA_OK_CODE = null;
	public static final String ADD_AREA_OK = null;
	public static final String ADD_AREA_OK_CODE = null;
	public static final String INIT_AREA_OK = null;
	public static final String INIT_AREA_OK_CODE = null;
	public static final String INIT_AREA_ERROR_CODE = null;
	public static final String INIT_AREA_ERROR = null;
	/********************************************门户 18*****************************************************/
	public static final String CATEGORY_PICTUREACTION_SUCCESS_CODE = "1800200";
	public static final String CATEGORY_PICTUREACTION_SUCCESS = "图片操作成功";
	
	public static final String CATEGORY_PROJECTACTION_SUCCESS_CODE = "1800201";
	public static final String CATEGORY_PROJECTACTION_SUCCESS = "项目操作成功";
	
	
	public static final String[] ALARM_ARGS = new String[]{"oiewp","境外投资","预警","突发事件","事件"};
	public static final String SYSTEM_MESSAGE_ALARM = "OIEWP平台发送的短信有异常情况，请系统管理员尽快查看";
	public static final String SYSTEM_CONTACT_PHONE = "18751582759";

	/********************************************企业评论 19**********************/
	public static final String FECOMMENT_ACTION_SUCCESS_CODE = "190200";
	public static final String FECOMMENT_ACTION_SUCCESS = "评论操作成功";
	public static final String FECOMMENT_NAME_ISNULL = "参数姓名不能为空";
	public static final String FECOMMENT_NAME_ISNULL_CODE = "190400";
	public static final String FECOMMENT_CONTACTNUM_ISNULL = "参数联系电话为空";
	public static final String FECOMMENT_CONTACTNUM_ISNULLCODE = "190401";
	public static final String FECOMMENT_CONTENT_ISNULL = "评论内容为空";
	public static final String FECOMMENT_CONTENT_ISNULL_CODE = "190402";
	public static final String FECOMMENT_REPLYCONTID_ISNULL_CODE = "190403";
	public static final String FECOMMENT_REPLYCONTID_ISNULL = "回复的评论的id不能为空";
	public static final String FECOMMENT_FEID_ISNULL_CODE = "190404";
	public static final String FECOMMENT_FEID_ISNULL = "评论的id不能为空";
	public static final String FECOMMENT_FEIDS_ISNULL = "评论的ids不能为空";
	public static final String FECOMMENT_FEIDS_ISNULL_CODE = "190405";

	public static final String AODATA_IS_EMPTY_CODE = "-1";
	public static final String HELP_SUCCESS_CODE = "0";
	public static final String HELP_SUCCESS = "查询帮助信息成功";
	public static final String LOGIN_SUCCESS_CODE = "400200";
	public static final String EMAIL_RESET_IS_EMPTY = "重置密码的邮件不能为空";
	public static final String EMAIL_RESET_IS_EMPTY_CODE = "400401";
	public static final String EMAIL_RESET_CODE = "400200";
	public static final String EMAIL_RESET_SUCCESS = "邮件重置成功，测试数据";
	public static final String EMAIL_SEND_CODE = "400202";
	public static final String EMAIL_SEND_SUCCESS = "你的企业账号已经发送你的邮箱，请你查收！";
	public static final String EMAIL_SEND_FILED_CODE = "400300";
	public static final String EMAIL_SEND_FILED = "该企业不存在！";
	public static final Object KEY_OF_HELPINFO = "HELPINFOKEY";
	public static final Object KEY_OF_ARTCLE = "ARTICLEKEY";
	public static final String EMAIL_SET_SUCCESS_CODE = "1300200";
	public static final String EMAIL_SET_SUCCESS = "邮件设置成功";
	public static final String EMAIL_SET_ERROR_ID_ISEMPTY = "邮件编号不能为空";
	public static final String EMAIL_SET_ERROR_CODE = "800415";
	public static final String LOGIN_OFF_SUCCESS_CODE = "400201";
	public static final String LOGIN_OFF_SUCCESS = "用户已经注销";
	public static final String UPDATE_NOTE_SUCCESS_CODE = null;
	public static final String UPDATE_NOTE_SUCCESS = null;
	public static final String ARTICLE_VISIT_SITE = "http://www.oiewp.com:58086/website/articleDetail.html?post_id=";
	public static final Object ACCESS_TOKEN_KEY = "WECHATKEY";
	
	
	
	public static final String WANGYI_NEWS_URL="http://wangyi.butterfly.mopaasapp.com/news/api?type=#TYPE#&page=#PAGE#&limit=#LIMIT#";
	public static final String WATER_MARK_IMAGE = "http://developer.qiniu.com/resource/logo-2.jpg";
	public static final String QINIU_ACCESS_KEY = null;
	public static final String QINIU_SECRET_KEY = null;
	public static final String DEFAULT_BUCKET_NAME = "Bucket_Name";
	
	
	
	
	


	
}
