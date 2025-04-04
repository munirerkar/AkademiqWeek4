package service;

import entity.Technology;
import repository.abstracts.TechnologyRepository;

import java.util.List;

public class TechnologyManager implements TechnologyRepository {
    TechnologyRepository repository;

    public TechnologyManager(TechnologyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Technology technology) {
        for (var item : repository.GetAll()) {
            if (technology.getId() == item.getId()) {
                System.out.println("Bu teknoloji idsi mevcut farklı id girin");
                break;
            } else{
                repository.add(technology);
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public void update() {
        repository.update();
    }

    @Override
    public void GetById(int id) {
        repository.GetById(id);
    }

    @Override
    public List<Technology> GetAll() {
        return repository.GetAll();
    }
}
