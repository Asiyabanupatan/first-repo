package com.Kodbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Kodbook.entities.Post;
import com.Kodbook.repositories.PostRepository;

@Service
public class PostServiceImplementation implements PostService{
	
	@Autowired
	PostRepository repo;

	@Override
	public void createPost(Post post) {
		repo.save(post);
	}

	@Override
	public List<Post> getAllPosts() {
		return repo.findAll();
	}
	
	

}
