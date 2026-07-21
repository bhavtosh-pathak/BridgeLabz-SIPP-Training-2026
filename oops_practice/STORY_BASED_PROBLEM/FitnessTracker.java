interface Trackable {

    void logActivity();

    // Default method
    default void resetData() {
        System.out.println("Fitness data has been reset.");
    }
}

interface Reportable {

    void generateReport();
}

interface Notifiable {

    void sendAlert();
}

class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Activity Logged: 5000 steps, 300 calories burned.");
    }

    @Override
    public void generateReport() {
        System.out.println("Report: Daily fitness report generated.");
    }

    @Override
    public void sendAlert() {
        System.out.println("Alert: Time to drink water!");
    }
}

public class FitnessTracker {

    public static void main(String[] args) {

        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();

        // Calling default method
        device.resetData();

        System.out.println("\nFitnessDevice implements multiple interfaces:");
        System.out.println("- Trackable");
        System.out.println("- Reportable");
        System.out.println("- Notifiable");

        System.out.println("\nJava allows multiple interface implementation");
        System.out.println("but does NOT allow multiple class inheritance.");
    }
}
