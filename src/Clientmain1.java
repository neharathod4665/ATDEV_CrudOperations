
import java.sql.Connection;
import java.sql.Statement;
import java.lang.*;


public class Clientmain1{
    public static void main(String[] args) {

//        createStudent();
//        updateStudentsDobById();
        deleteStudentsById();
    }

    private static void deleteStudentsById() {
        try(Connection connection = DBUtilmain.getConnection(); Statement st = connection.createStatement();){
            String SQLINSERT = "DELETE FROM students WHERE student_no=4";
            int executeUpdate = st.executeUpdate(SQLINSERT);
            if(executeUpdate == 1){
                System.out.println("Student is Deleted...");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }



    private static void updateStudentsDobById() {
        try(Connection connection = DBUtilmain.getConnection(); Statement st = connection.createStatement();){
            String SQLINSERT = "UPDATE students set student_dob='2000-08-10' WHERE student_no=1";
            int executeUpdate = st.executeUpdate(SQLINSERT);
            if(executeUpdate == 1){
                System.out.println("Date of Birth is Updated...");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void createStudent() {
        try(Connection connection = DBUtilmain.getConnection(); Statement st = connection.createStatement();){
            String SQLINSERT = "INSERT INTO students(student_name,student_dob,student_doj) VALUES('Priya','2002-11-08','2022-07-11')";
            int executeUpdate = st.executeUpdate(SQLINSERT);
            if(executeUpdate == 1){
                System.out.println("Student is created...");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}