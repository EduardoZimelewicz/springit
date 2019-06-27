package au.com.marlo.springit.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@RequiredArgsConstructor
@Data
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String body;

    @NonNull
    @ManyToOne
    private Link link;
}
