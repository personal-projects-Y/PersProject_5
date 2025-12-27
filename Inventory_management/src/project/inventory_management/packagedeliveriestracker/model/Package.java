package cmpt213.assignment2.packagedeliveriestracker.model;
import java.time.LocalDateTime;

public class Package {

    private String name;

    private String notes;

    private double price;

    private double weight;

    private boolean deliverystatus;

    private LocalDateTime edd;

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDeliverystatus(boolean deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    public void setEdd(LocalDateTime edd) {
        this.edd = edd;
    }

    public String getName () {

        return name;

    }

    public String getNotes() {

        return notes;

    }

    public double getPrice () {

        return price;

    }

    public double getWeight () {

        return weight;

    }

    public boolean isDeliverystatus () {

        return deliverystatus;

    }

    public LocalDateTime getEdd () {

        return edd;

    }

    public void setAuthorname(String aname){

    }

    public void setEd(LocalDateTime ed) {


    }

    public void setEhf(Double ehf) {


    }

    public void markdelivered(){

        deliverystatus=true;

    }

    public String getAuthorname() {
        return null;
    }

    public LocalDateTime getEd(){
        return null;
    }

    public Double getEhf () {
        return null;
    }

    @Override
    public String toString() {
        return "packageinfo{" +
                "name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", delivered=" + deliverystatus +
                ", ddate=" + edd +
                '}';
    }

}

