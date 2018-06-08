/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.ljc555.hadoop.hdfsclientdemo.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ljh-hadoop-learning
 * 
 * @author ljc555
 */
@RestController
@RequestMapping(value = "/")
public class IndexController {

	@GetMapping(value="/index")
	public String index() {
		return "hello world";
	}

	// @RequestParam 简单类型的绑定，可以出来get和post
	@GetMapping(value = "/get")
	public HashMap<String, Object> get(@RequestParam String name) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "hello world");
		map.put("name", name);

		return map;
	}
}
