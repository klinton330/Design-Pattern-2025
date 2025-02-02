package com.simpledesign;

public class PostFactory {

	public static Post createPost(String postType) {
		switch (postType) {
		case "blog":
			return new BlogPost();
		case "news":
			return new NewsPost();
		case "product":
			return new ProductPost();
		default:
		  throw new IllegalArgumentException("INVALID OBJECT TYPE");
		}

	}
}
