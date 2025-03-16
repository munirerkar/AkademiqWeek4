import entity.ProgrammingLanguage;
import entity.Technology;
import repository.concrete.InMemoryTechnologyRepository;
import service.TechnologyManager;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TechnologyManager technologyManager = new TechnologyManager(new InMemoryTechnologyRepository());
        List<Technology> technologies = technologyManager.GetAll();
        short choice = 8;
        int tId,pId;
        String tName,pName;
        do{
            System.out.println("Tüm teknlojileri listelemek için 1 girin\nİstediğiniz teknlojiyi listelemek için 2 girin\nYeni teknoloji eklemek için 3 girin\nTüm listeyi silmek için 4\nÇıkmak için 0 girin :");
            choice = sc.nextShort();
            if (choice == 1){
                for (var item:technologies){
                    System.out.println("Teknoloji ismi: "+item.getName());
                    System.out.println("Programlama dili: "+item.getProgrammingLanguage().getName());
                }
            }else if(choice == 2){
                System.out.println("Listelemek istediğiniz teknoloji idsini girin: ");
                technologyManager.GetById(sc.nextInt());
            }else if(choice == 3){
                System.out.println("Yeni giriş için teknoloji idsi girin: ");
                tId = sc.nextInt();
                System.out.println("Yeni giriş için teknoloji ismini girin: ");
                tName= sc.next();
                System.out.println("Yeni giriş için program dilinin idsini girin: ");
                pId = sc.nextInt();
                System.out.println("Yeni giriş için program dilinin ismini girin: ");
                pName= sc.next();
                technologyManager.add(new Technology(tId,tName,new ProgrammingLanguage(pId,pName)));
            }else if(choice == 4){
                technologyManager.deleteAll();
            }
        }while (choice != 0);
    }
}