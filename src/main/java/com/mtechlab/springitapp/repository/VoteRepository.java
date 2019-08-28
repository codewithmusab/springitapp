package com.mtechlab.springitapp.repository;

import com.mtechlab.springitapp.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository  extends JpaRepository<Vote,Long> {
}
