/* with
 char|byte|short|int|long|float|double|obj key
 short|byte|char|int|long|float|double|obj value
*/
/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.openhft.collect.impl;

import net.openhft.collect.map.CharShortMap;


public interface InternalCharShortMapOps/*<>*/
        extends CharShortMap/*<>*/, InternalMapOps<Character, Short> {

    boolean containsEntry(/* raw */char key, /* raw */short value);

    void justPut(char key, short value);

    /* if float|double key || float|double value */
    boolean containsEntry(/* bits *//* raw */char key, /* bits *//* raw */short value);

    void justPut(/* bits */char key, /* bits */short value);
    /* endif */

    boolean allEntriesContainingIn(InternalCharShortMapOps/*<?>*/ map);

    void reversePutAllTo(InternalCharShortMapOps/*<super>*/ map);
}
