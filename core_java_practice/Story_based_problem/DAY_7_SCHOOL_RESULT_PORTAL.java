import java.io.*;

public class DAY_7_SCHOOL_RESULT_PORTAL {

    public static void main(String[] args) {

        String inputFile = "day7_student_records.txt";
        String outputFile = "day7_report_cards.txt";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));

                // true => append mode
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter(outputFile, true))
        ) {

            String line;

            bw.write("\n========== NEW REPORT ==========\n");

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String studentName = data[0];

                int totalMarks = 0;

                for (int i = 1; i < data.length; i++) {
                    totalMarks += Integer.parseInt(data[i]);
                }

                double averageMarks =
                        (double) totalMarks / (data.length - 1);

                bw.write("Student Name : " + studentName);
                bw.newLine();

                bw.write("Average Marks: "
                        + String.format("%.2f", averageMarks));
                bw.newLine();

                bw.write("-------------------------------");
                bw.newLine();
            }

            System.out.println("Report card generated successfully.");

        } catch (FileNotFoundException e) {

            System.out.println(
                    "Input file not found: " + inputFile);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Invalid marks format detected in file.");

        } catch (IOException e) {

            System.out.println(
                    "File operation failed: " + e.getMessage());
        }
    }
}