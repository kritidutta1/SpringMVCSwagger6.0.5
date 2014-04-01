package com.mkyong.customer.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
/**
 * To say hello to user.
 * @author IMFCORP\kriti.dutta
 *
 */
@Api(value = "hello123", description = "say hello first time") // Swagger annotation
@Controller
@RequestMapping(value="/hello.htm",produces=MediaType.TEXT_HTML_VALUE)
public class HelloController {

	/**
	 * Say hello to user.
	 * @param model
	 * @return
	 */
	@ApiOperation(value="say hello method", notes="display hello on screen")
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String sayHello(@ApiParam(required = true, name = "modelMap", value = "Model Map") @RequestBody ModelMap model) {

		// return form view
		return "hello";
	}

}