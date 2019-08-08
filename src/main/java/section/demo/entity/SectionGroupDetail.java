package section.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="section_group_detail")
public class SectionGroupDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter private long id;

    @ManyToOne()
    @JoinColumn(name="id_section_group")
    @JsonBackReference
    @Getter @Setter private SectionGroup sectionGroup;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_section")
    @JsonBackReference
    @Getter @Setter private Section section;

    @Column(name="order_no")
    @Getter @Setter private Long orderNo;
}
