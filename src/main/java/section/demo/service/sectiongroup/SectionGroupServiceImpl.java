package section.demo.service.sectiongroup;

import section.demo.entity.SectionGroup;
import section.demo.repository.SectionGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionGroupServiceImpl implements SectionGroupService{
    @Autowired
    SectionGroupRepository sectionGroupRepository;

    @Override
    public List<SectionGroup> getAllSectionGroup() {
        return sectionGroupRepository.findAll();
    }

    @Override
    public SectionGroup getSectionGroup(Long id) {
        return sectionGroupRepository.findById(id).get();
    }

    @Override
    public SectionGroup addSectionGroup(SectionGroup sectionGroup) {
        return sectionGroupRepository.save(sectionGroup);
    }

    @Override
    public SectionGroup editSectionGroup(SectionGroup sectionGroup, Long id) {
        sectionGroup.setId(id);
        return sectionGroupRepository.save(sectionGroup);
    }

    @Override
    public void deleteSectionGroup(Long id) {
        sectionGroupRepository.deleteById(id);
    }
}
