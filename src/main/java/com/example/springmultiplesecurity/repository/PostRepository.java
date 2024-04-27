package com.example.springmultiplesecurity.repository;

import com.example.springmultiplesecurity.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Integer> {
}
