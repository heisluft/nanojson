/*
 * Copyright 2011 The nanojson Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.grack.nanojson;

import java.util.Collection;
import java.util.Map;

/**
 * Common interface for {@link JsonAppendableWriter}, {@link JsonStringWriter} and {@link JsonBuilder}.
 *
 * @param <SELF>
 *            A subclass of {@link JsonSink}.
 */
public interface JsonSink<SELF extends JsonSink<SELF>> {
	/**
	 * Emits the start of an array.
	 *
	 * @param c the collection to be emitted
	 * @return this
	 */
	SELF array(Collection<?> c);

	/**
	 * Emits the start of an array with a key.
	 *
	 * @param c the collection to be emitted
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF array(String key, Collection<?> c);
	
	/**
	 * Emits the start of an object.
	 *
	 * @param map the map to be emitted
	 * @return this
	 */
	SELF object(Map<?, ?> map);

	/**
	 * Emits the start of an object with a key.
	 *
	 * @param key the key for the emitted entry
	 * @param map the map to be emitted
	 * @return this
	 */
	SELF object(String key, Map<?, ?> map);

	/**
	 * Emits a 'null' token.
	 *
	 * @return this
	 */
	SELF nul();

	/**
	 * Emits a 'null' token with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF nul(String key);

	/**
	 * Emits an object if it is a JSON-compatible type, otherwise throws an exception.
	 *
	 * @param o the object to be emitted
	 * @return this
	 */
	SELF value(Object o);

	/**
	 * Emits an object with a key if it is a JSON-compatible type, otherwise throws an exception.
	 *
	 * @param key the key for the emitted entry
	 * @param o the object to be emitted
	 * @return this
	 */
	SELF value(String key, Object o);

	/**
	 * Emits a string value (or null).
	 *
	 * @return this
	 */
	SELF value(String s);

	/**
	 * Emits an integer value.
	 *
	 * @return this
	 */
	SELF value(int i);

	/**
	 * Emits a long value.
	 *
	 * @return this
	 */
	SELF value(long l);

	/**
	 * Emits a boolean value.
	 *
	 * @return this
	 */
	SELF value(boolean b);

	/**
	 * Emits a double value.
	 *
	 * @return this
	 */
	SELF value(double d);

	/**
	 * Emits a float value.
	 *
	 * @return this
	 */
	SELF value(float f);

	/**
	 * Emits a {@link Number} value.
	 *
	 * @return this
	 */
	SELF value(Number n);

	/**
	 * Emits a string value (or null) with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF value(String key, String s);

	/**
	 * Emits an integer value with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF value(String key, int i);
	
	/**
	 * Emits a long value with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF value(String key, long l);

	/**
	 * Emits a boolean value with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF value(String key, boolean b);

	/**
	 * Emits a double value with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF value(String key, double d);

	/**
	 * Emits a float value with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF value(String key, float f);

	/**
	 * Emits a {@link Number} value with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF value(String key, Number n);

	/**
	 * Starts an array.
	 *
	 * @return this
	 */
	SELF array();

	/**
	 * Starts an object.
	 *
	 * @return this
	 */
	SELF object();

	/**
	 * Starts an array within an object, prefixed with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF array(String key);

	/**
	 * Starts an object within an object, prefixed with a key.
	 *
	 * @param key the key for the emitted entry
	 * @return this
	 */
	SELF object(String key);

	/**
	 * Ends the current array or object.
	 *
	 * @return this
	 */
	SELF end();

	/**
	 * Writes the key of a key/value pair.
	 *
	 * @param key the key to emit
	 * @return this
	 */
	SELF key(String key);
}
