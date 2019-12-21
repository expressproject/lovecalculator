package com.seleniumexpress.lc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.lc.api.User;
import com.seleniumexpress.lc.api.UserInfoDTO;

@Repository
public class LoveCalculatorDAOImpl implements LoveCalculatorDAO {
	
	@Autowired
	JdbcTemplate JdbcTemplate;

/*	
	@Override
	public OrderDTO saveOrder(OrderDTO order) {
		
		String insertOrder = "insert into Order_Info (Customer_Name,Item_ordered,email,phone_no,address_line_1,address_line_2,Location,pin) Values(?,?,?,?,?,?,?,?)";
		int noOfRowInserted = JdbcTemplate.update(insertOrder,order.getName(),order.getOrderItem(),order.getEmail(),order.getPhoneNo(),order.getAddressLine1(),order.getAddressLine2(),order.getLocation(),order.getPin());
		System.out.println(noOfRowInserted + " row inserted..");
		int orderId = getMaxOrderId();
		JdbcTemplate.update("CALL updateTokenNo(?)",orderId);
		return order;
	}
*/
	@Override
	public List<User> getAllUserRecord(){
	 
		String retriveUserRecordsById = "select * from LOVE_CALCULATOR.love_calculator where userid = '101hardCoded'";
		List<User> user = JdbcTemplate.query(retriveUserRecordsById, new UserHistoryRowMapper());
		return user;
	}
	
	
	public UserInfoDTO saveUserDetail(String userId, String userName, String curshName, String result){
		
		String insertRecord = "INSERT INTO love_calculator(userid,name,crush_name,result) VALUES (?,?,?,?)";
		int noOfRowInserted = JdbcTemplate.update(insertRecord,userId,userName,curshName,result);
		if(noOfRowInserted ==1) {
			System.out.println("1 row inserted..");
		}
		
		
		return null;
	}


	@Override
	public int deleteUserRecordByLcId(int id) {
		String sql = "delete from LOVE_CALCULATOR.love_calculator where lc_id = ?";
		JdbcTemplate.update(sql,id);
		System.out.println("user deleted with id " + id);
		return id;
	}

}
