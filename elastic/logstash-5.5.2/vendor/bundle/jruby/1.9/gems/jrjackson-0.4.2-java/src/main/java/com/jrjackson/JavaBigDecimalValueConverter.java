package com.jrjackson;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.math.BigDecimal;

/**
 *
 * @author Guy Boertje
 */
public class JavaBigDecimalValueConverter implements JavaConverter {

    @Override
    public BigDecimal convert(JsonParser jp) throws IOException {
        return jp.getDecimalValue();
    }
}
