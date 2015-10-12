package org.foo.types;

public class ClassDto {
    
    private EnumClass cl;
    private String desc;
    
    public EnumClass getCl() {
        return cl;
    }
    
    public void setCl(final EnumClass cl) {
        this.cl = cl;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(final String desc) {
        this.desc = desc;
    }
}
