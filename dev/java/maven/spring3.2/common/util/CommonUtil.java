package com.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



import org.springframework.web.multipart.MultipartFile;

public class CommonUtil {
	public CommonUtil() {

	}


	/**
	 * string中的“<”,“>”换成实体符“&lt”，“&gt”
	 * 
	 */
	public static String escapeHtmltoString(String str) {
		if (str == null)
			return null;
		StringBuilder sbBuilder = new StringBuilder();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case '<':
				sbBuilder.append("&lt;");
				break;
			case '>':
				sbBuilder.append("&gt;");
				break;
			default:
				sbBuilder.append(ch);
				break;
			}
		}
		return sbBuilder.toString();
	}

	/**
	 * 计算按字节string长度，一个中文占2个字节，英文占一个字节
	 */
	public static int getLengthOfStr(String str) {
		int count = 0;
		char[] chs = str.toCharArray();
		for (char ch : chs) {
			/**
			 * 通过Unicode判断是中文
			 */
			if (ch >= '\u0391' && ch <= '\uFFE5') {
				count += 2;
			} else {
				count += 1;
			}
		}
		return count;
	}

	public static boolean hasNoZhWord(String str) {
		return !hasZhWord(str);
	}

	public static boolean hasZhWord(String str) {
		char[] chs = str.toCharArray();
		for (char ch : chs) {
			/**
			 * 通过Unicode判断是中文
			 */
			if (ch >= '\u0391' && ch <= '\uFFE5') {
				return true;
			}
		}
		return false;
	}

	/**
	 * 将string数组拼成string，并以指定的符号隔开
	 */
	public static String joinList(String joinChar, String... objects) {
		if (objects == null)
			return "";
		StringBuffer sbBuffer = new StringBuffer();
		int index = 0;
		for (Object object : objects) {
			if (index++ > 0)
				sbBuffer.append(joinChar);
			sbBuffer.append(String.valueOf(object));
		}
		return sbBuffer.toString();

	}



	/**
	 * 验证客户端上传的文件是否是图片
	 * 
	 * @param file
	 * @return
	 */

	public static boolean isImage(MultipartFile file) {
		if (file == null || file.isEmpty()) {
			return false;
		}
		return StringUtils.isImage(file.getOriginalFilename());
	}

	/**
	 * 验证某个文件是否是图片文件
	 * 
	 * @param file
	 * @return
	 */
	public static boolean isImage(File file) {
		if (file == null || !file.exists()) {
			return false;
		}
		return StringUtils.isImage(file.getName());
	}

	


	 /**
     * 删除文件
     * @param  path
     * @return true删除成功   false删除失败
     */
    public static boolean delFile(String path,String url){
    	File file =  new File(path,url.substring(url.lastIndexOf('/')));
    	if(null!=file&&file.exists()&&file.isFile()){
    		return file.delete();
    	}
    	return false;
    	
    }
	/**
	 * 深度克隆
	 * 
	 * @param oldObj
	 * @return
	 */
	public final static Object clone(Serializable oldObj) {
		Object newObj = null;
		ByteArrayOutputStream byteoutput = null;
		try {
			byteoutput = new ByteArrayOutputStream();
			ObjectOutputStream objouput = new ObjectOutputStream(byteoutput);
			objouput.writeObject(oldObj);
			objouput.flush();
			ByteArrayInputStream byteinput = new ByteArrayInputStream(byteoutput.toByteArray());
			ObjectInputStream objinput = new ObjectInputStream(byteinput);
			newObj = objinput.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return newObj;
	}

	public static boolean startWithIgnoreCace(String origin, String prefix) {
		String or = origin.toLowerCase();
		if (StringUtils.isNullOrEmpty(or))
			return false;
		if (StringUtils.isNullOrEmpty(prefix))
			return false;
		if (or.length() < prefix.length())
			return false;
		for (int i = 0; i < prefix.length(); i++) {
			if (or.charAt(i) != prefix.charAt(i))
				return false;
		}
		return true;
	}

	public static byte[] serialize(Object object) {
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try {
			// 序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e) {

		}
		finally {
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				oos =null;
			}
			if(baos!=null){
				try {
					baos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				baos=null;
			}
		}
		return null;
	}

	public static Object unserialize(byte[] bytes) {
		ByteArrayInputStream bais = null;
		if(bytes==null||bytes.length==0)
			return null;
		try {
			// 反序列化
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		} catch (Exception e) {

		}
	
		return null;
	}

}
