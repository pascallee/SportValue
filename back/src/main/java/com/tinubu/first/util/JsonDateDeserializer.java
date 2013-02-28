package com.tinubu.first.util;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Pascal Lee
 */
public class JsonDateDeserializer extends JsonDeserializer<Date> {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        try {
            Date date = dateFormat.parse(jsonParser.getText());
            return date;
        } catch (ParseException pe) {
            //
        }
        return null;
    }
}
