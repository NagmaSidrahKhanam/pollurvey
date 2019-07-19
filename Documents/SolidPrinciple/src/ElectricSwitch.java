public class ElectricSwitch {
    int id;
    int category;
    int brand;
    String switchname;
    int Amperevalue;
    String color;
    String material;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public String getSwitchname() {
        return switchname;
    }

    public void setSwitchname(String switchname) {
        this.switchname = switchname;
    }

    public int getAmperevalue() {
        return Amperevalue;
    }

    public void setAmperevalue(int amperevalue) {
        Amperevalue = amperevalue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}


class User {

    int user_id;

    public int getId() {
        return user_id;
    }

    public void setId(int id) {
        this.user_id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int age;
    int height;

}


class Powersupply{

    String typeofElectricity;
    int volts;

    public String getTypeofElectricity() {
        return typeofElectricity;
    }

    public void setTypeofElectricity(String typeofElectricity) {
        this.typeofElectricity = typeofElectricity;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}


class SwitchOPerations {

    int switch_state;

    public  void switchoff(){
    }

    public  void switchon(){
    }

        }