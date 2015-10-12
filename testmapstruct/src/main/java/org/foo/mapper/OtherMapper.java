package org.foo.mapper;

import org.foo.types.OtherClassDto;
import org.foo.types.OtherClassVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = OtherEnumClassMapper.class)
public abstract class OtherMapper {

    // Enable this Mapping --> command-line-build will abort with an exception
    //                     --> posted NPE occures in eclipse
    @Mapping(target = "otherCl", source = "cl")
    public abstract OtherClassDto toOtherDto(OtherClassVo vo);
    
}
