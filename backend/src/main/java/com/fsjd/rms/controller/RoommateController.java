package com.fsjd.rms.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fsjd.rms.model.RMSResponseModel;
import com.fsjd.rms.model.Roommate;
import com.fsjd.rms.service.RoommateService;
import com.fsjd.rms.util.RMSException;

public class RoommateController {
	
	private static final Logger LOG = LogManager.getLogger(RoommateController.class);
	
	private RoommateService rmtService = new RoommateService();
	private RMSResponseModel response = new RMSResponseModel();
	private String test;
	
	public RMSResponseModel addRoommate(Roommate rmt) {
		LOG.debug("Inside RoommateController addRoommate()");
		try {
			response = rmtService.addRoommate(rmt);
		} catch (RMSException e) {
			response.setStatus(false);
			response.setResult("Error: " + e.getMessage());
			LOG.error("Exception: %s ", e.getMessage());
		}
		return response;
	}

	public RMSResponseModel searchRoommate(int no) {
		try {
			response = rmtService.searchRoommate(no);
		}
		catch (RMSException e) {
			response.setStatus(false);
			response.setResult("Error: " + e.getMessage());
			LOG.error("Exception: %s ", e.getMessage());
		}
		return response;
	}
	
	public RMSResponseModel getAllRoommates() throws RMSException {
		try {
			response = rmtService.getAllRoommates();
		}
		catch (RMSException e) {
			response.setStatus(false);
			response.setResult("Error: " + e.getMessage());
			LOG.error("Exception: %s ", e.getMessage());
		}
		return response;
	}
	
	public RMSResponseModel editRoommate(Roommate rmt) {
		try {
			response = rmtService.editRoommate(rmt);
		}
		catch (RMSException e) {
			response.setStatus(false);
			response.setResult("Error: " + e.getMessage());
			LOG.error("Exception: %s ", e.getMessage());
		}
		return response;
	}
	
	public RMSResponseModel deleteRoommate(int rmtNo) {
		try {
			response = rmtService.deleteRoommate(rmtNo);
		}
		catch (RMSException e) {
			response.setStatus(false);
			response.setResult("Error: " + e.getMessage());
			LOG.error("Exception: %s ", e.getMessage());
		}
		return response;
	}
	
}
