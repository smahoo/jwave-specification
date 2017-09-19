package de.smahoo.jwave.specification;


import de.smahoo.jwave.cmd.JWaveCommandClassSpecification;
import de.smahoo.jwave.utils.xml.XmlConvertionException;
import de.smahoo.jwave.utils.xml.XmlUtils;
import org.w3c.dom.Document;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Matze on 19.09.17.
 */
public class JWaveSpecification {
    public static final String DEFAULT_SPEC_FILENAME = "cmd_classes.xml";

    public static JWaveCommandClassSpecification loadDefaultSpecification() throws IOException, XmlConvertionException{
        Document doc;

        ClassLoader classLoader = JWaveCommandClassSpecification.class.getClassLoader();
        Reader reader = new InputStreamReader(classLoader.getResourceAsStream(DEFAULT_SPEC_FILENAME));

        doc = XmlUtils.loadXml(reader);
        return new JWaveCommandClassSpecification(doc);
    }
}



