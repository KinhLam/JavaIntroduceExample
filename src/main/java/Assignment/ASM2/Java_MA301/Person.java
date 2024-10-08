package Assignment.ASM2.Java_MA301;

public abstract class Person {
    String fullName, gender, phoneNumber, email;

    public Person(String fullName, String gender, String phoneNumber, String email) {
        this.fullName = fullName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phoneNumber;
    }

    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender='" + gender + '\'' +
                ", phone=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public abstract void purchaseParkingPass();
}
