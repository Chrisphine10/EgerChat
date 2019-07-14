package com.web.egerchat.egerchat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long chatId;
	private String text;

	protected Chat() {

	}

	public Chat(Long chatId, String text) {
		super();
		this.chatId = chatId;
		this.text = text;
	}

	public Long getChatId() {
		return chatId;
	}

	public String getText() {
		return text;
	}

	public void setChatId(Long chatId) {
		this.chatId = chatId;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Chat [chatId=" + chatId + ", text=" + text + "]";
	}

}
