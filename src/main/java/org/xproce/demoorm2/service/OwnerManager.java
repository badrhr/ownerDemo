package org.xproce.demoorm2.service;

import org.xproce.demoorm2.dao.entities.Owner;

import java.util.List;

public interface OwnerManager {

    public Owner addWoner(Owner owner);
    public Owner updateWoner(Owner owner);
    public boolean deleteOwner(Owner owner);
    public List<Owner> getAllOwners();
}
