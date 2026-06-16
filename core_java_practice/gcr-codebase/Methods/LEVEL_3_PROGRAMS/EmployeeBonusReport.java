public class EmployeeBonusReport {

    static double[][] employeeData() {

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {

            data[i][0] =
                    (int)(Math.random()*90000)+10000;

            data[i][1] =
                    (int)(Math.random()*10)+1;
        }

        return data;
    }

    static double[][] calculateBonus(
            double[][] data) {

        double[][] result =
                new double[10][2];

        for (int i = 0; i < 10; i++) {

            double salary = data[i][0];
            double years = data[i][1];

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            result[i][0] = bonus;
            result[i][1] =
                    salary + bonus;
        }

        return result;
    }

    public static void main(String[] args) {

        double[][] data = employeeData();
        double[][] result =
                calculateBonus(data);

        double oldSalary = 0;
        double newSalary = 0;
        double totalBonus = 0;

        System.out.println(
                "Salary Years Bonus NewSalary");

        for (int i = 0; i < 10; i++) {

            System.out.println(
                    data[i][0] + " " +
                            data[i][1] + " " +
                            result[i][0] + " " +
                            result[i][1]);

            oldSalary += data[i][0];
            totalBonus += result[i][0];
            newSalary += result[i][1];
        }

        System.out.println(
                "\nTotal Old Salary = "
                        + oldSalary);

        System.out.println(
                "Total Bonus = "
                        + totalBonus);

        System.out.println(
                "Total New Salary = "
                        + newSalary);
    }
}