package net.openorbit.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.IOException;

/**
 * @author kheless
 * @date 30-01-15
 */
public class JsonHelper {
    public final static ObjectMapper mapper = new ObjectMapper();

    public static <T> T fromJson(String _json, Class<T> _objectClass) throws IOException {
        ObjectReader reader = mapper.reader(_objectClass);
        return (T) reader.readValue(_json);
    }

}
