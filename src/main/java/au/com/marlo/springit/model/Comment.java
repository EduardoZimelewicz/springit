package au.com.marlo.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class Comment {

    @Id
    @GeneratedValue
    private long id;
    @NonNull
    private String body;

    @ManyToOne
    private Link link;
}
