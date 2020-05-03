package ua.lviv.iot.officeTools.model;

public class MagnifyingGlass extends OfficeTool {

    private int magnificationFactor;

    public MagnifyingGlass(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams,
            int warrantyInDays) {
        super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
    }

    public MagnifyingGlass(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams,
            int warrantyInDays, int magnificationFactor) {
        super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
        this.magnificationFactor = magnificationFactor;
    }
    
    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "magnificationFactor";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + "magnificationFactor=" + getMagnificationFactor();
    }
    
    public int getMagnificationFactor() {
        return magnificationFactor;
    }

    public void setMagnificationFactor(int magnificationFactor) {
        this.magnificationFactor = magnificationFactor;
    }

}
