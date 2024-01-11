package com.telusko.service;

import com.telusko.bo.VaccineDetails;

public interface IVaccineManagement 
{
     public String registerVaccineDetails(VaccineDetails vaccine);
     public Iterable<VaccineDetails> registerMultipleVaccineDetails(Iterable<VaccineDetails> vaccineList);
     public Long getVaccinesCount();
     public Boolean checkAvailability(Long id);
     public Iterable<VaccineDetails> getAllVaccineInfo();
     public Iterable<VaccineDetails> getAllVaccineInfoByIds(Iterable<Long> idList);
     
}
