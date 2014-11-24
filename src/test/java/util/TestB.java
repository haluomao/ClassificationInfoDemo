package util;

/**
 * Created by haluomao on 14/11/19.
 */
public class TestB {
    private String name;
    private String code;
    private int num;

    public TestB(){

    }

    public void setNum(Integer n){
        this.num = n;
    }
    public  int getNum(){
        return  num;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }

    @Override
    public String toString(){
        return "name:"+name+" code:"+code+" num:"+num;
    }
}
