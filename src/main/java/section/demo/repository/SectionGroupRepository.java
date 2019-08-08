package section.demo.repository;

import section.demo.entity.SectionGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionGroupRepository extends JpaRepository<SectionGroup, Long> {
}
