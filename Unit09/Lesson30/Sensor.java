// Alex Benson
// Lesson 30 HW Part B
// 2/7/25

public abstract class Sensor {

    // declare member variables
    private String name;
    private int modelNumber;

    // get name
    public String getName() {
        return name;
    }

    // set name
    public void setName(String newname) {
        name = newname;
    }

    // get modelNumber
    public int getModelNumber() {
        return modelNumber;
    }

    // set modelNumber
    public void setModelNumber(int newModelNum) {
        modelNumber = newModelNum;
    }

    // record measurement abstract method
    public abstract void recordMeasurement();
}
