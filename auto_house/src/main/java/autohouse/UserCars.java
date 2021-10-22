package autohouse;

public class UserCars {
    int carId;
    float registrationNumberFrame;
    float registrationNumber;
    int carModelId;
    String carColor;
    int ownerID;

    public UserCars(int carId, float registrationNumberFrame, float registrationNumber, int carModelId, String carColor, int ownerID) {
        this.carId = carId;
        this.registrationNumberFrame = registrationNumberFrame;
        this.registrationNumber = registrationNumber;
        this.carModelId = carModelId;
        this.carColor = carColor;
        this.ownerID = ownerID;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public float getRegistrationNumberFrame() {
        return registrationNumberFrame;
    }

    public void setRegistrationNumberFrame(float registrationNumberFrame) {
        this.registrationNumberFrame = registrationNumberFrame;
    }

    public float getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(float registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getCarModelId() {
        return carModelId;
    }

    public void setCarModelId(int carModelId) {
        this.carModelId = carModelId;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }
}
