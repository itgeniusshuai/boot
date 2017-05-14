package com.boot.db;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import com.boot.domain.User;


public class MemeryDb {
	
	private static Map<String, String> memeryDb = new HashMap<>();
	static{
		memeryDb.put("tom", DigestUtils.md5DigestAsHex("123".getBytes()));
		memeryDb.put("jetty", DigestUtils.md5DigestAsHex("123".getBytes()));
		memeryDb.put("jack", DigestUtils.md5DigestAsHex("123".getBytes()));
		memeryDb.put("ketty", DigestUtils.md5DigestAsHex("123".getBytes()));
	}
	
	public static int addUser(User user){
		memeryDb.put(user.getName(), user.getPwd());
		return 1;
	}
	public static User getUserByName(String name){
		String pwd = memeryDb.get(name);
		if(StringUtils.isBlank(pwd)){
			return null;
		}
		return new User(name,pwd);
	}
	
}
