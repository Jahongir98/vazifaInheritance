public class Lor extends Doctor {
    private String hospital;



    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public Lor(String name, int experience, String hospital) {
        super(name, experience);
        this.hospital = hospital;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Hospital: " + hospital);
    }
    public String getHospital() {
        return hospital;
    }
}
