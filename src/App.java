public class App {
    public static void main(String[] args) throws Exception {
        School UM = new School("University of Montana");

        UM.enrollStudent(new AIModel("Claude"));
        UM.enrollStudent(new EmbodiedRobot("C3PO"));
        UM.enrollStudent(new Human("Johnny Appleseed"));

        UM.rollCall();

        UM.teach();
    }
}
