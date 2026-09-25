public class SwitchPractice{
    static void main(String[] args) {
        System.out.println(getAccessMessage("admin"));
        System.out.println(getAccessMessage("editor"));
        System.out.println(getAccessMessage("viewer"));
        System.out.println(getAccessMessage("Dave"));

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