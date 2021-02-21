package com.bank.dal;

import com.bank.domain.Account;

public interface AccountDAO {
	
	public Account getById(int id);
	public int create(Account account);
	public void update(Account account);
	public void delete(int id);

}
