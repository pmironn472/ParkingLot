package Car;

public class Car {

    private String model;
    private String id;

    public Car(String model, String id) {
        setModel(model);
        setId(id);

    }


    public void setModel(String model) {
        if (model.equals("BMW") || model.equals("Mercedes") || model.equals("Fiat")) {
            this.model = model;
        } else {
            System.err.println("No such model available");
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public static String printModel(Car c) {
        if (c != null)
            return c.getModel();
        else
            return "0";
    }
}