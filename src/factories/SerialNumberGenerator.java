package factories;

public class SerialNumberGenerator {
    private Integer SerialNumber;
    private static SerialNumberGenerator serialNumberGenerator;

    public SerialNumberGenerator() {
        this.SerialNumber = 0;
    }
    public static SerialNumberGenerator getInstance(){
        if (null == serialNumberGenerator){
            serialNumberGenerator = new SerialNumberGenerator();
        }
        return serialNumberGenerator;
    }
    public Integer next() {
        return SerialNumber++;
    }
}
