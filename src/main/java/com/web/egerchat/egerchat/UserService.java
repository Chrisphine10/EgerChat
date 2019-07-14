package com.web.egerchat.egerchat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userrepo;

	public void delete(Long id) {
		userrepo.deleteById(id);
	}

	public User get(Long id) {
		return userrepo.findById(id).get();

	}

	public List<User> listAll() {

		return userrepo.findAll();
	}

	public void save(User user) {
		userrepo.save(user);
	}
}
