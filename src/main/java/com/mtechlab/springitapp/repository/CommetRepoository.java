package com.mtechlab.springitapp.repository;

import com.mtechlab.springitapp.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommetRepoository extends JpaRepository<Comment,Long> {
}
