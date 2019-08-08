package section.demo.controller;

import section.demo.entity.Section;
import section.demo.service.section.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/section")
public class SectionController {
    @Autowired
    SectionService sectionService;

    public SectionController(SectionService sectionService){this.sectionService = sectionService;}

    @GetMapping()
    public List<Section> getAllSection(){ return sectionService.getAllSection();}

    @GetMapping("/{id}")
    public Section getSection(@PathVariable("id") Long id){ return sectionService.getSection(id); }

    @PostMapping()
    public Section addSection(@RequestBody Section section){ return sectionService.addSection(section); }

    @PutMapping("/{id}")
    public Section editSection(@RequestBody Section section, @PathVariable("id") Long id){ return sectionService.editSection(section, id); }

    @DeleteMapping("/{id}")
    public void deleteSection(@PathVariable("id") Long id){ sectionService.deleteSection(id); }
}
