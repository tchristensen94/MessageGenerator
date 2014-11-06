/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.List;

/**
 *
 * @author Timothy
 */
public interface MessageGenerator {

    void addMessage(String msg);

    String getMessage();

    List<String> getMessageList();

    void setMessageList(List<String> messageList);
    
}
