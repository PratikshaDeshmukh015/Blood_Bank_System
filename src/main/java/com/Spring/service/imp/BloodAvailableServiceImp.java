package com.Spring.service.imp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.BloodAvailable;
import com.Spring.repositroy.BloodAvailableRepo;
import com.Spring.repositroy.RequestRepo;
import com.Spring.service.BloodAvailableService;

import java.util.*;

@Service
public class BloodAvailableServiceImp implements BloodAvailableService {

    @Autowired
    private BloodAvailableRepo donorRepo;

    @Autowired
    private RequestRepo requestRepo;

    @Override
    public List<BloodAvailable> getAvailableBloodUnits() {
        Map<String, Integer> donated = new HashMap<>();
        Map<String, Integer> requested = new HashMap<>();

        for (Object[] obj : donorRepo.getTotalDonatedUnits()) {
            String group = (String) obj[0];
            Long units = (Long) obj[1];
            donated.put(group, units.intValue());
        }

        for (Object[] obj : requestRepo.getTotalRequestedUnits()) {
            String group = (String) obj[0];
            Long units = (Long) obj[1];
            requested.put(group, units.intValue());
        }

        Set<String> allGroups = new HashSet<>();
        allGroups.addAll(donated.keySet());
        allGroups.addAll(requested.keySet());

        List<BloodAvailable> list = new ArrayList<>();

        for (String group : allGroups) {
            int available = donated.getOrDefault(group, 0) - requested.getOrDefault(group, 0);
            list.add(new BloodAvailable(group, available));
        }

        return list;
    }
}
