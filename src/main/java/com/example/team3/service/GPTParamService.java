package com.example.team3.service;

import com.example.team3.Model.GPTParam;
import com.example.team3.repository.GPTParamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GPTParamService {
    @Autowired
    GPTParamRepository gptParamRepository;

    public void save(GPTParam gptParam){
        gptParamRepository.save(gptParam);
    }

}
