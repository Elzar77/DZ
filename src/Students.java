import java.time.LocalDate;

public class Students {
    String name;
    LocalDate date;
    String phoneNom;
    String Nationality;
public Students ( Students[] AllSt) {
}
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", phoneNom='" + phoneNom + '\'' +
                ", Nationality='" + Nationality + '\'' +
                '}';
    }

    public Students(String Nm, LocalDate Dt, String pN, String Nat) {
        this.name = Nm;
        this.date = Dt;
        this.phoneNom = pN;
        this.Nationality = Nat;

    }
}
