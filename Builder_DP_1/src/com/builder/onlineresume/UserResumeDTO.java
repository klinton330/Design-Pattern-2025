package com.builder.onlineresume;

//This will act as immutable class
public class UserResumeDTO implements ResumeDTO {
	
	private String name;
	private String contactDetails;
	private String address;
	private String workExperience;
	private String education;
	private String hobby;
	
	
	public UserResumeDTO(String name, String contactDetails, String address, String workExperience, String education,
			String hobby) {
		super();
		this.name = name;
		this.contactDetails = contactDetails;
		this.address = address;
		this.workExperience = workExperience;
		this.education = education;
		this.hobby = hobby;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getContactDetails() {
		return contactDetails;
	}

	@Override
	public String getAddress() {
		return address;
	}

	@Override
	public String getWorkExperience() {
		return workExperience;
	}

	@Override
	public String getEducation() {
		return education;
	}

	@Override
	public String getHobby() {
		return hobby;
	}

	@Override
	public String toString() {
		return "UserResumeDTO [name=" + name + ", contactDetails=" + contactDetails + ", address=" + address
				+ ", workExperience=" + workExperience + ", education=" + education + ", hobby=" + hobby + "]";
	}
	
	

}
