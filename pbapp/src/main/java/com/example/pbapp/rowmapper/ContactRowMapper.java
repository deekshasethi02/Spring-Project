package com.example.pbapp.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.pbapp.domain.Contact;
import com.example.pbapp.domain.Contact;
/**
 * This UserRowMapper will take input from result set and map each field in the user domain
 * @author deeksha.sethi
 *
 */
public class ContactRowMapper implements RowMapper<Contact> {

	public Contact mapRow(ResultSet rs, int arg1) throws SQLException {
		Contact contact  = new Contact();
		contact.setId(rs.getInt("id"));
		contact.setUserId(rs.getInt("userid"));
		contact.setName(rs.getString("name"));
		contact.setPhone(rs.getString("phone"));
		contact.setGroupName(rs.getString("groupname"));
		contact.setAddress(rs.getString("address"));
		contact.setEmail(rs.getString("email"));
		contact.setRemark(rs.getString("remark"));
		contact.setCreated_at(rs.getDate("created_at"));
		contact.setUpdated_at(rs.getDate("updated_at"));
		
		contact.setCreated_By(rs.getInt("created_by"));
		contact.setUpdated_By(rs.getInt("updated_by"));
		return contact;
	}

}
