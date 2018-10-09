package com.test.aop.model;

import java.util.Map;

public class PmsBug {
	private int id;
	private int product_id;
	private int module_id;
	private int project_id;
	private String assigned_to;
	private int env;
	private int platform;
	private String bug_title;
	private String error_info_detail;
	private String error_type;
	private int severity;
	private int discovery_probe;
	private String linked_product;
	private String linked_module;
	private int pms_bug_id;
	private int state;
	private String pms_reason;
	private String pms_update_time;
	private int pms_state;
	private String submit_user;
	private String operator_user;
	private String create_time;
	//用于数据查询
	private PmsProduct pmsProduct;
	private Map<String,Object> pmsModule;
	private PmsUser pmsUser;
	private PmsProject pmsProject;
	
	public PmsProject getPmsProject() {
		return pmsProject;
	}
	public void setPmsProject(PmsProject pmsProject) {
		this.pmsProject = pmsProject;
	}
	public PmsUser getPmsUser() {
		return pmsUser;
	}
	public void setPmsUser(PmsUser pmsUser) {
		this.pmsUser = pmsUser;
	}
	public PmsProduct getPmsProduct() {
		return pmsProduct;
	}
	public void setPmsProduct(PmsProduct pmsProduct) {
		this.pmsProduct = pmsProduct;
	}
	public Map<String, Object> getPmsModule() {
		return pmsModule;
	}
	public void setPmsModule(Map<String, Object> pmsModule) {
		this.pmsModule = pmsModule;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}
	public int getEnv() {
		return env;
	}
	public void setEnv(int env) {
		this.env = env;
	}
	public int getPlatform() {
		return platform;
	}
	public void setPlatform(int platform) {
		this.platform = platform;
	}
	public String getBug_title() {
		return bug_title;
	}
	public void setBug_title(String bug_title) {
		this.bug_title = bug_title;
	}
	public String getError_info_detail() {
		return error_info_detail;
	}
	public void setError_info_detail(String error_info_detail) {
		this.error_info_detail = error_info_detail;
	}
	public String getError_type() {
		return error_type;
	}
	public void setError_type(String error_type) {
		this.error_type = error_type;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public int getDiscovery_probe() {
		return discovery_probe;
	}
	public void setDiscovery_probe(int discovery_probe) {
		this.discovery_probe = discovery_probe;
	}
	public String getLinked_product() {
		return linked_product;
	}
	public void setLinked_product(String linked_product) {
		this.linked_product = linked_product;
	}
	public String getLinked_module() {
		return linked_module;
	}
	public void setLinked_module(String linked_module) {
		this.linked_module = linked_module;
	}
	public int getPms_bug_id() {
		return pms_bug_id;
	}
	public void setPms_bug_id(int pms_bug_id) {
		this.pms_bug_id = pms_bug_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getPms_reason() {
		return pms_reason;
	}
	public void setPms_reason(String pms_reason) {
		this.pms_reason = pms_reason;
	}
	public String getPms_update_time() {
		return pms_update_time;
	}
	public void setPms_update_time(String pms_update_time) {
		this.pms_update_time = pms_update_time;
	}
	public int getPms_state() {
		return pms_state;
	}
	public void setPms_state(int pms_state) {
		this.pms_state = pms_state;
	}
	public String getSubmit_user() {
		return submit_user;
	}
	public void setSubmit_user(String submit_user) {
		this.submit_user = submit_user;
	}
	public String getOperator_user() {
		return operator_user;
	}
	public void setOperator_user(String operator_user) {
		this.operator_user = operator_user;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
}
