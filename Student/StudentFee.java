package Student;

public class StudentFee {
    private int id;
    private Double fee;
    private String dateOfJoining;

    public StudentFee(int id, Double fee, String dateOfJoining) {
        this.id = id;
        this.fee = fee;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
