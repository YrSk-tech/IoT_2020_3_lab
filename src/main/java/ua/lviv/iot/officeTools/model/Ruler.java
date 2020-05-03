package ua.lviv.iot.officeTools.model;

public class Ruler extends OfficeTool {

    private int lengthInCm;

    public Ruler(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams,
            int warrantyInDays) {
        super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
    }

    public Ruler(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams, int warrantyInDays,
            int lengthInCm) {
        super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
        this.lengthInCm = lengthInCm;
    }
    
    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "lengthInCm";
    }
    
    @Override
    public String toCSV() {
        return super.toCSV() + "," + "lengthInCm=" + getLengthInCm();
    }
    
    public int getLengthInCm() {
        return lengthInCm;
    }

    public void setLengthInCm(int lengthInCm) {
        this.lengthInCm = lengthInCm;
    }

}
