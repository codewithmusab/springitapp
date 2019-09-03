package com.mtechlab.springitapp.repository;

import com.mtechlab.springitapp.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository  extends JpaRepository<Link, Long> {
Link findByTitle(String title);
}
