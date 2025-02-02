package com.buillder;

public class Client {
	public static void main(String[] args) {

		Resume resume = new Resume.Resumebuilder()
				.setName("Lotus")
				.setEducation("MBA")
				.setContactDetails("7550127370")
				.setHobby("Swimming")
				.setWorkExperience("4 Yrs")
				.build();
		System.out.println(resume);
	}
}


