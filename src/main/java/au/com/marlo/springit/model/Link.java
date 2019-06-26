package au.com.marlo.springit.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@Data
public class Link extends Auditable {

    @Id
    @GeneratedValue
    private long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();
}
