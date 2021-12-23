package Student;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentData {
    public static void main(String args[]) {

        List<StudentDetails> studentDetailsList = new ArrayList<>();
        StudentDetails student1 = new StudentDetails(101, "sai", "eee", "1stYear");
        StudentDetails student2 = new StudentDetails(102, "ram", "ece", "1stYear");
        StudentDetails student3 = new StudentDetails(103, "tej", "mec", "2ndYear");
        StudentDetails student4 = new StudentDetails(104, "sam", "civil", "2ndYear");
        StudentDetails student5 = new StudentDetails(105, "mike", "civil", "1stYear");
        studentDetailsList.add(student1);
        studentDetailsList.add(student2);
        studentDetailsList.add(student3);
        studentDetailsList.add(student4);
        studentDetailsList.add(student5);

        List<StudentFee> studentFee = new ArrayList<>();
        StudentFee studentFee1= new StudentFee(101, 50000.0, "12/06/2021");
        StudentFee studentFee2= new StudentFee(102, 60000.0, "19/06/2021");
        StudentFee studentFee3= new StudentFee(103, 55000.0, "22/07/2021");
        StudentFee studentFee4= new StudentFee(104, 60000.0, "15/07/2021");
        StudentFee studentFee5= new StudentFee(105, 65000.0, "12/06/2021");
        studentFee.add(studentFee1);
        studentFee.add(studentFee2);
        studentFee.add(studentFee3);
        studentFee.add(studentFee4);
        studentFee.add(studentFee5);

        List<Subjects> subjects= new ArrayList<>();
        Subjects subjects1 = new Subjects(111L, "maths");
        Subjects subjects2 = new Subjects(112L, "physics");
        Subjects subjects3 = new Subjects(113L, "chemistry");
        Subjects subjects4 = new Subjects(114L, "drawing");
        Subjects subjects5 = new Subjects(115L, "workshop");
        subjects.add(subjects1);
        subjects.add(subjects2);
        subjects.add(subjects3);
        subjects.add(subjects4);
        subjects.add(subjects5);

        List<StudentMarks> studentMarks = new ArrayList<>();
        StudentMarks studentMarks1 = new StudentMarks(101,"1stYear", 40);
        StudentMarks studentMarks2 = new StudentMarks(102,"1stYear", 50);
        StudentMarks studentMarks3 = new StudentMarks(103,"2ndYear", 69);
        StudentMarks studentMarks4 = new StudentMarks(104,"2ndYear", 65);
        StudentMarks studentMarks5 = new StudentMarks(105,"1stYear", 77);
        studentMarks.add(studentMarks1);
        studentMarks.add(studentMarks2);
        studentMarks.add(studentMarks3);
        studentMarks.add(studentMarks4);
        studentMarks.add(studentMarks5);
        System.out.println("----------------task-1-------------------");
          studentDetailsList.stream().forEach(x-> {
              if(x.getYear().equals("1stYear")){
                  System.out.println(x.getId()+" "+x.getName()+" "+x.getBranch()+" "+x.getYear());
              }
          });
        System.out.println("----------------task-2-------------------");
         studentDetailsList.stream().forEach(y-> {
             studentFee.stream().forEach(z-> {
                 if(y.getId()== z.getId()){
                     System.out.println(y.getId()+" "+y.getName()+" "+y.getBranch()+" "+z.getFee()+" "+z.getDateOfJoining());
                 }
             });
         });


        System.out.println("----------------task-3-------------------");
        studentDetailsList.stream().forEach(a-> {
            studentMarks.stream().forEach(b-> {
                subjects.stream().forEach(c->{
                    if(a.getId()==b.getId()){
                        System.out.println(a.getId()+" "+a.getName()+" "+c.getSubName()+" "+b.getMarks());
                    }
                });
            });
        });
        System.out.println("----------------task-4-------------------");

        studentDetailsList.stream().sorted(Comparator.comparing(StudentDetails::getYear)).collect(Collectors.toList()).stream().forEach(x-> {
            subjects.stream().forEach(r->{
                studentMarks.stream().forEach(u-> {
                    if(x.getId()==u.getId()) {
                        System.out.println(x.getId() + " " + x.getName() + " " + r.getSubName() + " " + u.getMarks() + " " + x.getYear());
                    }
                });
            });
        });


        }

    }
