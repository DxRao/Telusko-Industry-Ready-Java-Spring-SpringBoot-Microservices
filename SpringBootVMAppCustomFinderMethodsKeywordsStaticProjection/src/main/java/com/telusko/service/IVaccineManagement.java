package com.telusko.service;

import java.util.Collection;
import java.util.List;

import com.telusko.view.ResultView;
import com.telusko.bo.VaccineDetails;

public interface IVaccineManagement 
{
	public  List<ResultView> fetchByPriceLessThan(Integer price);
}
