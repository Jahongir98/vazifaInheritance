public class Main {
    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg("Dr. Ali", 15, "Cardiac Surgery");
        Lor lor = new Lor("Dr. Bob", 10, "City Hospital");
        PC pc = new PC("Dell");
        Laptop laptop = new Laptop("HP");
        Subwoofer subwoofer = new Subwoofer("Sony");
        Loudspeaker loudspeaker = new Loudspeaker("JBL");

        System.out.println("\nA sxema:");
        xirurg.showInfo();
        System.out.println();
        lor.showInfo();

        System.out.println("\nB sxema:");
        pc.showInfo();
        laptop.showInfo();
        subwoofer.showInfo();
        loudspeaker.showInfo();

    }
}
