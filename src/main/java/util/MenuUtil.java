package util;

public class MenuUtil {
    public static void processMenu(int menu){
        switch (menu){
            case 1:
                StudentUtil.registerStudents();
                break;
            case 2:
                StudentUtil.printAllRegisteredStudent();
                break;
            case 3:
                StudentUtil.findStudentsAndPrint();
                break;
            case 4:
                StudentUtil.updateStudent();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                break;
        }
    }
    public static String requireName(){
        return InputUtil.requireText("enter name");
    }
    public static String requireSurname(){
        return InputUtil.requireText("enter surname");
    }
    public static String requireClassName(){
        return InputUtil.requireText("enter classname");
    }
    public static int requireAge(){
        return InputUtil.requireNumber("enter age");
    }
}
