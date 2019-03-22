package com.example.botui;

public class ResponseMessage
{
    String textMsg;
    Boolean isMe;

    public ResponseMessage(String textMsg, Boolean isMe) {
        this.textMsg = textMsg;
        this.isMe = isMe;
    }

    public String getTextMsg()
    {
        return textMsg;
    }

    public void setTextMsg(String textMsg)
    {
        this.textMsg = textMsg;
    }

    public Boolean getMe()
    {
        return isMe;
    }

    public void setMe(Boolean me)
    {
        isMe = me;
    }
}