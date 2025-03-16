package entity;

public class Technology {
    private int id;
    private String name;
    private ProgrammingLanguage programmingLanguage;

    public Technology(int id, String name, ProgrammingLanguage programmingLanguage) {
        this.id = id;
        this.name = name;
        this.programmingLanguage = programmingLanguage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
