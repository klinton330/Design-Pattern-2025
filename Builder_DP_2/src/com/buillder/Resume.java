package com.buillder;

public class Resume {
	private String name;
	private String contactDetails;
	private String address;
	private String workExperience;
	private String education;
	private String hobby;
	
	public Resume(Resumebuilder resumebuilder) {
		this.name=resumebuilder.name;
		this.contactDetails=resumebuilder.contactDetails;
		this.address=resumebuilder.address;
		
		this.workExperience=resumebuilder.workExperience;
		this.education=resumebuilder.education;
		this.hobby=resumebuilder.hobby;
	}
	
	@Override
	public String toString() {
		return name+" "+contactDetails+" "+address+" "+workExperience+" "+education+" "+hobby;
	}

	public static class Resumebuilder {

		private String name;
		private String contactDetails;
		private String address;
		private String workExperience;
		private String education;
		private String hobby;

		public Resumebuilder setName(String name) {
			this.name = name;
			return this;
		}

		public Resumebuilder setContactDetails(String contactDetails) {
			this.contactDetails = contactDetails;
			return this;
		}

		public Resumebuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Resumebuilder setWorkExperience(String workExperience) {
			this.workExperience = workExperience;
			return this;
		}

		public Resumebuilder setEducation(String education) {
			this.education = education;
			return this;
		}

		public Resumebuilder setHobby(String hobby) {
			this.hobby = hobby;
			return this;
		}
		
		public Resume build() {
			return new Resume(this);
		}
	}

}
