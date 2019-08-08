package section.demo.service.section;

import section.demo.entity.Section;
import section.demo.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {
    @Autowired
    SectionRepository sectionRepository;

    @Override
    public Section getSection(Long id) {
        return sectionRepository.findById(id).get();
    }

    @Override
    public List<Section> getAllSection() {
        return sectionRepository.findAll();
    }

    @Override
    public Section addSection(Section section) {
        return sectionRepository.save(section);
    }

    @Override
    public Section editSection(Section section, Long id) {
        section.setId(id);
        return sectionRepository.save(section);
    }

    @Override
    public void deleteSection(Long id) {
        sectionRepository.deleteById(id);
    }
}
