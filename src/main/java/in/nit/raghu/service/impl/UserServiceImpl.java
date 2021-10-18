package in.nit.raghu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.raghu.model.User;
import in.nit.raghu.repo.UserRepository;
import in.nit.raghu.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		user =repo.save(user);
		return user.getUid();
	}

}
