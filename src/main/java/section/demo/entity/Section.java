package section.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="section")
@Setter
@Getter
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="section_name")
    private String sectionName;

    @OneToMany(mappedBy = "section", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<SectionGroupDetail> sectionGroupDetailSet;
}
