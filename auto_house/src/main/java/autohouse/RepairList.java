package autohouse;

public class RepairList {
    int repairId;
    String repairDate;
    String repairDes;
    int repairPrize;
    float carRegistrationNumber;

    public RepairList(int repairId, String repairDate, String repairDes, int repairPrize, float carRegistrationNumber) {
        this.repairId = repairId;
        this.repairDate = repairDate;
        this.repairDes = repairDes;
        this.repairPrize = repairPrize;
        this.carRegistrationNumber = carRegistrationNumber;
    }

    public int getRepairId() {
        return repairId;
    }

    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }

    public String getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(String repairDate) {
        this.repairDate = repairDate;
    }

    public String getRepairDes() {
        return repairDes;
    }

    public void setRepairDes(String repairDes) {
        this.repairDes = repairDes;
    }

    public int getRepairPrize() {
        return repairPrize;
    }

    public void setRepairPrize(int repairPrize) {
        this.repairPrize = repairPrize;
    }

    public float getCarRegistrationNumber() {
        return carRegistrationNumber;
    }

    public void setCarRegistrationNumber(float carRegistrationNumber) {
        this.carRegistrationNumber = carRegistrationNumber;
    }
}
