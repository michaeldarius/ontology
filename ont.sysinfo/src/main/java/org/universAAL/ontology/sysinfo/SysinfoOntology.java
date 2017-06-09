/*
	Copyright 2008-2014 ITACA-TSB, http://www.tsb.upv.es
	Instituto Tecnologico de Aplicaciones de Comunicacion 
	Avanzadas - Grupo Tecnologias para la Salud y el 
	Bienestar (TSB)
	
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package org.universAAL.ontology.sysinfo;

import org.universAAL.middleware.owl.DataRepOntology;
import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.MergedRestriction;
import org.universAAL.middleware.owl.OntClassInfoSetup;
import org.universAAL.middleware.owl.Ontology;
import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.middleware.service.owl.ServiceBusOntology;
import org.universAAL.ontology.SysinfoFactory;
import org.universAAL.ontology.location.LocationOntology;

/**
 * This class provides the main representation of the sysinfo ontology for the
 * universAAL platform.
 * 
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public final class SysinfoOntology extends Ontology {

	private static SysinfoFactory factory = new SysinfoFactory();
	public static final String NAMESPACE = "http://ontology.universAAL.org/SysInfo#";

	public SysinfoOntology() {
		super(NAMESPACE);
	}

	public void create() {
		Resource r = getInfo();
		r.setResourceComment("");
		r.setResourceLabel("sysinfo");
		addImport(DataRepOntology.NAMESPACE);
		addImport(ServiceBusOntology.NAMESPACE);
		addImport(LocationOntology.NAMESPACE);

		// ******* Declaration of regular classes of the ontology ******* //
		OntClassInfoSetup oci_AALSpaceDescriptor = createNewOntClassInfo(AALSpaceDescriptor.MY_URI, factory, 0);
		OntClassInfoSetup oci_AALSpaceStatus = createNewOntClassInfo(AALSpaceStatusDescriptor.MY_URI, factory, 1);
		OntClassInfoSetup oci_Descriptor = createNewOntClassInfo(Descriptor.MY_URI, factory, 2);
		OntClassInfoSetup oci_PeerCard = createNewOntClassInfo(PeerCardDescriptor.MY_URI, factory, 3);
		OntClassInfoSetup oci_System = createNewOntClassInfo(SystemInfo.MY_URI, factory, 4);

		// ******* Add content to regular classes of the ontology ******* //
		oci_AALSpaceDescriptor.setResourceComment("");
		oci_AALSpaceDescriptor.setResourceLabel("AALSpaceDescriptor");
		oci_AALSpaceDescriptor.addSuperClass(Descriptor.MY_URI);

		oci_AALSpaceStatus.setResourceComment("");
		oci_AALSpaceStatus.setResourceLabel("AALSpaceStatusDescriptor");
		oci_AALSpaceStatus.addSuperClass(Descriptor.MY_URI);

		oci_Descriptor.setResourceComment("");
		oci_Descriptor.setResourceLabel("Descriptor");
		oci_Descriptor.addSuperClass(ManagedIndividual.MY_URI);
		oci_Descriptor.addDatatypeProperty(Descriptor.PROP__SERIALIZED_VALUE).setFunctional();
		oci_Descriptor.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				Descriptor.PROP__SERIALIZED_VALUE, TypeMapper.getDatatypeURI(String.class), 1, 1));

		oci_PeerCard.setResourceComment("");
		oci_PeerCard.setResourceLabel("PeerCardDescriptor");
		oci_PeerCard.addSuperClass(Descriptor.MY_URI);

		oci_System.setResourceComment("");
		oci_System.setResourceLabel("SystemInfo");
		oci_System.addSuperClass(ManagedIndividual.MY_URI);
		oci_System.addObjectProperty(SystemInfo.PROP_SPACE_CHANGED).setFunctional();
		oci_System.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(
				SystemInfo.PROP_SPACE_CHANGED, AALSpaceStatusDescriptor.MY_URI, 1, 1));
		oci_System.addObjectProperty(SystemInfo.PROP_SPACE_JOINED).setFunctional();
		oci_System.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(SystemInfo.PROP_SPACE_JOINED,
				AALSpaceDescriptor.MY_URI, 1, 1));
		oci_System.addObjectProperty(SystemInfo.PROP_PEER_JOINED).setFunctional();
		oci_System.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(SystemInfo.PROP_PEER_JOINED,
				PeerCardDescriptor.MY_URI, 1, 1));
		oci_System.addObjectProperty(SystemInfo.PROP_SPACE_LOST).setFunctional();
		oci_System.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(SystemInfo.PROP_SPACE_LOST,
				AALSpaceDescriptor.MY_URI, 1, 1));
		oci_System.addObjectProperty(SystemInfo.PROP_PEER_LOST).setFunctional();
		oci_System.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(SystemInfo.PROP_PEER_LOST,
				PeerCardDescriptor.MY_URI, 1, 1));
		oci_System.addDatatypeProperty(SystemInfo.PROP_ALIVE);
		oci_System.addRestriction(MergedRestriction.getAllValuesRestrictionWithCardinality(SystemInfo.PROP_ALIVE,
				TypeMapper.getDatatypeURI(Boolean.class), 0, 1));

	}
}
