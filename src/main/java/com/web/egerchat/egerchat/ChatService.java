package com.web.egerchat.egerchat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

	@Autowired
	private ChatRepository chatrepo;

	public void delete(Long id) {
		chatrepo.deleteById(id);
	}

	public Chat get(Long id) {
		return chatrepo.findById(id).get();

	}

	public List<Chat> listAll() {

		return chatrepo.findAll();
	}

	public void save(Chat chat) {
		chatrepo.save(chat);
	}

}
