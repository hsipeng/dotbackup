package com.common.util;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.DocFlavor.STRING;

import org.springframework.web.multipart.MultipartFile;

/**
 * 校验工具类
 * 
 * @author uyues-wangj
 *
 */
public class ParamValidateUtil {

	private ParamValidateUtil() {

	}

	/**
	 * 检验密码长度
	 * 
	 * @param param
	 * @param message
	 * @throws ParamNotValidException
	 */
	public static void validatePassword(String param, String message, String code) throws ParamNotValidException {
		if (null == param || param.trim().length() < 6 || param.trim().length() > 16 || CommonUtil.hasZhWord(param)) {
			throw new ParamNotValidException(message, code);
		}

	}

	/**
	 * 对象校验是否为空
	 * 
	 * @param param
	 * @param message
	 * @throws ParamNotValidException
	 */
	public static void validateNull(Object param, String message, String code) throws ParamNotValidException {
		if (null == param) {
			throw new ParamNotValidException(message, code);
		}
	}

	/**
	 * 字符串内容是否为空
	 * 
	 * @param param
	 * @param message
	 * @throws ParamNotValidException
	 */
	public static void validateEmpty(String param, String message, String code) throws ParamNotValidException {
		if (param == null || param.trim().length() == 0) {
			throw new ParamNotValidException(message, code);
		}
	}

	public static void validateEmpty(String param, String message) throws ParamNotValidException {
		if (param == null || param.trim().length() == 0) {
			throw new ParamNotValidException(message, String.valueOf(Constant.failed_code));
		}
	}

	public static void validateEmpty(MultipartFile param, String message, String code) throws ParamNotValidException {
		if (param == null || param.isEmpty()) {
			throw new ParamNotValidException(message, code);
		}
	}

	public static void validateEmpty(MultipartFile[] multipartFiles, String message, String code)
			throws ParamNotValidException {
		if (multipartFiles.length == 0 || multipartFiles == null) {
			throw new ParamNotValidException(message, code);
		}
		for (MultipartFile m : multipartFiles) {
			if (!CommonUtil.isImage(m)) {
				throw new ParamNotValidException(message, code);
			}
		}
	}

	/**
	 * 整数校验
	 * 
	 * @param param
	 * @param message
	 * @throws ParamNotValidException
	 */
	public static void validatePositive(Integer param, String message, String code) throws ParamNotValidException {
		if (param == null || param < 0) {
			throw new ParamNotValidException(message, code);
		}
	}

	/**
	 * 小于等于num 大于num1 将抛异常
	 * 
	 * @param param
	 * @param num
	 * @param num1
	 * @param message
	 * @throws ParamNotValidException
	 */
	public static void validatePositive(Integer param, Integer num, Integer num1, String message, String code)
			throws ParamNotValidException {
		if (param == null || param <= num || param > num1) {
			throw new ParamNotValidException(message, code);
		}
	}

	public static void validatePositive(Integer param, Integer num, String message, String code)
			throws ParamNotValidException {
		if (param == null || param < 0 || param > num) {
			throw new ParamNotValidException(message, code);
		}
	}

	public static void validatePositive(BigDecimal param, BigDecimal num, String message, String code)
			throws ParamNotValidException {
		if (num == null) {
			num = BigDecimal.ZERO;
		}
		if (param == null || param.compareTo(num) != 1) {
			throw new ParamNotValidException(message, code);
		}
	}

	public static void validatePositive(Long param, String message, String code) throws ParamNotValidException {
		if (param == null || param <= 0) {
			throw new ParamNotValidException(message, code);
		}
	}

	public static void validatePositive(BigDecimal param, String message, String code) throws ParamNotValidException {
		if (!(param instanceof BigDecimal)) {
			throw new ParamNotValidException(message, code);
		}
	}

	public static void validateEmpty(Number param, String message, String code) throws ParamNotValidException {
		if (param == null || param.doubleValue() < 0) {
			throw new ParamNotValidException(message, code);
		}

	}

