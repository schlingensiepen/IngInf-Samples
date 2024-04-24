import java.util.ArrayList;

public class Item {

    // Attributes PartNumber, Nomenclature, Description, 
    // EstimatedWeight, CalculatedWeight and WeightedWeight
    private String partNumber;
    private String nomenclature;
    private String description;
    private double estimatedWeight = -1.0;
    private double calculatedWeight = -1.0;
    private double weightedWeight = -1.0;
    
    private ArrayList<ItemInstance> contains
        = new ArrayList<ItemInstance>();

    public ArrayList<ItemInstance> getContains() {
        return contains;
    }

    // getter and setter
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        if (partNumber == null || partNumber.isEmpty()) {
            throw new IllegalArgumentException(
                "Part Number cannot be null or empty");
        }
        this.partNumber = partNumber;
    }
    public String getNomenclature() {
        return nomenclature;
    }
    public void setNomenclature(String nomenclature) {
        if (nomenclature == null || nomenclature.isEmpty()) {
            throw new IllegalArgumentException(
                "Nomenclature cannot be null or empty");
        }
        this.nomenclature = nomenclature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException(
                "Description cannot be null or empty");
        }
        this.description = description;
    }

    public double getEstimatedWeight() {
        return estimatedWeight;
    }

    public void setEstimatedWeight(double estimatedWeight) {
        if (estimatedWeight < 0) {
            throw new IllegalArgumentException(
                "Estimated Weight cannot be negative");
        }
        this.estimatedWeight = estimatedWeight;
    }

    public double getCalculatedWeight() {
        return calculatedWeight;
    }

    public void setCalculatedWeight(double calculatedWeight) {
        if (calculatedWeight < 0) {
            throw new IllegalArgumentException(
                "Calculated Weight cannot be negative");
        }
        this.calculatedWeight = calculatedWeight;
    }

    public double getWeightedWeight() {
        return weightedWeight;
    }

    public void setWeightedWeight(double weightedWeight) {
        if (weightedWeight < 0) {
            throw new IllegalArgumentException(
                "Weighted Weight cannot be negative");
        }
        this.weightedWeight = weightedWeight;
    }

    // Constructor
    public Item(String partNumber, String nomenclature, 
        String description) {
        setPartNumber(partNumber);
        setNomenclature(nomenclature);
        setDescription(description);
    }
    

}
