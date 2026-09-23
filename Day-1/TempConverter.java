public class TempConverter{
    public float convertF2C(float f){
        return (f - 32) * 5f/9f;
    }
    public float convertC2F(float c){
        return c*(9f/5f)+32;
    }
    public float convertC2K(float c){
        return c+273.15f;
    }
    public float convertK2C(float k){
        return k-273.15f;
    }
    public float convertK2F(float k){
        return convertC2F((k-273.15f));
    }
    public float convertF2K(float k){
        return (convertF2C(k)+273.15f);
    }
}