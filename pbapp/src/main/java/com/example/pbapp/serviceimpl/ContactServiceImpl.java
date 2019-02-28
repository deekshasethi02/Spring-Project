package com.example.pbapp.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.example.pbapp.dao.BaseDAO;
import com.example.pbapp.dao.ContactDAO;
import com.example.pbapp.domain.Contact;
import com.example.pbapp.exception.ContactAlreadyExistsException;
import com.example.pbapp.rowmapper.ContactRowMapper;
import com.example.pbapp.service.ContactService;

@Service
public class ContactServiceImpl extends BaseDAO implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	public void save(Contact contact) throws ContactAlreadyExistsException {
		if(contactDAO.findByProperty("phone",contact.getPhone()).size()>0) {
            throw new ContactAlreadyExistsException("phone number already exist..");
        }else if(contactDAO.findByProperty("name",contact.getName()).size()>0) {
            throw new ContactAlreadyExistsException("Contact name already exist..");
        }
        else {
            contactDAO.save(contact);
        }
		
	}

	public void update(Contact contact) {
		contactDAO.update(contact);
	}

	public void delete(Integer contactId) {
		contactDAO.delete(contactId);
	}

	public void delete(Integer[] contactIds) {
		for (Integer contactId : contactIds) {
			contactDAO.delete(contactId);
		}
	}

	public List<Contact> findUserContact(Integer userId) {
		return contactDAO.findByProperty("userId", userId);
	}

	public List<Contact> findUserContact(Integer userId, String txt) {
		String criteria="%"+txt+"%";
        String sql="select * from contacts where userid =:userid and (name like :name or groupname like :groupname or "
                + "phone like :phone or email like :email or created_by like :created_by or updated_by like :updated_by)";
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("userid",userId);
        map.put("name",criteria);
        map.put("groupname",criteria);
        map.put("phone",criteria);
        map.put("email",criteria);
        map.put("created_by",criteria);
        map.put("updated_by",criteria);
        SqlParameterSource paramMap =new MapSqlParameterSource(map);    
        return getNamedParameterJdbcTemplate().query(sql,paramMap,new ContactRowMapper());
	}

}
