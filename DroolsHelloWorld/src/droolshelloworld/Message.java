/*
* Drools 5.1 – Hello World Example
* Author: Vishal Akhouri
* Twitter: @VishalAkhouri
*/
package droolshelloworld;

/**
*
* @author vishal akhouri
*/

public class Message {
private String type;
private String msgtext;

/**
* @return the type
*/
public String getType() {
return type;
}

/**
* @param type the type to set
*/
public void setType(String type) {
this.type = type;
}

/**
* @return the msgtext
*/
public String getMsgtext() {
return msgtext;
}

/**
* @param msgtext the msgtext to set
*/
public void setMsgtext(String msgtext) {
this.msgtext = msgtext;
}
}