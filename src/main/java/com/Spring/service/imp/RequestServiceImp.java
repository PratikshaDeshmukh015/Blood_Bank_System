package com.Spring.service.imp;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.Request;
import com.Spring.repositroy.RequestRepo;
import com.Spring.service.RequestService;


@Service
public class RequestServiceImp implements RequestService {

    @Autowired
    private RequestRepo repository;

    @Override
    public Request saveRequest(Request request) {
        return repository.save(request);
    }
    
    @Override
    public List<Request> getAllRequests() {
        return repository.findAll(); // Fetches all records
    }
}
