package org.foo.types;

public class OtherClassDto {
    
    private OtherEnumClass otherCl;
    private String desc;
    
    public OtherEnumClass getOtherCl() {
        return otherCl;
    }
    
    public void setOtherCl(final OtherEnumClass otherCl) {
        this.otherCl = otherCl;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(final String desc) {
        this.desc = desc;
    }
}
