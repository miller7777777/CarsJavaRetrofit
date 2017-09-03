package mnz.creatori.carsjavaretrofit.Model;


public class Car {

    private String name;
    private String image;
    private String win;

    public Car(String name, String image, String win) {
        this.name = name;
        this.image = image;
        this.win = win;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        if (image != null ? !image.equals(car.image) : car.image != null) return false;
        return win != null ? win.equals(car.win) : car.win == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (win != null ? win.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", win='" + win + '\'' +
                '}';
    }
}
