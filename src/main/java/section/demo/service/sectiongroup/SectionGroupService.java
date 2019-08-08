package section.demo.service.sectiongroup;

import section.demo.entity.SectionGroup;

import java.util.List;

public interface SectionGroupService {
    List<SectionGroup> getAllSectionGroup();
    SectionGroup getSectionGroup(Long id);
    SectionGroup addSectionGroup(SectionGroup sectionGroup);
    SectionGroup editSectionGroup(SectionGroup sectionGroup, Long id);
    void deleteSectionGroup(Long id);
}
