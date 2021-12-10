package com.fsjd.rms.dao;

import com.fsjd.rms.model.RMSResponseModel;
import com.fsjd.rms.model.Roommate;
import com.fsjd.rms.util.RMSException;

public interface RoommateDAO {

	public RMSResponseModel addRoommate(Roommate rmt) throws RMSException;

	public RMSResponseModel editRoommate(Roommate rmt) throws RMSException;

	public RMSResponseModel deleteRoommate(int rmtNo) throws RMSException;

	public RMSResponseModel searchRoommate(int rmtNo) throws RMSException;
	
	public RMSResponseModel getAllRoommates() throws RMSException;

}
