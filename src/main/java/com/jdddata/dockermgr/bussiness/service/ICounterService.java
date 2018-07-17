package com.jdddata.dockermgr.bussiness.service;

import com.jdddata.dockermgr.bussiness.controller.dto.CounterDto;

public interface ICounterService {
    String createCounter(CounterDto counterDto);
}
