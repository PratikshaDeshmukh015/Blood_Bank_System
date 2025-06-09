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
    
    @Override
    public Request updateRequest(Long number, Request updatedRequest) {
        Request existingRequest = repository.findById(number).orElse(null);
        if (existingRequest != null) {
            existingRequest.setName(updatedRequest.getName());
            existingRequest.setEmail(updatedRequest.getEmail());
            existingRequest.setBloodGroup(updatedRequest.getBloodGroup());
            existingRequest.setUnits(updatedRequest.getUnits());
            existingRequest.setDate(updatedRequest.getDate());
            existingRequest.setHospital(updatedRequest.getHospital());
            existingRequest.setContact(updatedRequest.getContact());
            return repository.save(existingRequest);
        }
        return null;
    }
    
    @Override
    public boolean deleteRequest(Long number) {
        if (repository.existsById(number)) {
            repository.deleteById(number);
            return true;
        }
        return false;
    }
}


