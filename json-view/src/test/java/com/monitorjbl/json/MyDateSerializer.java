package com.monitorjbl.json;

import java.io.IOException;
import java.util.Date;

import org.apache.commons.lang3.time.FastDateFormat;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

@SuppressWarnings("serial")
public class MyDateSerializer extends StdScalarSerializer<Date> {

    private static final FastDateFormat FORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
    
    public MyDateSerializer() {
        
        super(Date.class);
    }
    
    @Override
    public void serialize(Date value, JsonGenerator gen,
        SerializerProvider provider) throws IOException, JsonGenerationException {
        
        gen.writeString(FORMAT.format(value));        
    }

}
