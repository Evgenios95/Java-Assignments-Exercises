package ConstructorsClasses;

public class Car {

    private String model;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("cayenne")) {
            this.model = model.toLowerCase();
        } else {
            this.model = "Unknown".toLowerCase();
        }
    }

    public String getModel() {
        return this.model;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("CaRreRa");
        System.out.println(car.getModel());
        car.setModel("Cayenne");
        System.out.println(car.getModel());
        car.setModel("turbo");
        System.out.println(car.getModel());
    }
}
