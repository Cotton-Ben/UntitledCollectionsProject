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

package net.openhft.collect.map;

import net.openhft.collect.*;
import net.openhft.function.*;
import org.jetbrains.annotations.Nullable;

import java.util.Map;


/**
 * Immutable factory
 */
public interface CharShortMapFactory/*<>*/ {

    /* define p1 */
    /* if obj key obj value //<K2 extends K, V2 extends V>// elif obj key //<K2 extends K>
    // elif obj value //<V2 extends V>// endif */
    /* enddefine */

    /* define p2 */
    /* if obj key obj value //<K2, V2>// elif obj key //<K2>// elif obj value //<V2>// endif */
    /* enddefine */

    /* define ek */
    /* if obj key //? extends K2// elif !(obj key) //Character// endif */
    /* enddefine */

    /* define ev */
    /* if obj value //? extends V2// elif !(obj value) //Short// endif */
    /* enddefine */

    /* define ep //<// ek //, // ev //>// enddefine */

    /* define pk *//* if !(obj key) //char// elif obj key //K2// endif *//* enddefine */
    /* define pv *//* if !(obj value) //short// elif obj value //V2// endif *//* enddefine */

    /* define gk *//* if !(obj key) //Character// elif obj key //K2// endif *//* enddefine */
    /* define gv *//* if !(obj value) //Short// elif obj value //V2// endif *//* enddefine */


    /* if obj key */
    @Nullable Equivalence<Character> getKeyEquivalence();
    /* endif */

    /* if obj value */
    @Nullable Equivalence<Short> getValueEquivalence();

    <VE> CharShortMapFactory</* if obj key */Character, /* endif */VE>
    withValueEquivalence(@Nullable Equivalence<VE> valueEquivalence);

    /* elif !(obj value) */
    short getDefaultValue();

    /**
     * @see CharShortMap#defaultValue()
     */
    CharShortMapFactory/*<>*/ withDefaultValue(short defaultValue);
    /* endif */

    /*p1*/ CharShortMap/*p2*/ newMutableMap();

    /*p1*/ CharShortMap/*p2*/ newMutableMap(int expectedSize);

    /* with Mutable|Immutable mutability */
    /*p1*/ CharShortMap/*p2*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map);

    /* if obj key */
    /**
     * If the specified map has the same key equivalence with this factory,
     * {@code expectedSize} is ignored.
     */
    /*p1*/ CharShortMap/*p2*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map, int expectedSize);
    /* endif */

    /*p1*/ CharShortMap/*p2*/ newMutableMap(
            Consumer</*f*/CharShortConsumer/*p2*/> entriesSupplier);

    /*p1*/ CharShortMap/*p2*/ newMutableMap(
            Consumer</*f*/CharShortConsumer/*p2*/> entriesSupplier, int expectedSize);

    /*p1*/ CharShortMap/*p2*/ newMutableMap(/*pk*/char/**/[] keys, /*pv*/short/**/[] values);

    /*p1*/ CharShortMap/*p2*/ newMutableMap(/*pk*/char/**/[] keys, /*pv*/short/**/[] values,
            int expectedSize);

    /* if !(obj key obj value) */
    /*p1*/ CharShortMap/*p2*/ newMutableMap(/*gk*/Character/**/[] keys, /*gv*/Short/**/[] values);

    /*p1*/ CharShortMap/*p2*/ newMutableMap(/*gk*/Character/**/[] keys, /*gv*/Short/**/[] values,
            int expectedSize);
    /* endif */

    /*p1*/ CharShortMap/*p2*/ newMutableMap(Iterable</*ek*/Character/**/> keys,
            Iterable</*ev*/Short/**/> values);

    /*p1*/ CharShortMap/*p2*/ newMutableMap(Iterable</*ek*/Character/**/> keys,
            Iterable</*ev*/Short/**/> values, int expectedSize);


    /*p1*/ CharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1);

    /*p1*/ CharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1,
            /*pk*/char/**/ k2, /*pv*/short/**/ v2);

    /*p1*/ CharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1,
            /*pk*/char/**/ k2, /*pv*/short/**/ v2, /*pk*/char/**/ k3, /*pv*/short/**/ v3);

    /*p1*/ CharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1,
            /*pk*/char/**/ k2, /*pv*/short/**/ v2, /*pk*/char/**/ k3, /*pv*/short/**/ v3,
            /*pk*/char/**/ k4, /*pv*/short/**/ v4);

    /*p1*/ CharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1,
            /*pk*/char/**/ k2, /*pv*/short/**/ v2, /*pk*/char/**/ k3, /*pv*/short/**/ v3,
            /*pk*/char/**/ k4, /*pv*/short/**/ v4, /*pk*/char/**/ k5, /*pv*/short/**/ v5);
    /* endwith */
}
