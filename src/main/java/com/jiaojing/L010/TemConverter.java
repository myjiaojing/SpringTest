package com.jiaojing.L010;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;

public class TemConverter implements Converter<String, List<Member>> {

    @Override
    public List<Member> convert(String source) {
    	
    	 String[] rawMember=source.split(",");
    	 
    	
    	 List<Member> members= new ArrayList<Member>();
    	 for (String string : rawMember) {
    		 Member m=new Member();
    	     m.setName(string);
    	     System.out.println(string);
    	     members.add(m);
    	     
 		}
    	 
    	 
        
        return members;
    }

}
