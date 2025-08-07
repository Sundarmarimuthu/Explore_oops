abstract class HospitalBase {
    private String pName;
    private String pSex;
    private int pId;
    private String city;
    private String attender;
    private String disease;
    private String drug;

    HospitalBase(String pName, String pSex, int pId, String city, String attender, String disease, String drug) {
        this.pName = pName;
        this.pSex = pSex;
        this.pId = pId;
        this.city = city;
        this.attender = attender;
        this.disease = disease;
        this.drug = drug;
    }

    public abstract void display();

    public String getName() {
        return pName;
    }

    public void setName(String pName) {
        this.pName = pName;
    }

    public String getSex() {
        return pSex;
    }

    public void setSex(String pSex) {
        this.pSex = pSex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAttender() {
        return attender;
    }

    public void setAttender(String attender) {
        this.attender = attender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public int getId() {
        return pId;
    }

    public void setId(int pId) {
        this.pId = pId;
    }
}

class Patient extends HospitalBase {
    public Patient(String pName, String pSex, int pId, String city, String attender, String disease, String drug) {
        super(pName, pSex, pId, city, attender, disease, drug);
    }

    @Override
    public void display() {
        System.out.println("Patient name: " + getName());
        System.out.println("Patient id: " + getId());
        System.out.println("Patient gender: " + getSex());
        System.out.println("Patient from: " + getCity());
        System.out.println("Patient attender name: " + getAttender());
        System.out.println("Patient is diagnosed with disease: " + getDisease());
        System.out.println("Patient is administered with the drug: " + getDrug());
    }
}

public class Hospital {
    public static void main(String[] args) {
        Patient p = new Patient("Vinoth", "Male", 212, "Tirupur", "Sundar", "Common cold", "Menatoacenine");
        p.display();
    }
}
