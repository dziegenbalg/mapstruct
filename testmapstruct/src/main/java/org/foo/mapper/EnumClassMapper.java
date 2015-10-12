package org.foo.mapper;

import org.foo.types.AbstractClass;
import org.foo.types.EnumClass;
import org.mapstruct.Mapper;

@Mapper
public abstract class EnumClassMapper extends AbstractMapper<EnumClass> {

    @Override
    public <T extends AbstractClass> EnumClass toFeKlasse(final T obj) {
        return obj == null ? null : EnumClass.toEnum(obj.getKey());
        
    }
}
