package ComplaintRegistration;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Complaint implements Serializable {
    private String name;
    private String email;
    private String complaintText;
    private String dateTime;

    public Complaint(String name, String email, String complaintText) {
        this.name = name;
        this.email = email;
        this.complaintText = complaintText;
        this.dateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "\n[ " + dateTime + " ]"
                + "\nName: " + name
                + "\nEmail: " + email
                + "\nComplaint: " + complaintText;
    }
}

public class ComplaintRegistrationSystem {
    private static final String FILE_NAME = "complaints.dat";
    private static ArrayList<Complaint> complaintsList = new ArrayList<>();

    public static void main(String[] args) {
        loadComplaints();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Complaint Registration System ---");
            System.out.println("1. Register Complaint");
            System.out.println("2. View All Complaints");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> registerComplaint(sc);
                case 2 -> viewComplaints();
                case 3 -> {
                    saveComplaints();
                    System.out.println("Exiting... Complaints saved.");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void registerComplaint(Scanner sc) {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        System.out.print("Enter your complaint: ");
        String complaintText = sc.nextLine();

        Complaint complaint = new Complaint(name, email, complaintText);
        complaintsList.add(complaint);
        System.out.println("✅ Complaint registered successfully!");
    }

    private static void viewComplaints() {
        if (complaintsList.isEmpty()) {
            System.out.println("No complaints found.");
            return;
        }
        System.out.println("\n--- All Complaints ---");
        for (Complaint c : complaintsList) {
            System.out.println(c);
        }
    }

    private static void saveComplaints() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(complaintsList);
        } catch (IOException e) {
            System.out.println("Error saving complaints: " + e.getMessage());
        }
    }

    private static void loadComplaints() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            complaintsList = (ArrayList<Complaint>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading complaints: " + e.getMessage());
        }
    }
}

