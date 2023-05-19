package com.example.team3.service;

import com.example.team3.Model.ELK;
import com.example.team3.Model.GPTParam;
import com.example.team3.repository.GPTParamRepository;
import com.example.team3.repository.IotUploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GPTParamService {
    @Autowired
    GPTParamRepository gptParamRepository;
    IotUploadRepository iotUploadRepository;

    public void save(GPTParam gptParam){
        gptParamRepository.save(gptParam);
    }
    public ELK findClosestELKObject() {
        return iotUploadRepository.findFirstByOrderByElkTimeAsc();
    }
}
