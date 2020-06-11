package com.example.together.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChatResponse {


    //    response
//    response
    @SerializedName("response")
    private List<MessageContent> chatMsgList;

    public List<MessageContent> getChatMsgList() {
        return chatMsgList;
    }



    public static class MessageContent {
        // "sender": "hos",
        // "content": "hi bro"
        private String sender;
        private String content;
        @SerializedName("msg_id")
        private int msgID;
        @SerializedName("sender_id")
        private int senderID;

        public int getMsgID() {
            return msgID;
        }

        public int getSenderID() {
            return senderID;
        }

        public String getSender() {
            return sender;
        }


        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

}
