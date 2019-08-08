package section.demo.controller;

import section.demo.entity.SectionGroup;
import section.demo.service.sectiongroup.SectionGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/section-group")
public class SectionGroupController {
    @Autowired
    SectionGroupService sectionGroupService;

    public SectionGroupController(SectionGroupService sectionGroupService){ this.sectionGroupService = sectionGroupService; }

    @GetMapping
    public List<SectionGroup> getAllSectionGroup(){
        return sectionGroupService.getAllSectionGroup();
    }

    @GetMapping("/{id}")
    public SectionGroup getSectionGroup(@PathVariable("id") Long id){
        return sectionGroupService.getSectionGroup(id);
    }

    @PostMapping()
    public SectionGroup addSectionGroup(@RequestBody SectionGroup sectionGroup){
        return sectionGroupService.addSectionGroup(sectionGroup);
    }

    @PutMapping("/{id}")
    public SectionGroup editSectionGroup(@RequestBody SectionGroup sectionGroup,
                                         @PathVariable("id") Long id){
        sectionGroup.setId(id);
        return sectionGroupService.editSectionGroup(sectionGroup, id);
    }

    @DeleteMapping("/{id}")
    public void deleteSectionGroup(@PathVariable("id") Long id){
        sectionGroupService.deleteSectionGroup(id);
    }
}
