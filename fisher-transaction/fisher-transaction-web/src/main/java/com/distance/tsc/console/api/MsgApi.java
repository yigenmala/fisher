package com.distance.tsc.console.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.distance.tsc.console.client.TransactionMsgServiceClient;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/msg")
public class MsgApi {

    @Autowired
    private TransactionMsgServiceClient transactionMsgServiceClient;

    @RequestMapping("/getMsgByCondtion")
    public Map<String,Object> getMsgByStateAndIsDeadAndIsTimeout(@RequestBody Map<String,Object> param){

        return transactionMsgServiceClient.getMsgByStateAndIsDeadAndIsTimeout(param);
    }

    @PostMapping("/reSendMsg")
    public void getMsgByStateAndIsDeadAndIsTimeout(@RequestParam("messageId") String messageId){
        System.out.println(messageId+"===========");
        transactionMsgServiceClient.reSendMessageByMessageId(messageId);
    }


}
