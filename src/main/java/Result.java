import java.util.LinkedList;
import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) throws Exception {

        int result = 0;

        //copy of "grades" to prevent loss of information due to errors
        List<Integer> finalGrades = new LinkedList<>(grades);

        //Checking for invalid input
        if(finalGrades.get(0) > 60 || grades.get(0) < 0){
            throw new Exception("Invalid number of students");
        }

        if(finalGrades.isEmpty()){
            throw new Exception("List does not contain elements");
        }

        if(finalGrades.size()==1){
            throw new Exception("No grades entered");
        }

        for(int i = 0; i < finalGrades.size(); i++) {

            if (finalGrades.get(i) < 0 || finalGrades.get(i) > 100) {
                throw new Exception("Please enter valid grades");
            }

        }

        //Checking if rounding up is possible, if so element will be stored in "finalGrades"
        for (int i = 0; i < finalGrades.size(); i++) {

            int multipleOfFive = finalGrades.get(i);

            System.out.print(" " + finalGrades.get((i)));

            do {
                multipleOfFive++;
            }
            while ((multipleOfFive % 5) != 0);

            result = multipleOfFive - finalGrades.get(i);

            if (finalGrades.get(i) >= 36 && result < 3) {

                finalGrades.set(i, multipleOfFive);
            }

        }
        System.out.println();
        finalGrades.remove(0);
        for (int i = 0; i < finalGrades.size(); i++) {
            System.out.print(" " + finalGrades.get(i));
        }

        return finalGrades;
    }

}
