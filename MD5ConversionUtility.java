package com.test.ankur;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5ConversionUtility 
{
    public static void main(String[] args)throws Exception {
    	System.out.println(encryptDataInHEXFormat("Ankur Goel"));
    	
    }
    
    public static String encryptDataInHEXFormat(String data) throws NoSuchAlgorithmException{
    	 MessageDigest md = MessageDigest.getInstance("MD5");
         md.update(data.getBytes());
  
         byte byteData[] = md.digest();
  
         //convert the byte to hex format method 1
         StringBuffer sb = new StringBuffer();
         for (int i = 0; i < byteData.length; i++) {
          sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
         }
         
         return sb.toString();
    }
    
}
