package org.foo.types;

public enum OtherEnumClass implements AbstractClass {
    
    OtherValue1("OtherKey1", "OtherText1"),
    OtherValue2("OtherKey2", "OtherText2");
    
    private String key;
    private String text;
    
    private OtherEnumClass(final String key, final String text) {
        this.key = key;
        this.text = text;
        
    }
    
    @Override
    public String getKey() {
        return key;
    }
    
    @Override
    public String getText() {
        return text;
    }
    
    public static OtherEnumClass toEnum(final String key) {
        for (OtherEnumClass e : values()) {
            if (e.getKey().equals(key)) {
                return e;
                
            }
        }
        
        return null;
        
    }
}
