package com.fsjd.rms.service;

import com.fsjd.rms.dao.RoommateDAO;
import com.fsjd.rms.daoimpl.RoommateCacheDAOImpl;
import com.fsjd.rms.model.RMSResponseModel;
import com.fsjd.rms.model.Roommate;
import com.fsjd.rms.util.RMSException;

public class RoommateService {
	
	private RoommateDAO rmtDao = new RoommateCacheDAOImpl();
	
	public RMSResponseModel addRoommate(Roommate rmt) throws RMSException {
		return rmtDao.addRoommate(rmt);
	}

	public RMSResponseModel searchRoommate(int no) throws RMSException {
		return rmtDao.searchRoommate(no);
	}
	
	public RMSResponseModel getAllRoommates() throws RMSException {
		return rmtDao.getAllRoommates();
	}
	
	public RMSResponseModel editRoommate(Roommate rmt) throws RMSException {
		return rmtDao.editRoommate(rmt);
	}
	
	public RMSResponseModel deleteRoommate(int rmtNo) throws RMSException {
		return rmtDao.deleteRoommate(rmtNo);
	}
}
