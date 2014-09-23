package jsonsample;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonSample {

    public static void main(String args[])  {


        Target target = new Target();
        target.setName("Mr. Bob");
        target.setAge(39);

        //1. Convert Java object to JSON format
        String json = null;
        ObjectMapper mapper = new ObjectMapper();


        try {
            json =  mapper.writeValueAsString(target);
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }



        //2. Convert JSON to Java object
        try {
            target = mapper.readValue(json, Target.class);
            System.out.println(target);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