	/**
	 * 校验身份证的合法性
	 * 
	 * @param IDCard
	 * @return
	 */
	public static boolean validateIDCard(String IDCard) {
		int[] intArr = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += Character.digit(IDCard.charAt(i), 10) * intArr[i];
		}
		int mod = sum % 11;
		int[] intArr2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] intArr3 = { 1, 0, 'X', 9, 8, 7, 6, 5, 4, 3, 2 };
		String matchDigit = "";
		for (int i = 0; i < intArr2.length; i++) {
			int j = intArr2[i];
			if (j == mod) {
				matchDigit = String.valueOf(intArr3[i]);
				if (intArr3[i] > 57) {
					matchDigit = String.valueOf((char) intArr3[i]);
				}
			}
		}
		if (matchDigit.equals(IDCard.substring(IDCard.length() - 1))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 邮箱验证 正确返回ture 错误返回false
	 */
	public static void validateEmail(String email, String message, String code) throws ParamNotValidException {
		String check = "^([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
		Pattern regex = Pattern.compile(check);
		if (StringUtils.isNullOrEmpty(email))
			return;
		Matcher matcher = regex.matcher(email);
		if (!matcher.matches()) {
			throw new ParamNotValidException(message, code);
		}
	}

	/**
	 * 电话号码正确返回ture 错误返回false
	 */
	public static void validatePhonenum(String phone, String message, String code) throws ParamNotValidException {
		String check = "^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\\d{8})$";
		Pattern regex = Pattern.compile(check);
		if (StringUtils.isNullOrEmpty(phone))
			return;
		Matcher matcher = regex.matcher(phone);
		if (!matcher.matches()) {
			throw new ParamNotValidException(message, code);
		}
	}

	/**
	 * 校验表达式
	 * 
	 * @param expression
	 *            需要校验的 true 成功 false失败
	 * @param message
	 *            校验失败的消息
	 * @throws ParamNotValidException
	 *             参数不对异常
	 */
	public static void validateExpression(boolean expression, String message, String code)
			throws ParamNotValidException {
		if (!expression) {
			throw new ParamNotValidException(message, code);
		}
	}

	/**
	 * 校验是否超过数据库最大长度
	 * 
	 * @param param
	 *            需要校验的字符串值
	 * @param length
	 *            最大长度
	 * @param message
	 *            错误消息
	 * @throws ParamNotValidException
	 */

	public static void validateMaxLength(String param, int length, String message, String code)
			throws ParamNotValidException {
		if (param != null) {
			if (CommonUtil.getLengthOfStr(param) >= length) {
				throw new ParamNotValidException(message, code);
			}
		}
	}

	/**
	 * 最小长度校验
	 * 
	 * @param param
	 * @param length
	 * @param message
	 * @throws ParamNotValidException
	 */
	public static void validateMinLength(String param, int length, String message, String code)
			throws ParamNotValidException {
		if (param != null) {
			if (CommonUtil.getLengthOfStr(param) <= length) {
				throw new ParamNotValidException(message, code);
			}
		}
	}

	/**
	 * 
	 * @param param
	 *            需要校验的号码字符串
	 * @param message
	 *            错误消息
	 * @throws ParamNotValidException
	 */
	public static void validatePhone(String param, String message, String code) throws ParamNotValidException {
		validateEmpty(param, message, code);
		if (!StringUtils.isNumber(param))
			throw new ParamNotValidException(message, code);
	}

	/**
	 * 一般用于批量删除 判断分割后的是整数
	 * 
	 * @param split
	 *            是分隔符 如果 split 是null则只校验是数字
	 * @param soure
	 *            是要分割的字符串
	 * @param message
	 * @throws ParamNotValidException
	 */
	public static void validationStringIsNumber(String split, String soure, String message, String code)
			throws ParamNotValidException {
		if (soure == null || soure == " ") {
			throw new ParamNotValidException(message, code);
		}
		char[] chars = soure.toCharArray();
		if (split == null) {
			for (char c : chars) {
				if (!(c >= '0' && c <= '9'))
					throw new ParamNotValidException(message, code);
			}
		} else {
			char ch = split.toCharArray()[0];
			for (char c : chars) {
				if (!((c >= '0' && c <= '9') || c == ch))
					throw new ParamNotValidException(message, code);
			}
		}

	}

	/**
	 * function功能 字符串长度，非空校验
	 * 
	 * @param param
	 *            需要校验的参数
	 * @param minLength
	 *            设置参数的最小长度，包含最小长度，不需要校验设为null
	 * @param maxLength
	 *            设置参数的最大长度，不包含最大长度，不需要校验设为null
	 * @param message
	 *            设置错误消息
	 * @throws ParamNotValidException
	 */
	public static void validateStringLength(String param, Integer minLength, Integer maxLength, String message,
			String code) throws ParamNotValidException {
		validateEmpty(param, message, code);
		if (minLength != null) {
			validateMinLength(param, minLength, message, code);
		}
		if (maxLength != null) {
			validateMaxLength(param, maxLength, message, code);
		}
	}

	/**
	 * function功能 Integer类型长度，非空校验
	 * 
	 * @param param
	 *            需要校验的参数
	 * @param minLength
	 *            设置参数的最小长度，包含最小长度将抛异常，不需要校验设为null
	 * @param maxLength
	 *            设置参数的最大长度，包含最大长度将抛异常，不需要校验设为null
	 * @param message
	 *            设置错误消息
	 * @throws ParamNotValidException
	 */
	public static void validateIntegerLength(Integer param, Integer minLength, Integer maxLength, String message,
			String code) throws ParamNotValidException {
		validateEmpty(param, message, code);
		String paramTostring = param.toString();
		if (minLength != null) {
			validateMinLength(paramTostring, minLength, message, code);
		}
		if (maxLength != null) {
			validateMaxLength(paramTostring, maxLength, message, code);
		}
	}

	/**
	 * function功能 Long类型长度，非空校验
	 * 
	 * @param param
	 *            需要校验的参数
	 * @param minLength
	 *            设置参数的最小长度，包含最小长度，不需要校验设为null
	 * @param maxLength
	 *            设置参数的最大长度，不包含最大长度，不需要校验设为null
	 * @param message
	 *            设置错误消息
	 * @throws ParamNotValidException
	 */
	public static void validateLongLength(Long param, Integer minLength, Integer maxLength, String message, String code)
			throws ParamNotValidException {
		validateEmpty(param, message, code);
		String paramTostring = param.toString();
		if (minLength != null) {
			validateMinLength(paramTostring, minLength, message, code);
		}
		if (maxLength != null) {
			validateMaxLength(paramTostring, maxLength, message, code);
		}
	}

	public static void validateIsNumber(String str, String message, String code) throws ParamNotValidException {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				throw new ParamNotValidException(message, code);
			}
		}
	}

	/**
	 * 参数校验异常类
	 * 
	 * @author uyues-wangj
	 *
	 */
	public static final class ParamNotValidException extends Exception {

		private static final long serialVersionUID = 1L;

		/**
		 * 异常消息
		 */
		private String message;

		/**
		 * 异常代码
		 */
		private String code = String.valueOf(Constant.failed_code);

		public void setCode(String code) {
			this.code = code;
		}

		public void setMessage(String message, String code) {
			this.message = message;
		}

		@Override
		public String getMessage() {
			return this.message;
		}

		public String getCode() {
			return code;
		}

		public ParamNotValidException() {

		}

		public ParamNotValidException(String message) {
			this.message = message;
		}

		public ParamNotValidException(String message, String code) {
			this.message = message;
			this.code = code;
		}

	}

}
