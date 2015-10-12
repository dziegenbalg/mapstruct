package org.foo.types;

public abstract class AbstractClassVo<E extends AbstractClass> {
    
    private E cl;
    
    public E getCl() {
        return cl;
    }
    
    public void setCl(final E cl) {
        this.cl = cl;
    }
}
