/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Timothy
 */
public class RandomMsgGenerator implements MessageGenerator {
    private List<String> messageList;
    
    public RandomMsgGenerator() {
        messageList = new ArrayList<String>();
        messageList.add("Hello World");
        messageList.add("Testing 123");
        messageList.add("New Random Message");
        
    }
    
    @Override
    public void addMessage(String msg) {
        messageList.add(msg);
        Set<String> noDupes = new LinkedHashSet<String>(messageList);
        messageList = new ArrayList<String>(noDupes);
    }
    
    @Override
    public String getMessage() {
        Random r = new Random((System.nanoTime()));
        int n = r.nextInt(messageList.size());
        return messageList.get(n);
    }
    
    @Override
    public List<String> getMessageList() {
        return messageList;
    }

    @Override
    public void setMessageList(List<String> messageList) {
        this.messageList = messageList;
    }
}
