public class Xirurg extends Doctor{
    private String specialization;

    public Xirurg(String name, int experience, String specialization) {
        super(name, experience);
        this.specialization = specialization;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Specialization: " + specialization);
    }
}