package com.wso2telco.workflow.model;

public class ApplicationEditDTO {

	private Integer applicationId;
	private String applicationName;
	private String applicationTier;
	private String existingTier;
	private String user;
	private String sp;

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationTier() {
		return applicationTier;
	}

	public void setApplicationTier(String applicationTier) {
		this.applicationTier = applicationTier;
	}

	public String getExistingTier() { return existingTier; }

	public void setExistingTier(String existingTier) { this.existingTier = existingTier; }

	public String getServiceProvider() { return sp; }

	public void setServiceProvider(String sp) { this.sp = sp; }

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
