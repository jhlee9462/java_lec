package com.edu.controller;

import java.util.ArrayList;

import com.edu.dao.MemberDAO;
import com.edu.entity.MemberEntity;
import com.edu.view.MemberView;

public class MemberController {
	
	private MemberDAO dao = new MemberDAO();
	private MemberView mv = new MemberView();

	public MemberController() {
	}
	
	public void getMemberList() {
		ArrayList<MemberEntity> list = dao.getMemberList();
		for (MemberEntity entity : list) {
			mv.view(entity);
		}
	}
	
	public void getMember(String name) {
		mv.view(dao.getMember(name));
	}
	
	public void insertMember(MemberEntity ob) {
		dao.insertMember(ob);
	}
	
	public void DeleteMember(String name) {
		dao.deleteMemeber(name);
	}
	
}
