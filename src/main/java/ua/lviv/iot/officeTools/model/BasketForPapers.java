package ua.lviv.iot.officeTools.model;

public class BasketForPapers extends AbstractOfficeTool {

    private int volumeInLiter;

    public BasketForPapers(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams,
            int warrantyInDays) {
        super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
    }

    public BasketForPapers(String producer, double priceInUAH, Brand brand, Colour colour, int weightInGrams,
            int warrantyInDays, int volumeInLiter) {
        super(producer, priceInUAH, brand, colour, weightInGrams, warrantyInDays);
        this.volumeInLiter = volumeInLiter;
    }
    
    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "volumeInLiter";
    }
    
    @Override
    public String toCSV() {
        return super.toCSV() + "," + "volumeInLiter=" + getVolumeInLiter();
    }

    public int getVolumeInLiter() {
        return volumeInLiter;
    }

    public void setVolumeInLiter(int volumeInLiter) {
        this.volumeInLiter = volumeInLiter;
    }

}
