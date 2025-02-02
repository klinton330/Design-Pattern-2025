package com.builder.onlineresume;

public class Client {

	public static void main(String[] args) {

		Resume resume = createResume();
		ResumeBuilder resumeBuilder = new UserResumeBuilder();
		ResumeDTO resumeDTO = buildResume(resumeBuilder, resume);
		System.out.println(resumeDTO);
	}

	//This method acts  as Director
	private static ResumeDTO buildResume(ResumeBuilder resumeBuilder, Resume resume) {
		return resumeBuilder.withName(resume.getName())
				.withAddress(resume.getAddress())
				.withContactDetails(resume.getContactDetails())
				.withEducation(resume.getEducation())
				.withhobbies(resume.getHobby())
				.withWorkExperience(resume.getWorkExperience())
				.build();
	}

	public static Resume createResume() {
		Resume resume = new Resume();
		resume.setName("Hari");
		resume.setAddress("chennai");
		resume.setContactDetails("7550127370");
		resume.setEducation("Engineering");
		resume.setHobby("cricket");
		resume.setWorkExperience("4 years");
		return resume;
	}

}
