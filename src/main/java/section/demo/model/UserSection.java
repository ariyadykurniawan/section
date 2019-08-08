package section.demo.model;

import lombok.Setter;
import lombok.Getter;
public class UserSection {

    public UserSection(String moduleName, Integer moduleOrder){
        this.moduleName = moduleName;
        this.moduleOrder = moduleOrder;
    }

    @Setter
    @Getter
    private String moduleName;

    @Setter
    @Getter
    private Integer moduleOrder;
}
