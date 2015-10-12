package org.foo.mapper;

import org.foo.types.ClassDto;
import org.foo.types.ClassVo;
import org.mapstruct.Mapper;

@Mapper(uses = EnumClassMapper.class)
public abstract class AMapper { // here I get the posted NPE-Message within eclipse

    public abstract ClassDto toDto(ClassVo vo);
    
    // Enable the following mapping breaks the command-line-build
    //    @Mapping(target = "otherCl", source = "cl")
    //    public abstract OtherClassDto toOtherDto(OtherClassVo vo);
    
}
