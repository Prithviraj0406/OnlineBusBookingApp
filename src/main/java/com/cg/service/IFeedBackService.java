package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.FeedbackDto;
import com.cg.entity.BusOperator10;
import com.cg.entity.Feedback10;


/**************************************************************************
 * 
 * @author Prithviraj V
 * Version: 1.0
 * Description: This is the service layer's IFeedBackService interface
 * Created date: 20-04-2021
 * 
 ****************************************************************************/

@Service
public interface IFeedBackService {
	
	public Feedback10 addFeedback(FeedbackDto feedback);
	
	public List<FeedbackDto> viewAllFeedBacks(String routeName);
	
	public List<FeedbackDto> viewAllFeedBacks(BusOperator10 busoperator);
	
	
}