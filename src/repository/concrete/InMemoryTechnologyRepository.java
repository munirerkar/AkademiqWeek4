package repository.concrete;

import entity.ProgrammingLanguage;
import entity.Technology;
import repository.abstracts.TechnologyRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTechnologyRepository implements TechnologyRepository {
    private List<Technology> technologies;

    public InMemoryTechnologyRepository() {
        technologies = new ArrayList<>();

        technologies.add(new Technology(1,"AutoMapper",new ProgrammingLanguage(1,"C#")));
    }

    @Override
    public void add(Technology technology) {
        System.out.println("Yeni teknoloji eklendi.");
        technologies.add(technology);
    }

    @Override
    public void deleteAll() {
        technologies.clear();
    }

    @Override
    public void update() {

    }

    @Override
    public void GetById(int id) {
        for (var item: technologies){
            if (item.getId() == id){
                System.out.println("Teknoloji idsi: "+item.getId());
                System.out.println("Teknoloji ismi: "+item.getName());
            }else {
                System.out.println("Bu id mevcut değil");
            }
        }
    }

    @Override
    public List<Technology> GetAll() {
        return technologies;
    }
}
