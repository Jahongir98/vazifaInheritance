public class Doctor {
    private String name;
    private int experience;



    public Doctor(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public void showInfo() {
        System.out.println("Doctor: " + name + ", Experience: " + experience + " years");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
