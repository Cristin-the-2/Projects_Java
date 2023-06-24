package Projects_Java.Seminar06.Task52;

import java.util.Date;

public class Cat {
    //private int id;
    public String name;
    public Date birthDate;
    public Sex sex;
    public Date lastVacctinationDate;
    public boolean sterialized;
    public Poroda poroda;
    private Treatment treatment; 
    private Date treatmentDate;

    public void Vacctination(Date date) {
        this.lastVacctinationDate = date;
    }

    public void setTreatment(Date startDate, Date endDate, Treatment treatment) {
        if (endDate!=null) {
            this.treatment = null;
            this.treatmentDate = null;
        }
        else {
            this.treatmentDate = startDate;
            this.treatment = treatment;
        }
    }

    public void Meow(int num) {
        System.out.printf("Кот %s мяукнул %d раз", this.name, num);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",this.name,this.treatmentDate,this.treatment);
    }
}