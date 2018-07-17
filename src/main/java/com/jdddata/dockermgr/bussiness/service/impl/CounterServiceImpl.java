package com.jdddata.dockermgr.bussiness.service.impl;

import com.jdddata.dockermgr.bussiness.controller.dto.CounterDto;
import com.jdddata.dockermgr.bussiness.service.ICounterService;
import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements ICounterService {

    @Override
    public String createCounter(CounterDto counterDto) {
        return null;
    }
}
