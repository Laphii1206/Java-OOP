package StringTest;

public class exercise {
    /*(a)	A student ID is an alphanumeric data that consists of a combination of letters and numbers.
    The ID starts with one letter followed by 8-digit numbers.
     Examples of student IDs are J24001297, P23004565, and S24052456.
     Different letters in the ID represents different campuses.
     The campuses the letters represent are listed below:

J – Subang Jaya Campus
P – Penang Campus
N – Nilai Campus
S - Sabah Campus

Write a method that accepts the student ID as a String parameter and return the campus the ID represents. */

public static String getCampus(String studentID){
    char campusLetter = studentID.charAt(0);
    String campus;

    switch (campusLetter) {
        case 'J' -> campus = "Subang Jaya Campus";
        case 'P' -> campus = "Penang Campus";
        case 'N' -> campus = "Nilai Campus";
        case 'S' -> campus = "Sabah Campus";
        default -> campus = "Unknown Campus";
    }

    return campus;
}
}
