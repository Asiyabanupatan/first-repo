package com.Kodbook.services;

import java.util.List;

import com.Kodbook.entities.Post;

public interface PostService {

	void createPost(Post post);
	
	List<Post>getAllPosts();

}
