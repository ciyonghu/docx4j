package org.docx4j.openpackaging.io;

import java.io.IOException;
import java.io.InputStream;

public interface PartStore {
	
	public boolean partExists(String partName);
	
	public InputStream getInputStreamForPart(String partName) throws IOException;
	
}