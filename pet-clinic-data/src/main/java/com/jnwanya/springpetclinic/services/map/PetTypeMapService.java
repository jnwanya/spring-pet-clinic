package com.jnwanya.springpetclinic.services.map;

import com.jnwanya.springpetclinic.model.PetType;
import com.jnwanya.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Jnwanya on
 * Sun, 26 Aug, 2018.
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
      super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
      super.deleteById(aLong);
    }
}
