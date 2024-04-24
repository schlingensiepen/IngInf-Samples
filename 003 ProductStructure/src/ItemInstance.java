
public class ItemInstance {

    // Atribute: InstanceName, TransformationMatrix (16 integers), 
    // Item
    private String instanceName;
    private double[] transformation = new double[16];
    private Item item;

    // getter and setter
    public String getInstanceName() {
        return instanceName;
    }
    public void setInstanceName(String instanceName) {
        if (instanceName == null || instanceName.isEmpty()) {
            throw new IllegalArgumentException(
                "Instance Name cannot be null or empty");
        }
        this.instanceName = instanceName;
    }
    // getter for transformation
    public double[] getTransformation() {
        return transformation;
    }

    // getter and setter for item
    public Item getItem() {
        return item;
    }
    private void setItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException(
                "Item cannot be null");
        }
        this.item = item;
    }

    // Constructor
    public ItemInstance(String instanceName, 
        Item item) {
        setInstanceName(instanceName);
        setItem(item);
    }
}
