package org.foo.mapper;

import org.foo.types.AbstractClass;

public abstract class AbstractMapper<E extends AbstractClass> {
    
    // Sometimes I get the following message (only within eclipse, command-line-compile works fine):
    // "Can't generate mapping method from non-enum type to enum type."
    public abstract <T extends AbstractClass> E toFeKlasse(final T obj);
    
}
