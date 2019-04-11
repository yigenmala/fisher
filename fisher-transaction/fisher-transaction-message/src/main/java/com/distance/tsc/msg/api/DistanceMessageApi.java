package com.distance.tsc.msg.api;

import com.distance.tsc.msg.dto.MessageLogDto;


public interface DistanceMessageApi {


    @PostMapping("message/saveMessageWaitingConfirm")
    String  saveMessageWaitingConfirm(@RequestBody MessageLogDto messageLogDto);

    @PostMapping("message/confirmAndSendMessage/{messageId}")
    boolean confirmAndSendMessage(@PathVariable("messageId") String messageId);

    @PostMapping("message/consumerSuccess/{messageId}")
    boolean consumerSuccess(@PathVariable("messageId") String messageId);

    @RequestMapping("message/reSendMessageByMessageId")
    boolean reSendMessageByMessageId(@RequestParam("messageId") String messageId);


}
