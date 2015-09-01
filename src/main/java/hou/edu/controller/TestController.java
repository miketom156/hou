/**
 * 
 */
package hou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lyh
 * @Description 
 * @date 2015年9月1日
 * 
 */
@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping
	public String test(){
		return "success";
	}
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
