/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package java.lang;

import java.util.Properties;

/**
 * A class encoding all hardcoded system property values on Android. A compiler may
 * take advantage of these properties. Changing them at load-time (-D) or runtime
 * may not have any effect.
 *
 * @hide
 */
final class AndroidHardcodedSystemProperties {

    final static String[][] STATIC_PROPERTIES = {
        // None of these four are meaningful on Android, but these keys are guaranteed
        // to be present for System.getProperty. For java.class.version, we use the maximum
        // class file version that dx currently supports.
        { "java.class.version", "50.0" },
        { "java.compiler", "" },
        { "java.ext.dirs", "" },

        { "java.specification.name", "Dalvik Core Library" },
        { "java.specification.vendor", "The Android Project" },
        { "java.specification.version", "0.9" },

        { "java.vendor", "The Android Project" },
        { "java.vendor.url", "http://www.android.com/" },
        { "java.vm.name", "Dalvik" },
        { "java.vm.specification.name", "Dalvik Virtual Machine Specification" },
        { "java.vm.specification.vendor", "The Android Project" },
        { "java.vm.specification.version", "0.9" },
        { "java.vm.vendor", "The Android Project" },

        { "java.vm.vendor.url", "http://www.android.com/" },

        { "java.runtime.name", "Android Runtime" },
        { "java.runtime.version", "0.9" },

        { "java.net.preferIPv6Addresses", "false" },

        { "file.encoding", "UTF-8" },

        { "file.separator", "/" },
        { "line.separator", "\n" },
        { "path.separator", ":" }
    };
}

