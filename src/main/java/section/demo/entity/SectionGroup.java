package section.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="section_group")
@Setter
@Getter
public class SectionGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="section_group_name")
    private String sectionGroupName;

    @OneToMany(mappedBy = "sectionGroup")
    @JsonManagedReference
    @JsonIgnore
    Set<SectionGroupDetail> sectionGroupDetailSet;
}
