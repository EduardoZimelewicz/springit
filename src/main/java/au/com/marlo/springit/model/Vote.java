package au.com.marlo.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Data
public class Vote {
    private long id;
    private int vote;
}
