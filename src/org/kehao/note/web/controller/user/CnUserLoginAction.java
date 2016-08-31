package org.kehao.note.web.controller.user;

import net.sf.json.JSONObject;

import org.kehao.note.model.CnUser;
import org.kehao.note.service.CnUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
@Repository
@Scope("prototype")
public class CnUserLoginAction {
	@Autowired
	private CnUserService userService;
	private CnUser user;
	/**
	 * JSONObject如果返回json.toString会带有斜杠
	 */
	private JSONObject result;
	
	public JSONObject getResult() {
		return result;
	}

	public void setResult(JSONObject result) {
		this.result = result;
	}

	public CnUser getUser() {
		return user;
	}

	public void setUser(CnUser user) {
		this.user = user;
	}
	public String toLogin(){
		user=userService.getUserById("c400897c9c7146bea8e46cb5e2987bf6");
		JSONObject json = JSONObject.fromObject(user);
		System.out.println(json.toString());
		result=json;
		return "ok";
	}
}
