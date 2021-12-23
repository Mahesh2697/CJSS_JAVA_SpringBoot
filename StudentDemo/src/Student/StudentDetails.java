package Student;

public class StudentDetails {
    private int id;
    private String name;
    private String branch;
    private String year;


    public StudentDetails(int id, String name, String branch, String year) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



}

