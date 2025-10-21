/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.propertyeditor;

import org.openmrs.ProgramWorkflowState;
import org.openmrs.api.ProgramWorkflowService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProgramWorkflowStateEditorTest extends BasePropertyEditorTest<ProgramWorkflowState, ProgramWorkflowStateEditor> {

	static final String EXISTING_UUID = System.getenv("EXISTING_UUID");

	
	@Autowired
	ProgramWorkflowService programWorkflowService;
	
	@Override
	protected ProgramWorkflowStateEditor getNewEditor() {
		return new ProgramWorkflowStateEditor();
	}
	
	@Override
	protected ProgramWorkflowState getExistingObject() {
		return programWorkflowService.getStateByUuid(EXISTING_UUID);
	}
}
