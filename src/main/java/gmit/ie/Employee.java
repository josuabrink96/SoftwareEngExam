package gmit.ie;

public class Employee {
    private String title;
    private String name;
    private String PPS;
    private String phone;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String pps, String phone, String employmentType, int age)
    {
        setTitle(title);
        setName(name);
        setPPS(pps);
        setPhone(phone);
        setEmploymentType(employmentType);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Miss")) {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Title must be Mr, Mrs or Miss");
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
            throw new IllegalArgumentException("Name must be a minimum of 5 characters");
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
            throw new IllegalArgumentException("PPS must be at least 6 characters long");
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
            throw new IllegalArgumentException("Phone Number must be at least 7 characters long");
        }
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        if (employmentType.equals("Full-time") || employmentType.equals("Part-time")) {
            this.employmentType = employmentType;
        } else {
            throw new IllegalArgumentException("Employment Type must be Full-time or Part-time");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 18) {
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Age must be over 18");
        }
    }
}
