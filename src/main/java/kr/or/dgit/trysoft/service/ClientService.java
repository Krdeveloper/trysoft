package kr.or.dgit.trysoft.service;

import javax.swing.JOptionPane;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.trysoft.AddClient;
import kr.or.dgit.trysoft.dao.ClientMapper;
import kr.or.dgit.trysoft.dao.ClientMapperImpl;
import kr.or.dgit.trysoft.dto.Client;
import kr.or.dgit.trysoft.util.MybatisSqlSessionFactory;



public class ClientService {
	private AddClient addClient;
	
	
	/*public void setAddClient(AddClient addClient) {
		this.addClient = addClient;
	}*/

	public int insertClient (Client client) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			ClientMapper clientMapper = new ClientMapperImpl(sqlSession);
			int res = clientMapper.insertClient(client);
			sqlSession.commit();
			return res;
		}
	}
	
	/*public void insertSale(){
		if (addClient.validCheck()){
			Client newItem = addClient.getItem();
			if (-1==Client.getInstance().insertSale(newItem)){
				JOptionPane.showMessageDialog(null, "입력 실패");
			}else{
				JOptionPane.showMessageDialog(null, "입력 성공");
			}
			AddClient.clearField(true);
			AddClient.enableField(true);
			
		}
	}*/
	
	
}
