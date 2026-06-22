package hospitalsystem;

public abstract class Person {

    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Abstract methods — every subclass MUST implement these
    public abstract String getRole();
    public abstract void displayInfo();

    // Getters
    public String getName() { return name; }
    public int getAge()     { return age; }
    public String getSex()  { return sex; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age)      { this.age = age; }
    public void setSex(String sex)   { this.sex = sex; }

    // Concrete method — can be overridden by subclasses
    public void vision() {
        System.out.println("[" + getRole() + "] " + name + " has standard vision.");
    }
}
