/*******************************************************************************
 * Copyright 2016 Universidad Politécnica de Madrid UPM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.cryptographic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ontological representation of MultidestinationEncryptedResource in the
 * cryptographic ontology. Methods included in this class are the mandatory ones
 * for representing an ontological concept in Java classes for the universAAL
 * platform. In addition getters and setters for properties are included.
 *
 * @author
 * @author Generated by the OntologyUML2Java transformation of universAAL Studio
 */
public class MultidestinationEncryptedResource extends EncryptedResource {
	public static final String MY_URI = CryptographicOntology.NAMESPACE + "MultidestinationEncryptedResource";
	public static final String PROP_DESTINATARIES = CryptographicOntology.NAMESPACE + "destinataries";

	public MultidestinationEncryptedResource() {
		super();
	}

	public MultidestinationEncryptedResource(String uri) {
		super(uri);
	}

	public String getClassURI() {
		return MY_URI;
	}

	public int getPropSerializationType(String propURI) {
		if (PROP_DESTINATARIES.equals(propURI))
			return PROP_SERIALIZATION_FULL;
		return super.getPropSerializationType(propURI);
	}

	public boolean isWellFormed() {
		return super.isWellFormed() && hasProperty(PROP_DESTINATARIES);
	}

	public void addDestinatary(DestinataryEncryptedSessionKey desk) {
		Object current = getProperty(PROP_DESTINATARIES);
		if (current == null) {
			setProperty(PROP_DESTINATARIES, desk);
		} else if (current instanceof DestinataryEncryptedSessionKey) {
			ArrayList ndesk = new ArrayList();
			ndesk.add(current);
			ndesk.add(desk);
			changeProperty(PROP_DESTINATARIES, ndesk);
		} else if (current instanceof List) {
			((List) current).add(desk);
			changeProperty(PROP_DESTINATARIES, current);
		}
	}

	public List getDestinataries() {
		Object current = getProperty(PROP_DESTINATARIES);
		if (current instanceof DestinataryEncryptedSessionKey) {
			ArrayList ndesk = new ArrayList();
			ndesk.add(current);
			return ndesk;
		} else if (current instanceof List) {
			return (List) current;
		}
		return Collections.EMPTY_LIST;
	}

}
