package au.com.marlo.springit.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
public class Vote extends Auditable{

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private short direction;

    @NonNull
    @ManyToOne
    private Link link;
}
