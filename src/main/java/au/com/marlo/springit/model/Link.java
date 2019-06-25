package au.com.marlo.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Data
public class Link  {
    private long id;
    private String title;
    private String url;
}