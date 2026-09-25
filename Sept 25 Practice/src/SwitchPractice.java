import java.util.Scanner;

public class SwitchPractice{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(getAccessMessage("admin"));
//        System.out.println(getAccessMessage("editor"));
//        System.out.println(getAccessMessage("viewer"));
//        System.out.println(getAccessMessage("Dave"));
        System.out.print("Enter username: ");
        try {
            System.out.println(getAccessMessage(scanner.nextLine()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        scanner.close();
    }
    public static String getAccessMessage(String role){
        String message = "";
        switch (role){
            case "admin":
                message = "Full";
                break;
            case "editor":
                message = "Edit";
                break;
            case "viewer":
                message = "Read-Only";
                break;
            default:
                message = "Unknown";
                break;
        }

        return message;
    }
    /*
    admin -> "Full"
    editor -> "edit"
    viewer -> "read-only"
    anything else -> "unknown"
     */
}