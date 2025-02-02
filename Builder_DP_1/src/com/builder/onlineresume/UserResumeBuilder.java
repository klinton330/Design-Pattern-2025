package com.builder.onlineresume;

public class UserResumeBuilder implements ResumeBuilder {

	private String name;
	private String contactDetails;
	private String address;
	private String workExperience;
	private String education;
	private String hobby;
	private ResumeDTO resumeDTO;
	
	@Override
	public ResumeBuilder withName(String name) {
		this.name=name;
		return this;
	}

	@Override
	public ResumeBuilder withContactDetails(String contactdetails) {
		this.contactDetails=contactdetails;
		return this;
	}

	@Override
	public ResumeBuilder withAddress(String address) {
		this.address=address;
		return this;
	}

	@Override
	public ResumeBuilder withWorkExperience(String wexp) {
		this.workExperience=wexp;
		return this;
	}

	@Override
	public ResumeBuilder withEducation(String edu) {
		this.education=edu;
		return this;
	}

	@Override
	public ResumeBuilder withhobbies(String hobbies) {
		this.hobby=hobbies;
		return this;
	}

	@Override
	public ResumeDTO build() {
		resumeDTO=new UserResumeDTO(name, contactDetails, address, workExperience, education, hobby);
		return resumeDTO;
	}

}
