package com.distance.tsc.msg.convert;


import org.mapstruct.factory.Mappers;

import com.distance.tsc.msg.dto.MessageLogDto;
import com.distance.tsc.msg.pojo.MessageLog;



@org.mapstruct.Mapper
public interface MessageConvert {
    MessageConvert MAPPER = Mappers.getMapper(MessageConvert.class);

    MessageLog dtoToPojo(MessageLogDto messageLogDto);

}
