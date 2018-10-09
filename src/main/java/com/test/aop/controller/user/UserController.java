package com.test.aop.controller.user;

import com.test.aop.model.ResultBean;
import com.test.aop.utils.login.EncryptMd5Util;
import com.test.aop.utils.login.UCApi;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="/login" ,method= { RequestMethod.POST })
	public ResultBean<Map<String,Object>> login(@RequestBody Map<String, Object> param) {
		Map<String,Object> map_login = UCApi.U99Login(param.get("login_name").toString(), EncryptMd5Util.encryptMD5_Salt(param.get("password").toString()));
		return new ResultBean<>(map_login);
	}
}
