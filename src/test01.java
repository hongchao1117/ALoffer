public class test01 {
    private int age;
    private String sex;
    private String job;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "test01{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Class<test01> t1 = test01.class;
        Class<? extends test01> t2 = new test01().getClass();
        System.out.println(t1.equals(t2));
    }
}
