public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Red";
    private int doorNum = 3;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String isConvertible() {
        if (this.convertible) {
            System.out.println("Yes, convertible");
            return "";
        } else {
            System.out.println("No, non-convertible");
            return "";
        }
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public void setConvertible(boolean isConvertible) {
        this.convertible = isConvertible;
    }
    public void describeCar() {
        System.out.println(doorNum + "-door " +
                color.toLowerCase() + " "  +
                make.toLowerCase() + " " +
                model.toLowerCase() + " " +
                (convertible ? "is Convertible" : " "));
    }

}
