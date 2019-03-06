package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MyPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String deleteFlg;
	private String result;
	public String execute() throws SQLException{
		MyPageDAO mypageDAO = new MyPageDAO();
		MyPageDTO mypageDTO = new MyPageDTO();

		if(deleteFlg == null){
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();

			myPageDTO = myPageDAO.getMypageUserInfo(item_transaction_id,user_master_id);
			session.put("buyItem_name", myPageDTO.getItemName());





		}else if(deleteFlg.equals("1")){
			delete();
		}
		result = SUCCESS;
		return result;

	}

}
