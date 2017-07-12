package com.jiaojing.L010;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class ListTypeEditSupport extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] codeRaw=text.split("\\s+");
        byte[] code = new byte[codeRaw.length];
        for (int i = 0; i < codeRaw.length; i++) {
        	System.out.println(codeRaw[i]);
        	code[i] = (byte) Integer.parseInt(codeRaw[i].substring(2), 16);
		}
        
        setValue(code);
    }
    
    @Override
    public String getAsText() {
        return getValue().toString();
    }
}
