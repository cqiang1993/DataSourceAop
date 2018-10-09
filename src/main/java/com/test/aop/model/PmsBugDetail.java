package com.test.aop.model;

public class PmsBugDetail {
	private int id ;
	private int product_id;
	private int module_id;
	private int project_id;
	private int pms_bug_id;
	private String open_time;
	private String resolved_time;
	private String closed_time;
	private String response_time;
	private int state;
	private String actions;
	private int level;
	private String last_assigned;
	private String resolved_method;
	
	public String getLast_assigned() {
		return last_assigned;
	}
	public void setLast_assigned(String last_assigned) {
		this.last_assigned = last_assigned;
	}
	public String getResolved_method() {
		return resolved_method;
	}
	public void setResolved_method(String resolved_method) {
		this.resolved_method = resolved_method;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPms_bug_id() {
		return pms_bug_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getModule_id() {
		return module_id;
	}
	public void setModule_id(int module_id) {
		this.module_id = module_id;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public void setPms_bug_id(int pms_bug_id) {
		this.pms_bug_id = pms_bug_id;
	}
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public String getResolved_time() {
		return resolved_time;
	}
	public void setResolved_time(String resovled_time) {
		this.resolved_time = resovled_time;
	}
	public String getClosed_time() {
		return closed_time;
	}
	public void setClosed_time(String closed_time) {
		this.closed_time = closed_time;
	}
	public String getResponse_time() {
		return response_time;
	}
	public void setResponse_time(String response_time) {
		this.response_time = response_time;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
