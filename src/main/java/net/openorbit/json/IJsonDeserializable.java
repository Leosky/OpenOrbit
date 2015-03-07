package net.openorbit.json;

/**
 * @author kheless
 * @date 30-01-15
 */
public interface IJsonDeserializable {
    public IJsonDeserializable fromJson(String _json) throws JsonException;

}
