package com.common.util;

import java.util.Calendar;

/**
 * String utils
 * 
 * @author user1
 * 
 */
public class StringUtils {
	private static String[] afix = new String[] { "png", "jpg","jpeg", "bmp", "gif", "PNG", "JPG", "BMP", "GIF" };

	private StringUtils() {

	};

	/**
	 * 替换指定的字符串
	 * @param source
	 * @param args
	 * @param newChar
	 * @return
	 */
	public static String replace(String source,String[] args,String[] newChar){
		String dest=source;
		
		for (int i = 0; i < newChar.length; i++) {
			dest=dest.replace(args[i], newChar[i]);
		}
		
		return dest;
	}
	/**
	 * 用指定的符号替换全部需要替换掉的值
	 * @param source
	 * @param args
	 * @param newChar
	 * @return
	 */
	public static String replace4Space(String source,String[] args, String newChar){
		String dest=source;
		
		for (int i = 0; i < args.length; i++) {
			dest=dest.replace(args[i], newChar);
		}
		
		return dest;
	}
	
	
	public static String trim(String str) {
		return str == null ? "" : str.trim();
	}
	/**
	 * 用来判断一段文字中是够包含制定的文字内容或者符号，如果包含，返回true
	 * @param source
	 * @param args
	 * @return
	 */
	public static boolean isContains(String source, Object[] args){
		boolean flag=false;
		if (source.trim()=="") {
			return false;
		}
		
		for (Object param : args) {
			
			flag=flag||source.contains(String.valueOf(param));
		}
		return flag;
	}
	
	
	
	/**
	 * 
	 * @param date
	 *            日期
	 * @param format
	 *            日期格式 参照new SimpleDateformat yyyy MM dd hh HH mm ss SSS
	 * @return
	 */
	public static String formatDate(Calendar date, String format) {
		if (format == null || format.length() == 0)
			return date.toString();
		StringBuilder sbBuffer = new StringBuilder();
		int[] param = new int[] { date.get(Calendar.YEAR), date.get(Calendar.MONTH) + 1, date.get(Calendar.DATE),
				date.get(Calendar.HOUR_OF_DAY), date.get(Calendar.HOUR), date.get(Calendar.MINUTE),
				date.get(Calendar.SECOND), date.get(Calendar.MILLISECOND) };
		for (int i = format.length() - 1; i >= 0; i--) {
			char ch = format.charAt(i);
			switch (ch) {
			case 'y':
				sbBuffer.append(param[0] % 10);
				param[0] = param[0] / 10;
				break;
			case 'M':
				sbBuffer.append(param[1] % 10);
				param[1] = param[1] / 10;
				break;
			case 'd':
				sbBuffer.append(param[2] % 10);
				param[2] = param[2] / 10;
				break;
			case 'H':
				sbBuffer.append(param[3] % 10);
				param[3] = param[3] / 10;
				break;
			case 'h':
				sbBuffer.append(param[4] % 10);
				param[4] = param[4] / 10;
				break;
			case 'm':
				sbBuffer.append(param[5] % 10);
				param[5] = param[5] / 10;
				break;
			case 's':
				sbBuffer.append(param[6] % 10);
				param[6] = param[6] / 10;
				break;
			case 'S':
				sbBuffer.append(param[7] % 10);
				param[7] = param[7] / 10;
				break;
			/**
			 * 其他非日期格式字符
			 */
			default:
				sbBuffer.append(ch);
			}

		}
		return sbBuffer.reverse().toString();
	}

	public static boolean isNull(String str) {
		return str == null;
	}

	public static boolean isNotNull(String str) {
		return !isNull(str);
	}

	public static boolean isNullOrEmpty(String str) {
		return str == null || "".equals(str.trim());
	}

	public static boolean isNotNullAndEmpty(String str) {
		return !isNullOrEmpty(str);
	}

	public static String lpad(char paddingChar, int length, Object obj) {
		String old = obj.toString();
		int oldLength = old.length();
		if (oldLength >= length)
			return old;
		for (int index = 0; index < length - oldLength; index++) {
			old = paddingChar + old;
		}
		return old;
	}

	/**
	 * 判断是否是图片
	 * 
	 * @param name
	 * @return
	 */
	public static boolean isImage(String name) {

		if (name == null || name.length() == 0)
			return false;
		for (String tmp : afix) {
			if (name.endsWith(tmp))
				return true;
		}
		return false;

	}

	/**
	 * 判断是否为为数字
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static String subFrom(String sql) {

		StringBuilder sBuilder = new StringBuilder("select count(0) from ");
		if (isNullOrEmpty(sql))
			return "";
		boolean hasFrom = false;
		for (int i = 0; i < sql.length(); i++) {
			char charc = sql.charAt(i);
			switch (charc) {
			case '(':
				if (hasFrom) {
					sBuilder.append(charc);
				}
				else {
					i = sql.indexOf(')', i);
				}
				break;
			case ')':
				if (hasFrom) {
					sBuilder.append(charc);
				}
				break;
			case 'F':
			case 'f':
				if(hasFrom){
					sBuilder.append(charc);
				}
				else{
					char tmp1 = sql.charAt(++i);
					if ('R' == tmp1 || 'r' == tmp1) {
						char tmp2 = sql.charAt(++i);
						if (tmp2 == 'o' || tmp2 == 'O') {
							char tmp3 = sql.charAt(++i);
							if ('M' == tmp3 || 'm' == tmp3) {
								hasFrom = true;
							}
						}

					}
				}
				break;
			default:
				if (hasFrom) {
					sBuilder.append(charc);
				}
				break;
			}
		}
		return sBuilder.toString();
	}

	public static void main(String[] args) {
		
		boolean yes=StringUtils.isContains("[\"250269483\"", new String[]{"\"","[","]"});
		
		System.out.println(yes);
		
		System.out.println(subFrom("SELECT a.id ,a.categoryname categoryName,a.type,a.parentid parentId ,a.picture,(SELECT categoryname FROM category WHERE id = a.parentid) AS parentName FROM category a WHERE 1=1"));
	}
}
