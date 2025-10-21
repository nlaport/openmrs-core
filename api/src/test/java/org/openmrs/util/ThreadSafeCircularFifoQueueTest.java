/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.util;

import java.io.IOException;
import java.util.Queue;

import org.apache.commons.collections4.queue.AbstractQueueTest;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the {@link ThreadSafeCircularFifoQueue} class
 * 
 * This class uses the tests from Apache Commons Collections for Queues to ensure the correctness of the implementation
 * @param <E>
 */
public class ThreadSafeCircularFifoQueueTest<E> extends AbstractQueueTest<E> {
	// TODO We should add some tests related to concurrent access

	public ThreadSafeCircularFifoQueueTest(String testName) {
		super(testName);
	}

	/* Configuration */
	
	@Override
	public boolean isFailFastSupported() {
		return false;
	}

	@Override
	public boolean isNullSupported() {
		return false;
	}

	// NB This is marked as false not because we don't support serialization, but because we don't provide the artefacts
	// needed for these tests
	@Override
	public boolean isTestSerialization() {
		return false;
	}

	@Override
	public Queue<E> makeObject() {
		return new ThreadSafeCircularFifoQueue<>(100);
	}

	/* Test overrides */
	/* included here to allow running individual test cases */

	
	@Test
	public void testQueueOffer() {
		super.testQueueOffer();
	}

	
	@Test
	public void testQueueElement() {
		super.testQueueElement();
	}

	
	@Test
	public void testQueuePeek() {
		super.testQueuePeek();
	}

	
	@Test
	public void testQueueRemove() {
		super.testQueueRemove();
	}

	
	@Test
	public void testQueuePoll() {
		super.testQueuePoll();
	}

	
	@Test
	public void testEmptyQueueSerialization() throws IOException, ClassNotFoundException {
		super.testEmptyQueueSerialization();
	}

	
	@Test
	public void testFullQueueSerialization() throws IOException, ClassNotFoundException {
		super.testFullQueueSerialization();
	}

	
	@Test
	public void testEmptyQueueCompatibility() throws IOException, ClassNotFoundException {
		super.testEmptyQueueCompatibility();
	}

	
	@Test
	public void testFullQueueCompatibility() throws IOException, ClassNotFoundException {
		super.testFullQueueCompatibility();
	}

	
	@Test
	public void testCollectionAdd() {
		super.testCollectionAdd();
	}

	
	@Test
	public void testCollectionAddAll() {
		super.testCollectionAddAll();
	}

	
	@Test
	public void testUnsupportedAdd() {
		super.testUnsupportedAdd();
	}

	
	@Test
	public void testCollectionClear() {
		super.testCollectionClear();
	}

	
	@Test
	public void testCollectionContains() {
		super.testCollectionContains();
	}

	
	@Test
	public void testCollectionContainsAll() {
		super.testCollectionContainsAll();
	}

	
	@Test
	public void testCollectionIsEmpty() {
		super.testCollectionIsEmpty();
	}

	
	@Test
	public void testCollectionIterator() {
		super.testCollectionIterator();
	}

	
	@Test
	public void testCollectionIteratorRemove() {
		super.testCollectionIteratorRemove();
	}

	
	@Test
	public void testCollectionRemove() {
		super.testCollectionRemove();
	}

	
	@Test
	public void testCollectionRemoveAll() {
		super.testCollectionRemoveAll();
	}

	
	@Test
	public void testCollectionRemoveIf() {
		super.testCollectionRemoveIf();
	}

	
	@Test
	public void testCollectionRetainAll() {
		super.testCollectionRetainAll();
	}

	
	@Test
	public void testCollectionSize() {
		super.testCollectionSize();
	}

	
	@Test
	public void testCollectionToArray() {
		super.testCollectionToArray();
	}

	
	@Test
	public void testCollectionToArray2() {
		super.testCollectionToArray2();
	}

	
	@Test
	public void testCollectionToString() {
		super.testCollectionToString();
	}

	
	@Test
	public void testObjectEqualsSelf() {
		super.testObjectEqualsSelf();
	}

	
	@Test
	public void testEqualsNull() {
		super.testEqualsNull();
	}

	
	@Test
	public void testObjectHashCodeEqualsSelfHashCode() {
		super.testObjectHashCodeEqualsSelfHashCode();
	}

	
	@Test
	public void testObjectHashCodeEqualsContract() {
		super.testObjectHashCodeEqualsContract();
	}

	
	@Test
	public void testSimpleSerialization() throws Exception {
		super.testSimpleSerialization();
	}

	
	@Test
	public void testCanonicalEmptyCollectionExists() {
		super.testCanonicalEmptyCollectionExists();
	}

	
	@Test
	public void testCanonicalFullCollectionExists() {
		super.testCanonicalFullCollectionExists();
	}
}
