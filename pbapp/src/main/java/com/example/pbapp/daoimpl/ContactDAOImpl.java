package com.example.pbapp.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.pbapp.dao.BaseDAO;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.rowmapper.ContactRowMapper;

@Repository
public class ContactDAOImpl extends BaseDAO implements ContactDAO {

	public void save(Contact contact) {
		String sql = "INSERT INTO contacts(userid,name,phone,groupname) VALUES(:userid, :name, :phone, :groupname)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userid", contact.getUserId());
		params.put("name", contact.getName());
		params.put("phone", contact.getPhone());
		params.put("groupname", contact.getGroupName());
		SqlParameterSource paramSource = new MapSqlParameterSource(params);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		getNamedParameterJdbcTemplate().update(sql, paramSource, keyHolder);
		Integer id = keyHolder.getKey().intValue();
		contact.setId(id);
	}

	public void update(Contact contact) {

		String sql = "UPDATE contacts SET name=:name, address = :address , email = :email,remark =:remark,updated_at = :updated_at where id=:id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", contact.getName());
		params.put("address", contact.getAddress());
		params.put("email", contact.getEmail());
		params.put("remark", contact.getRemark());
		params.put("updated_at", contact.getUpdated_at());
		params.put("id", contact.getId());

		SqlParameterSource paramSource = new MapSqlParameterSource(params);
		getNamedParameterJdbcTemplate().update(sql, paramSource);

	}

	public void delete(Integer contactId) {
		String sql = "DELETE FROM contacts WHERE id=?";
		getJdbcTemplate().update(sql, contactId);

	}

	public void delete(Contact contact) {
		this.delete(contact.getId());
	}

	public Contact findById(Integer contactId) {
		String sql = "SELECT * FROM contacts WHERE id = ?";
		Contact contact = getJdbcTemplate().queryForObject(sql, new ContactRowMapper(), contactId);
		return contact;

	}

	public List<Contact> findAll() {
		String sql = "SELECT * FROM contacts";
		List<Contact> contacts = getJdbcTemplate().query(sql, new ContactRowMapper());
		return contacts;
	}

	public List<Contact> findByProperty(String propertyName, Object propertyValue) {
		String sql = "SELECT * FROM contacts where " + propertyName + "=?";
		List<Contact> contacts = getJdbcTemplate().query(sql, new ContactRowMapper(), propertyValue);
		return contacts;

	}

}
