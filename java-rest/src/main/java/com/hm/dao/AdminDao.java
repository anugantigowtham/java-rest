package com.hm.dao;

import java.sql.Connection;

import com.hm.database.JDBCUtil;
import com.hm.vo.UserVo;

public class AdminDao {

	private Connection con;
	public boolean addUser(UserVo user){
		JDBCUtil dbcon=new JDBCUtil();
		try {
			con= dbcon.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return true;
	}
	
}
