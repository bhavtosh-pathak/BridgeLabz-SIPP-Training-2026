import java.util.*;

public class EmployeeSkillAssignment {

    static void findTeams(int[] arr, int index, int target,
                          ArrayList<Integer> team) {

        if (target == 0) {
            System.out.println(team);
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        team.add(arr[index]);
        findTeams(arr, index + 1, target - arr[index], team);

        team.remove(team.size() - 1);
        findTeams(arr, index + 1, target, team);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, 0, target, new ArrayList<>());
    }
}