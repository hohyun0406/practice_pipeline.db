package user;


public class UserView {
    public static void main(Scanner sc) {
        UserController controller = new UserController();

        while(true){
            System.out.println("===User Menu===\n" +
                    "0 - Back to Main\n" +
                    "1 - Sign up\n" +
                    "2 - Log in\n" +
                    "3 - Search ID\n" +
                    "4 - Search PW\n" +
                    "5 - Delete Account\n" +
                    "ls - User list(OP)\n" +
                    "touch - Create Table(OP)\n" +
                    "rm - Delete Table(OP)\n");
            switch (sc.next()){
                case "0" :
                    System.out.println("User fin.");return;
                case "1" :
                    System.out.println("Sign up");
                    controller.signUp(sc);
                    break;
                case "2" : System.out.println("Log in");break;
                case "3" : System.out.println("Search ID");break;
                case "4" : System.out.println("Search PW");break;
                case "5" : System.out.println("Delete Account");break;
                case "ls" : System.out.println("User list(OP)");break;
                case "touch" : System.out.println("Create Table(OP)");break;
                case "rm" : System.out.println("Delete Table(OP)");break;

            }
        }

    }
}
