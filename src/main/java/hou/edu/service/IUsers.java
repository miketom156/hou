/**
 * 
 */
package hou.edu.service;

import hou.edu.model.Users;

/**
 * @author lyh
 * @Description
 * @date 2015年9月1日
 */
public interface IUsers {
	void addUsers(Users user);

	void deleteUsers(Integer uid);

	Users findUsers(String userName, String password);
	
	void updateUser(Users user);

}
