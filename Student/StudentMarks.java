package Student;

public class StudentMarks {
    private int id;
    private  String year;
    private  int marks;

    public StudentMarks(int id, String year, int marks) {
        this.id = id;
        this.year = year;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
