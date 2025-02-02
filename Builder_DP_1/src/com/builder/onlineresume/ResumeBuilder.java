package com.builder.onlineresume;

public interface ResumeBuilder {
	ResumeBuilder withName(String name);
	ResumeBuilder withContactDetails(String contactdetails);
	ResumeBuilder withAddress(String address);
	ResumeBuilder withWorkExperience(String wexp);
	ResumeBuilder withEducation(String edu);
	ResumeBuilder withhobbies(String hobbies);
	ResumeDTO build();
}
