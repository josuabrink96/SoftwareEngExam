package gmit.ie;

public class Employee {
    private String title;
    private String name;
    private String PPS;
    private String phone;

    public Employee(String title, String name, String pps, String phone)
    {
        setTitle(title);
        setName(name);
        setPPS(pps);
        setPhone(phone);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Miss")) {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Invalid title entered");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 5 && name.length() <= 22) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid name entered");
        }
    }

    public String getPPS() {
        return PPS;
    }

    public void setPPS(String PPS) {
        if(PPS.length() == 6) {
            this.PPS = PPS;
        }
        else {
            throw new IllegalArgumentException("Invalid PPS entered");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length() == 7) {
            this.phone = phone;
        }
        else {
            throw new IllegalArgumentException("Invalid Phone Number entered");
        }
    }
}
