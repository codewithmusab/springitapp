package com.mtechlab.springitapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Comment extends  Auditable {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;
    // link
    @ManyToOne
    private  Link link ;
}



