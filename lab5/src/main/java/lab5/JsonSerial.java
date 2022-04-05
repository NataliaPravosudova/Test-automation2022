package lab5;

import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonSerial {

    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("field1","value1");

        System.out.println(jsonObject);
        ObjectMapper objectMapper = new ObjectMapper();
        MyAnyCustomClass object=
                objectMapper.readValue(new URL("json_car.json"), Car.class);
        System.out.println(object);

        object.setField3(666);


        jsonObject.toString();
        File file = new File("top.json");

        try {
            new FileWriter(file).write(jsonObject2.toString());
        } catch (IOException e){
            e.printStackTrace();
        }



    }


}
