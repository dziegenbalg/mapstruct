package org.foo.mapper;

import org.foo.types.AbstractClass;
import org.foo.types.OtherEnumClass;
import org.mapstruct.Mapper;

@Mapper
public abstract class OtherEnumClassMapper extends AbstractMapper<OtherEnumClass> {

    @Override
    public <T extends AbstractClass> OtherEnumClass toFeKlasse(final T obj) {
        return obj == null ? null : OtherEnumClass.toEnum(obj.getKey());
        
    }
}
