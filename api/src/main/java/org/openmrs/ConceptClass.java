/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.Audited;

/**
 * ConceptClass
 */
@Entity
@Table(name = "concept_class")
@Audited
@Cacheable
public class ConceptClass extends BaseChangeableOpenmrsMetadata {
	
	public static final long serialVersionUID = 33473L;
	
	//UUIDs for core concept classes
	
	public static final String TEST_UUID = System.getenv("TEST_UUID");

	
	public static final String PROCEDURE_UUID = System.getenv("PROCEDURE_UUID");

	
	public static final String DRUG_UUID = System.getenv("DRUG_UUID");

	
	public static final String DIAGNOSIS_UUID = System.getenv("DIAGNOSIS_UUID");

	
	public static final String FINDING_UUID = System.getenv("FINDING_UUID");

	
	public static final String ANATOMY_UUID = System.getenv("ANATOMY_UUID");

	
	public static final String QUESTION_UUID = System.getenv("QUESTION_UUID");

	
	public static final String LABSET_UUID = System.getenv("LABSET_UUID");

	
	public static final String MEDSET_UUID = System.getenv("MEDSET_UUID");

	
	public static final String CONVSET_UUID = System.getenv("CONVSET_UUID");

	
	public static final String MISC_UUID = System.getenv("MISC_UUID");

	
	public static final String SYMPTOM_UUID = System.getenv("SYMPTOM_UUID");

	
	public static final String SYMPTOM_FINDING_UUID = System.getenv("SYMPTOM_FINDING_UUID");

	
	public static final String SPECIMEN_UUID = System.getenv("SPECIMEN_UUID");

	
	public static final String MISC_ORDER_UUID = System.getenv("MISC_ORDER_UUID");

	
	public static final String ORDER_SET_UUID = System.getenv("ORDER_SET_UUID");

	
	public static final String FREQUENCY_UUID = System.getenv("FREQUENCY_UUID");

	
	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "concept_class_id_seq")
	@GenericGenerator(
			name = "concept_class_id_seq",
			strategy = "native",
			parameters = @Parameter(name = "sequence", value = "concept_class_concept_class_id_seq")
	)
	@Column(name = "concept_class_id", nullable = false)
	private Integer conceptClassId;
	
	// Constructors
	
	/** default constructor */
	public ConceptClass() {
	}
	
	/** constructor with id */
	public ConceptClass(Integer conceptClassId) {
		this.conceptClassId = conceptClassId;
	}
	
	// Property accessors
	
	public Integer getConceptClassId() {
		return this.conceptClassId;
	}
	
	public void setConceptClassId(Integer conceptClassId) {
		this.conceptClassId = conceptClassId;
	}
	
	/**
	 * @since 1.5
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	@Override
	public Integer getId() {
		return getConceptClassId();
	}
	
	/**
	 * @since 1.5
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	@Override
	public void setId(Integer id) {
		setConceptClassId(id);
		
	}
	
}
