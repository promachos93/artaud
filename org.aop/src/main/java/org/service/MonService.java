package org.service;

import org.springframework.stereotype.Service;


@Service
public class MonService {

	public String hello(String msg){
		String s = "Hello "+msg;
		System.out.println(s);
		return s;
	}
}
