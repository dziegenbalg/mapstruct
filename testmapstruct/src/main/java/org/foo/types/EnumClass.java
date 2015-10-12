package org.foo.types;

public enum EnumClass implements AbstractClass {
    
    Value1("Key1", "Text1"),
    Value2("Key2", "Text2");
    
    private String key;
    private String text;
    
    private EnumClass(final String key, final String text) {
        this.key = key;
        this.text = text;
        
    }
    
    public String getKey() {
        return key;
    }
    
    public String getText() {
        return text;
    }
    
    public static EnumClass toEnum(final String key) {
        for (EnumClass e : values()) {
            if (e.getKey().equals(key)) {
                return e;
                
            }
        }
        
        return null;
        
    }
}
