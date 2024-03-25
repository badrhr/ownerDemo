package org.xproce.demoorm2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.xproce.demoorm2.dao.entities.Owner;
import org.xproce.demoorm2.dao.repositories.OwnerRepository;
import java.util.List;


@Service
public class OwnerService implements OwnerManager {
    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Owner addWoner(Owner owner) {
        try {
            return ownerRepository.save(owner);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }
    }

    @Override
    public Owner updateWoner(Owner owner) {
        return null;
    }

    @Override
    public boolean deleteOwner(Owner owner) {
        return false;
    }

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }
}
