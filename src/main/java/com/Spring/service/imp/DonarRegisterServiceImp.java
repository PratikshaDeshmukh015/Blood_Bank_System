package com.Spring.service.imp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.DonarRegister;
import com.Spring.repositroy.DonarRegisterRepo;
import com.Spring.service.DonarRegisterService;

@Service
public class DonarRegisterServiceImp implements DonarRegisterService {

    @Autowired
    private DonarRegisterRepo donorRepository;

    @Override
    public DonarRegister saveDonor(DonarRegister donor) {
        return donorRepository.save(donor);
    }

    @Override
    public List<DonarRegister> getAllDonors() {
        return donorRepository.findAll();
    }
    
    @Override
    public DonarRegister getDonorByCredentials(String userName, String password) {
        return donorRepository.findByUsernameAndPassword(userName, password);
    
    }


// ✅ Update donor
    @Override
    public DonarRegister updateDonor(DonarRegister updatedDonor) {
        Optional<DonarRegister> existingOptional = donorRepository.findById(updatedDonor.getId());

        if (existingOptional.isPresent()) {
            DonarRegister existingDonor = existingOptional.get();

            // Update allowed fields
            existingDonor.setEmail(updatedDonor.getEmail());
            existingDonor.setPhone(updatedDonor.getPhone());
            existingDonor.setAge(updatedDonor.getAge());
            existingDonor.setUnits(updatedDonor.getUnits());
            existingDonor.setBloodGroup(updatedDonor.getBloodGroup());

            return donorRepository.save(existingDonor);
        } else {
            throw new RuntimeException("Donor not found with ID: " + updatedDonor.getId());
       }
    }
    
    @Override
    public boolean deleteDonorById(Long id) {
        if (donorRepository.existsById(id)) {
            donorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}