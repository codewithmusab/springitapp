package com.mtechlab.springitapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity

public class Vote {
    @Id
    @GeneratedValue
    private Long id;
    private  int vote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public  Vote(){

    }
    // user
    //link


    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", vote=" + vote +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote1 = (Vote) o;
        return getVote() == vote1.getVote() &&
                getId().equals(vote1.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVote());
    }
}
