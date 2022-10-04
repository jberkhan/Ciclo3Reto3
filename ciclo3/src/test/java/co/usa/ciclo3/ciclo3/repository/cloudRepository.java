package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.cloud;
import co.usa.ciclo3.ciclo3.repository.crud.cloudCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class cloudRepository {
    @Autowired
    private cloudCrudRepository cloudCrudRepository;
    
    public List<Cloud> getAll(){
        return (List<Cloud>)cloudCrudRepository.findAll();
    }
    public Optional<Cloud> getCloud(int id){
        return cloudCrudRepository.findById(id);
    }
    
    public cloud save(Cloud p){
        return cloudCrudRepository.save(p);
    }
}
