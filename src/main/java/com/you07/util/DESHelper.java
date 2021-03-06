package com.you07.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;


public class DESHelper {
	private static byte[] iv = { 1, 2, 3, 4, 5, 6, 7, 8 };
	/**
	 * 加密
	 * @param encryptString
	 * @param encryptKey
	 * @return
	 */
    public static String encryptDES(String encryptString, String encryptKey){
    	byte[] encryptedData = null;
        IvParameterSpec zeroIv = new IvParameterSpec(iv);
        SecretKeySpec key = new SecretKeySpec(encryptKey.getBytes(), "DES");
        try {
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
			encryptedData = cipher.doFinal(encryptString.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return Base64.encodeBase64String(encryptedData);
    }
    /**
     * 解密
     * @param decryptString
     * @param decryptKey
     * @return
     */
    public static String decryptDES(String decryptString, String decryptKey){
    	byte decryptedData[] = null;
		byte[] byteMi = Base64.decodeBase64(decryptString);
		IvParameterSpec zeroIv = new IvParameterSpec(iv);
		SecretKeySpec key = new SecretKeySpec(decryptKey.getBytes(), "DES");
		try {
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
			decryptedData = cipher.doFinal(byteMi);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return new String(decryptedData);
	}
    /**
	 * 将二进制转换成16进制
	 * @method parseByte2HexStr
	 * @param buf
	 * @return
	 */
	public static String parseByte2HexStr(byte buf[]){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < buf.length; i++){
			String hex = Integer.toHexString(buf[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			sb.append(hex.toUpperCase());
		}
		return sb.toString();
	}
	
	/**
	 * 将16进制转换为二进制
	 * @method parseHexStr2Byte
	 * @param hexStr
	 * @return
	 */
	public static byte[] parseHexStr2Byte(String hexStr){
		if(hexStr.length() < 1)
			return null;
		byte[] result = new byte[hexStr.length()/2];
		for (int i = 0;i< hexStr.length()/2; i++) {
			int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
			int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
			result[i] = (byte) (high * 16 + low);
		}
		return result;
	}
	public static void main(String[] args) {
		String content = "http://192.168.4.234:8080/huanghuai/sign/v1.1/template!mycourses?usercode=20070527";
		String password = "lqkjhhxy";
//		System.out.println(System.currentTimeMillis()/1000);
//		String ciphertext = DESHelper.encryptDES(content, password);
//		System.out.println("明文：" + content);
//		System.out.println("密钥：" + password);
//		System.out.println("密文：" + ciphertext);
		System.out.println("解密后：" + DESHelper.decryptDES("sCboLO0M9seJt7vuNIvJxaTryaLFRnMCI9gPEuP5qpyBFHFX4K3TsxglrKLA6k0hwbaN9hHnsB+sjDxG+Lze2vU8VFZCLXGlnY8DeWKPu4l+F95e1UM3cGWwQUv5fJpJpXnoB4FkrnJqd/M6OtcLTMncPZ07Uv5eigqLTN97wM7ey8nKqCCfPjTD7uUPnZE+xuImWb8JipGlfkCG8Ak0/SZopERsGwJighJ0k3XnNYo+nouk6kPaMb5S42OPJ2Qgb2tebtSjeJ8v5DN4Uaz9vhUuO5YHepDUgFr8H5eha7Y9AbqT7VgCjw==", "wechathh"));
		
	}
}
