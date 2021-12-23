package Student;

public class Subjects {
    private Long subNo;
    private String subName;


    public Subjects(Long subNo, String subName) {
        this.subNo = subNo;
        this.subName = subName;
    }

    public Long getSubNo() {
        return subNo;
    }

    public void setSubNo(Long subNo) {
        this.subNo = subNo;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }


}
