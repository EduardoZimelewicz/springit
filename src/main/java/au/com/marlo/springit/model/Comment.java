package au.com.marlo.springit.model;

import au.com.marlo.springit.service.BeanUtil;
import lombok.*;
import org.ocpsoft.prettytime.PrettyTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Comment extends Auditable {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String body;

    @NonNull
    @ManyToOne
    private Link link;

    public String getPrettyTime() {
        PrettyTime pt = BeanUtil.getBean(PrettyTime.class);
        return pt.format(convertToDateViaInstant(getCreationDate()));
    }

    private Date convertToDateViaInstant(LocalDateTime dateToConvert) {
        return java.util.Date.from(dateToConvert.atZone(ZoneId.systemDefault()).toInstant());
    }
}
