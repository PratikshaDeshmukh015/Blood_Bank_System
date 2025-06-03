package com.Spring.service;


import java.util.List;

import com.Spring.model.Request;

public interface RequestService {
    Request saveRequest(Request request);
    List<Request> getAllRequests(); 
}

