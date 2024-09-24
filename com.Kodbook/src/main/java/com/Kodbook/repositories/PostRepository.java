package com.Kodbook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kodbook.entities.Post;

public interface PostRepository extends JpaRepository<Post,Long>{

}
