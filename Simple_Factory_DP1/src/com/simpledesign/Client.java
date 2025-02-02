package com.simpledesign;

public class Client {
	public static void main(String[] args) {

		// Post post= new NewsPost();
		Post post = PostFactory.createPost("news");
		System.out.println(post);

		// To Access News Post method downcast it
		if (post instanceof NewsPost) {
			NewsPost newspost = (NewsPost) post;
			newspost.getNewsTime();
		}
	}
}
