package section.demo.service.section;

import section.demo.entity.Section;

import java.util.List;

public interface SectionService {
    Section getSection(Long id);
    List<Section> getAllSection();
    Section addSection(Section section);
    Section editSection(Section section, Long id);
    void deleteSection(Long id);
}
