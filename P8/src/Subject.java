public class Subject {
    private String nameSubject;
    private int ageSubject, durationSubject;

    public Subject() {
    }

    public Subject(String nameSubject, int ageSubject, int durationSubject) {
        this.nameSubject = nameSubject;
        this.ageSubject = ageSubject;
        this.durationSubject = durationSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getAgeSubject() {
        return ageSubject;
    }

    public void setAgeSubject(int ageSubject) {
        this.ageSubject = ageSubject;
    }

    public int getDurationSubject() {
        return durationSubject;
    }

    public void setDurationSubject(int durationSubject) {
        this.durationSubject = durationSubject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "nameSubject='" + nameSubject + '\'' +
                ", ageSubject=" + ageSubject +
                ", durationSubject=" + durationSubject +
                '}';
    }
}
