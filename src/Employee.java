public record Employee(String name, int experience, int serviceNumber, int phoneNumber) {

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }
}
